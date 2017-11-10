package com.tocean.crm.service;

import com.tocean.crm.entity.StudentAttendance;

import java.util.List;

/**
 * Created by Administrator on 2017/11/10.
 */
public interface StudentAttendanceService {
    public List<StudentAttendance> findByStudentId(String studentId);
}
