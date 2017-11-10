package com.tocean.crm.controller;

import com.tocean.crm.common.base.baseObject.Response;
import com.tocean.crm.entity.Student;
import com.tocean.crm.entity.StudentInfo;
import com.tocean.crm.entity.StudentViolation;
import com.tocean.crm.service.StudentInfoService;
import com.tocean.crm.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
/**
 * Created by Administrator on 2017/11/9.
 */
@RestController
@Slf4j
@RequestMapping(value = "/student")
public class StudentInfoController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentInfoService studentInfoService;

    @GetMapping(value="/api/info/list")
    public Response profile(HttpServletRequest request){
        try{
            String loginName = request.getHeader("userId");
            Student student = studentService.findByLoginName(loginName);
            StudentInfo list = studentInfoService.findByStudentId(student.getId());

            return Response.ok(list);
        } catch (Exception e) {
            return Response.fail(e.getMessage());
        }
    }
}
