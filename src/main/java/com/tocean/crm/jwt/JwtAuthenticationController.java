package com.tocean.crm.jwt;

import com.tocean.crm.common.base.baseObject.Response;
import com.tocean.crm.common.base.baseObject.utils.MD5Util;
import com.tocean.crm.entity.Student;
import com.tocean.crm.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.tocean.crm.jwt.JwtUtil.TOKEN_PREFIX;

/*
	https://auth0.com/blog/securing-spring-boot-with-jwts/
	https://github.com/auth0-blog/spring-boot-jwts
	https://github.com/szerhusenBC/jwt-spring-security-demo
*/
	

@RestController
@Slf4j
@RequestMapping(value = "/student")
public class JwtAuthenticationController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/api/protected")
    public @ResponseBody Object hellWorld() {
        return "Hello World! This is a protected api";
    }

    @PostMapping("/login")
    public Response login(@RequestBody final AccountCredentials credentials) throws IOException {

        if(validCredentials(credentials)) { //校验成功，生成token
            String jwt = JwtUtil.generateToken(credentials.username);
            return Response.ok(TOKEN_PREFIX + " " + jwt);
        }else {
            return Response.fail(HttpServletResponse.SC_UNAUTHORIZED+" : "+ " invalid username or password!");
        }
    }

    /**
     * 校验用户名和密码对不对
     * @param credentials
     * @return
     */
    private boolean validCredentials(AccountCredentials credentials) {
        Student student = studentService.findByLoginName(credentials.username);
        if(student!=null && credentials.password!=null){
            if(MD5Util.getMD5(credentials.password).equals(student.getPassword())) {
                return true;
            }
        }
        return false;

    }


    public static class AccountCredentials {
        public String username;
        public String password;
    }

}