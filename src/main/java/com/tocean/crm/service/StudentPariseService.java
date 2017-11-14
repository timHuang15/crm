package com.tocean.crm.service;

import com.tocean.crm.entity.StudentPraise;

import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
public interface StudentPariseService {
    public List<StudentPraise> findByStudentId(String studnetId);
}
