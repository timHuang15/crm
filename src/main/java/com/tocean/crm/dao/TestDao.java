/**
 * @项目名称: tocean-service-oss
 * @包目录: com.tocean.oss.dao
 * @Date: 2017年10月18日
 */
package com.tocean.crm.dao;


import com.tocean.crm.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 注释
 *
 * @author alan.yan
 * @since 2017年10月18日
 */

public interface TestDao extends JpaRepository<Test, String> {
}
