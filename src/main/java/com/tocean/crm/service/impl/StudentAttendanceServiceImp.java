package com.tocean.crm.service.impl;

import com.tocean.crm.dao.StudentAttendanceDao;
import com.tocean.crm.dao.StudentInfoDao;
import com.tocean.crm.entity.StudentAttendance;
import com.tocean.crm.entity.StudentInfo;
import com.tocean.crm.service.StudentAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/10.
 */
@Service("StudentAttendanceService")
public class StudentAttendanceServiceImp implements StudentAttendanceService{
   @Autowired
   private StudentAttendanceDao studentAttendanceDao;

   @Autowired
   private StudentInfoDao studentInfoDao;

    @Override
    public List<StudentAttendance> findByStudentId(String studentId) {
        List<StudentAttendance> studentAttendanceList = studentAttendanceDao.findByStudentId(studentId);
        List<StudentAttendance> studentAttendances = new ArrayList<>();
        for (StudentAttendance studentAttendance:studentAttendanceList) {
            StudentInfo studentInfo = studentInfoDao.findOne(studentAttendance.getStudentId());
            studentAttendance.setStudentName(studentInfo.getStudentName());
            studentAttendances.add(studentAttendance);
        }

        return studentAttendances;
    }
}
