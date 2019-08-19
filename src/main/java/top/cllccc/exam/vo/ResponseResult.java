package top.cllccc.exam.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>请求编码及清酒信息</h1>
 *
 * @Author: CCC
 * @Date 2019/8/19 11:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult {

    /** 错误码，正确返回 00000*/
    private String resultCode = "00000";

    /** 错误信息，正确返回空*/
    private String resultMessage = "请求成功";
}
