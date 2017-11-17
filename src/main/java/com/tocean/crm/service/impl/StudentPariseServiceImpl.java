package com.tocean.crm.service.impl;

import com.tocean.crm.dao.StudentInfoDao;
import com.tocean.crm.dao.StudentPariseDao;
import com.tocean.crm.entity.StudentInfo;
import com.tocean.crm.entity.StudentPraise;
import com.tocean.crm.service.StudentPariseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
@Service("StudentPariseService")
@Slf4j
public class StudentPariseServiceImpl implements StudentPariseService {

    @Autowired
    private StudentPariseDao studentPariseDao;
    @Autowired
    private StudentInfoDao studentInfoDao;

    @Override
    public List<StudentPraise> findByStudentId(String studnetId) {
        List<StudentPraise> studentPraiseList = studentPariseDao.findByStudentId(studnetId);
        List<StudentPraise> studentPraises = new ArrayList<>();
        for(StudentPraise studentPraise : studentPraiseList){

            StudentInfo studentInfo = studentInfoDao.findOne(studentPraise.getStudentId());

            studentPraise.setStudentName(studentInfo.getStudentName());

            studentPraises.add(studentPraise);
        }
        return studentPraises;

    }
}
