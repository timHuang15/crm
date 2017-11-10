package com.tocean.crm.service.impl;

import com.tocean.crm.dao.StudentInfoDao;
import com.tocean.crm.entity.StudentInfo;
import com.tocean.crm.service.StudentInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/9.
 */
@Service("StudentInfoService")
@Slf4j
public class StudentInfoServiceImpl implements StudentInfoService {
        @Autowired
        private StudentInfoDao studentInfoDao;
        @Override
        public StudentInfo findByStudentId(String studentId) {
               /* return studentInfoDao.findById(studentId);*/
                StudentInfo studentInfo = studentInfoDao.findOne(studentId);
                return studentInfo;
        }
}
