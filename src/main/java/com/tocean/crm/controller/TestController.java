package com.tocean.crm.controller;

import com.tocean.crm.common.base.baseObject.Response;
import com.tocean.crm.entity.Test;
import com.tocean.crm.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by Administrator on 2017/9/11.
 */

@RestController
@Slf4j
@RequestMapping(value = "/oss/Test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping(value="/findAll")
    public Response findAll(){
        try{
            Response<List<Test>>  tests = this.testService.findAll();
            return Response.ok(tests);
        } catch (Exception e) {
            return Response.fail(e.getMessage());
        }
    }

}
