package com.tocean.crm.service.impl;

import com.tocean.crm.dao.StudentPariseDao;
import com.tocean.crm.entity.StudentPraise;
import com.tocean.crm.service.StudentPariseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
@Service("StudentPariseService")
@Slf4j
public class StudentPariseServiceImpl implements StudentPariseService {

    @Autowired
    private StudentPariseDao studentPariseDao;

    @Override
    public List<StudentPraise> findByStudentId(String studnetId) {
        return studentPariseDao.findByStudentId(studnetId);
    }
}
