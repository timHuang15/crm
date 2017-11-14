package com.tocean.crm.dao;

import com.tocean.crm.entity.StudentPraise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
public interface StudentPariseDao extends JpaRepository<StudentPraise,String> {
    public List<StudentPraise> findByStudentId(String studentId);
}
