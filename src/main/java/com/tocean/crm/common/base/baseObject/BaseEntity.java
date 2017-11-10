package com.tocean.crm.common.base.baseObject;


import com.tocean.crm.common.base.listener.BaseEntityListener;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;


/**
 * 如新业务表是操作的帐户是admin表的操作员，请继承这个类。
 * 实体的公共类,提供创建者,创建时间 ,编辑人,编辑时间几个通用的属性值变动
 * 系统提供二个基类，一个是vip会员为主导的，一类是公司内部员工为主导
 *
 * @author alan.yan
 * @since 2016年8月29日
 */
@EntityListeners({BaseEntityListener.class})
@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable{


    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id", unique = true, nullable = false, length = 64)
    private String id;//实体编号


}