/**
 * @项目名称: tocean-service-oss
 * @包目录: com.tocean.oss
 * @Date: 2017年10月18日
 */
package com.tocean.crm;

import com.tocean.crm.jwt.JwtAuthenticationFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 *
 * oss服务提供
 *
 * @author alan.yan
 * @since 2017年10月18日
 */
@SpringBootApplication

public class OssApplication {

    public static void main(String[] args) {
        SpringApplication.run(OssApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean jwtFilter() {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        JwtAuthenticationFilter filter = new JwtAuthenticationFilter(
                "/student/api/**");
        registrationBean.setFilter(filter);
        return registrationBean;
    }
}
