package com.tocean.crm.common.base.listener;


import com.tocean.crm.common.base.baseObject.BaseEntity;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.sql.Timestamp;

/**
 * 提供主核心表进行用户操作轨迹记录。这里不提供vip之类的帐号操作
 *
 * @author alan.yan
 * @since 2016年8月29日
 *
 */
public class BaseEntityListener {
    @PrePersist
    public void prePersist(BaseEntity entity) {
        /**
         * 创建人,修改人都赋上当前的日期
         */
        Timestamp ts = new Timestamp(System.currentTimeMillis());
/*        entity.setCreateman(StringUtil.getUuid());
        entity.setCreatetime(ts);
        entity.setEditman(StringUtil.getUuid());
        entity.setEdittime(ts);*/
    }

    /**
     * 更改数据时,对修改人及修改时间进行更新,当发生update时确发
     * @param entity
     */
    @PreUpdate
    public void preUpdate(BaseEntity entity) {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        /*entity.setEdittime(ts);
        entity.setEditman(StringUtil.getUuid());*/

    }

}
