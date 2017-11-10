package com.tocean.crm.dao;

import com.tocean.crm.entity.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/11/9.
 */
public interface StudentInfoDao extends JpaRepository<StudentInfo,String>{
    /*public List<StudentInfo> findById(String studentId);*/
}
