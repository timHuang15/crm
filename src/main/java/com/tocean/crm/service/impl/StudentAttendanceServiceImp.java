package com.tocean.crm.service.impl;

import com.tocean.crm.dao.StudentAttendanceDao;
import com.tocean.crm.entity.StudentAttendance;
import com.tocean.crm.service.StudentAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/10.
 */
@Service("StudentAttendanceService")
public class StudentAttendanceServiceImp implements StudentAttendanceService{
   @Autowired
   private StudentAttendanceDao studentAttendanceDao;
    @Override
    public List<StudentAttendance> findByStudentId(String studentId) {
        return studentAttendanceDao.findByStudentId(studentId);
    }
}
