package com.tocean.crm.controller;

import com.tocean.crm.common.base.baseObject.Response;
import com.tocean.crm.entity.Student;
import com.tocean.crm.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by Administrator on 2017/9/11.
 */

@RestController
@Slf4j
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value="/api/profile")
    public Response profile(HttpServletRequest request){
        try{
            String loginName = request.getHeader("userId");
           Student student = studentService.findByLoginName(loginName);
            return Response.ok(student);
        } catch (Exception e) {
            return Response.fail(e.getMessage());
        }
    }

}
