package com.tocean.crm.service.impl;

import com.tocean.crm.dao.StudentViolationDao;
import com.tocean.crm.entity.StudentViolation;
import com.tocean.crm.service.StudentViolationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/9.
 */
@Service("StudentViolationService")
@Slf4j
public class StudentViolationServiceImpl implements StudentViolationService {
    @Autowired
    private StudentViolationDao studentViolationDao;
    @Override
    public List<StudentViolation> findByStudentId(String studentId) {
        return studentViolationDao.findByStudentId(studentId);
    }
}
