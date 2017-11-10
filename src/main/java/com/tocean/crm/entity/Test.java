/**
 * @项目名称: tocean-service-oss
 * @包目录: com.tocean.oss.entity
 * @Date: 2017年10月18日
 */
package com.tocean.crm.entity;

/**
 *
 * 测试实体
 *
 * @author alan.yan
 * @since 2017年10月18日
 */

import com.tocean.crm.common.base.baseObject.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator on 2017/9/9.
 */
@Entity
@Data
@Table(name="test")
public class Test extends BaseEntity {




}
