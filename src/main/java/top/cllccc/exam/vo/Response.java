package top.cllccc.exam.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>通用的相应对象</h1>
 * @Author: CCC
 * @Date ${DATE} ${TIME}
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    /** 错误码，正确返回空*/
    private  String errorCode = "00000";

    /** 错误信息，正确返回空字符串 */
    private String errorMsg = "请求成功";

    /** 返回对象值*/
    private Object data;

    /**
     * <h2>正确的响应构造函数</h2>
     * @param data 返回值对象
     */
    public Response(Object data){
        this.data = data;
    }

}
