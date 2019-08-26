package top.cllccc.exam.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.cllccc.exam.constants.ResponseCode;

/**
 * <h1>请求页面</h1>
 *
 * @Author: CCC
 * @Date 2019/8/19 11:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponsePage {

    /**
     * 错误码，正确返回空
     */
    private String responseCode = ResponseCode.SUCCESS.getCode();

    /**
     * 错误信息，正确返回空字符串
     */
    private String ResponseMessage = ResponseCode.SUCCESS.getMessage();

    /**
     * 返回数据
     */
    private Object data;

    /**
     * 每页大小
     */
    private Integer pageSize;

    /**
     * 页码
     */
    private Integer pageNum;

    /**
     * 总条数
     */
    private Long total;

    /**
     * <h2>正确响应构造函数</h2>
     *
     * @param data 响应数据
     */
    public ResponsePage(Object data) {
        this.data = data;
    }

}
