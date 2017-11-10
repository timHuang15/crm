/**
 * @项目名称: tocean-service-oss
 * @包目录: com.tocean.oss.common.base.baseObject.utils
 * @Date: 2017年10月18日
 */
package com.tocean.crm.common.base.baseObject.utils;

/**
 *
 * 注释
 *
 * @author alan.yan
 * @since 2017年10月18日
 */

import java.io.Serializable;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 *   字符串类
 *
 */
public class StringUtil implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 获得随机UUID(44位) 公司专用，已经加入了12位日期，方便跟踪
     *
     * @return UUID字符串
     */
    public static String getUuid() {
        return new SimpleDateFormat("yyyyMMddhhmm").format(new Date()) + (UUID.randomUUID()).toString().replaceAll("-", "").toUpperCase();
    }
    /**
     * Return only number characters of String
     *
     * @param string
     * @return
     */
    public static String getOnlyIntegerNumbers(String string) {
        return string.replaceAll("([^0-9])", "");
    }

}
