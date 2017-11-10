package com.tocean.crm.dao;

import com.tocean.crm.entity.StudentViolation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/11/9.
 */
public interface StudentViolationDao extends JpaRepository<StudentViolation, String> {

    public List<StudentViolation> findByStudentId(String studentId);
}
