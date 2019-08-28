package top.cllccc.exam.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.cllccc.exam.constants.ResponseCode;

/**
 * <h1>通用的相应对象</h1>
 *
 * @Author: CCC
 * @Date ${DATE} ${TIME}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    /**
     * 错误码，正确返回空
     */
    private int Code = ResponseCode.SUCCESS.getCode();

    /**
     * 错误信息，正确返回空字符串
     */
    private String Message = ResponseCode.SUCCESS.getMessage();

    /**
     * 返回对象值
     */
    private Object data;

    /**
     * <h2>正确的响应构造函数</h2>
     *
     * @param data 返回值对象
     */
    public Response(Object data) {
        this.data = data;
    }

}
