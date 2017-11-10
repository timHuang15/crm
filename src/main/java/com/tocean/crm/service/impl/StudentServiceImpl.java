/**
 * @项目名称: tocean-service-oss
 * @包目录: com.tocean.oss.service.impl
 * @Date: 2017年10月18日
 */
package com.tocean.crm.service.impl;

import com.tocean.crm.dao.StudentDao;
import com.tocean.crm.entity.Student;
import com.tocean.crm.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author alan.yan
 * @since 2017年10月18日
 */

@Service("StudentService")
@Slf4j
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    /**
     * 查找学生
     * @return
     */
    public Student findById(String studentId) {
            Student student = studentDao.findOne(studentId);
            return student;
    }
    /**
     * 根据登录名查询学生
     *
     * @return 查询结果
     */
    public Student findByLoginName(String loginName){
        Student student = studentDao.findByLoginName(loginName);
        return student;
    }
    /**
     * 修改密码
     * @param studentId
     * @param newPassword
     * @return
     */
    public void updatePassword(String studentId, String newPassword){

            Student student = studentDao.findOne(studentId);
            student.setPassword(newPassword);
            studentDao.saveAndFlush(student);


    }

}