/**
 * @项目名称: tocean-service-oss
 * @包目录: com.tocean.oss.common.base.baseObject
 * @Date: 2017年10月18日
 */
package com.tocean.crm.common.base.baseObject;

import lombok.Data;
/**
 *
 * 注释
 *
 * @author alan.yan
 * @since 2017年10月18日
 */
@Data
public class Response<T> {


    private String error;

    private T result;

    private boolean isSuccess ;

    public Response() {
    }

    public Response(String error) {
        this.error = error;
    }

    public Response(String error, T result,boolean isSuccess) {
        this.error = error;
        this.result = result;
        this.isSuccess = isSuccess;
    }

    public static <T> Response ok(T result){
        return new Response(null,result,true);
    }

    public static Response fail(String msg){
        return new Response(msg,null,false);
    }

}
