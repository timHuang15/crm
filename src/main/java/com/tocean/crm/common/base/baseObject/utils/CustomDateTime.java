/**
 * @项目名称: tocean-common
 * @包目录: com.tocean.common.utils
 * @Date: 2017年10月14日
 */
package com.tocean.crm.common.base.baseObject.utils;

/**
 * 注释
 *
 * @author alan.yan
 * @since 2017年10月14日
 */


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description 自定义返回JSON 数据格中日期格式化处理
 * @author aokunsang
 * @date 2013-5-28
 */
public class CustomDateTime extends JsonSerializer<Date> {

    @Override
    public void serialize(Date value,
                          JsonGenerator jsonGenerator,
                          SerializerProvider provider)
            throws IOException, JsonProcessingException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        jsonGenerator.writeString(sdf.format(value));
    }
}