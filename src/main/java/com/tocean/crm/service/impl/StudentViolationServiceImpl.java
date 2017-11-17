package com.tocean.crm.service.impl;

import com.tocean.crm.dao.StudentInfoDao;
import com.tocean.crm.dao.StudentViolationDao;
import com.tocean.crm.entity.StudentInfo;
import com.tocean.crm.entity.StudentViolation;
import com.tocean.crm.service.StudentViolationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/9.
 */
@Service("StudentViolationService")
@Slf4j
public class StudentViolationServiceImpl implements StudentViolationService {
    @Autowired
    private StudentViolationDao studentViolationDao;

    @Autowired
    private StudentInfoDao studentInfoDao;

    @Override
    public List<StudentViolation> findByStudentId(String studentId) {
        List<StudentViolation>studentViolationList = studentViolationDao.findByStudentId(studentId);
        List<StudentViolation> studentViolations = new ArrayList<>();
        for (StudentViolation studentViolation:studentViolationList) {
            StudentInfo studentInfo = studentInfoDao.findOne(studentViolation.getStudentId());
            studentViolation.setStudentName(studentInfo.getStudentName());
            studentViolations.add(studentViolation);
        }

        return studentViolations;
    }
}
