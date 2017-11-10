package com.tocean.crm.dao;

import com.tocean.crm.entity.StudentAttendance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/11/10.
 */
public interface StudentAttendanceDao extends JpaRepository<StudentAttendance, String>
{
    /*
    * 根据学生ID
    * 查看出勤情况
    * */
    public List<StudentAttendance> findByStudentId(String studentId);
}
