package com.tocean.crm.service;

import com.tocean.crm.entity.StudentInfo;

/**
 * Created by Administrator on 2017/11/9.
 */
public interface StudentInfoService {
    public StudentInfo findByStudentId(String studentId);
}
