package top.cllccc.exam.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    /** 错误码及错误信息*/
    private ResponseResult responseResult;

    /** 返回数据*/
    private Object data;

    /** 每页大小*/
    private Integer pageSize;

    /** 页码*/
    private Integer pageNum;

    /** 总条数*/
    private Long total;

    /**
     * <h2>正确响应构造函数</h2>
     * @param data 响应数据
     */
    public ResponsePage(Object data){
        this.data = data;
        this.responseResult = new ResponseResult();
    }

}
