/**
 * @项目名称: tocean-service-oss
 * @包目录: com.tocean.oss.service.impl
 * @Date: 2017年10月18日
 */
package com.tocean.crm.service.impl;

import com.google.common.base.Throwables;
import com.tocean.crm.common.base.baseObject.Response;
import com.tocean.crm.dao.TestDao;
import com.tocean.crm.entity.Test;
import com.tocean.crm.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author alan.yan
 * @since 2017年10月18日
 */

@Service("TestService")
@Slf4j
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    public Response<List<Test>> findAll() {
        try {
            List<Test> TestList = testDao.findAll();
            return Response.ok(TestList);
        } catch (Exception e) {
            log.error("find TestHistory by id failed,cause:{}", Throwables.getStackTraceAsString(e));
            return Response.fail("TestHistory.find.fail");
        }
    }

}