/**
 * @项目名称: tocean-service-oss
 * @包目录: com.tocean.oss.dao
 * @Date: 2017年10月18日
 */
package com.tocean.crm.dao;


import com.tocean.crm.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * 注释
 *
 * @author alan.yan
 * @since 2017年10月18日
 */

public interface StudentDao extends JpaRepository<Student, String> {
    public Student findByLoginName(String loginName);

}
