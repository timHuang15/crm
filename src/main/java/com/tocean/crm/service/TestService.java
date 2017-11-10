/**
 * @项目名称: tocean-service-oss
 * @包目录: com.tocean.oss.service.impl
 * @Date: 2017年10月18日
 */
package com.tocean.crm.service;


import com.tocean.crm.common.base.baseObject.Response;
import com.tocean.crm.entity.Test;

import java.util.List;
/**
 * 服务接口
 *
 * @author alan.yan
 * @since 2017年10月18日
 */

public interface TestService {

    /**
     * 查询所有结果
     *
     * @return 查询结果
     */
    Response<List<Test>> findAll();

    
}

