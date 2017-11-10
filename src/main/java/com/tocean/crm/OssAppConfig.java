/**
 * @项目名称: tocean-service-oss
 * @包目录: com.tocean.oss
 * @Date: 2017年10月18日
 */
package com.tocean.crm;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * 注释
 *
 * @author alan.yan
 * @since 2017年10月18日
 */
@Configuration
@ComponentScan(value = {
        "com.tocean.crm.entity"})
public class OssAppConfig extends WebMvcConfigurerAdapter {

}
