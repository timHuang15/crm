/**
 * @项目名称: tocean-service-oss
 * @包目录: com.tocean.oss.service.impl
 * @Date: 2017年10月18日
 */
package com.tocean.crm.service;


import com.tocean.crm.entity.Student;

/**
 * 服务接口
 *
 * @author alan.yan
 * @since 2017年10月18日
 */

public interface StudentService {

    /**
     * 根据id查询学生
     *
     * @return 查询结果
     */
    public Student findById(String studentId);

    /**
     * 根据登录名查询学生
     *
     * @return 查询结果
     */
    public Student findByLoginName(String loginName);

    /**
     * 修改密码
     * @param studentId
     * @param newPassword
     * @return
     */
    public void updatePassword(String studentId, String newPassword);

    
}

