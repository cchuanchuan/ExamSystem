package top.cllccc.exam.constants;

/**
 * <h1>错误码枚举定义</h1>
 *
 * @Author: CCC
 * @Date 2019/8/19 11:15
 */
public enum ResponseCode {

    /**
     * 枚举对象
     */
    SUCCESS(20000, "请求成功"),
    INSERT_FAILURE(90001,"插入数据失败"),
    UPDATE_FAILURE(90002,"更新数据失败"),
    DELETE_FAILURE(90003,"删除数据失败"),
    QUERY_FAILURE(90004,"查询数据失败"),
    LOGIN_ERROR(10000,"用户名或密码错误"),
    NULL_USERNAME_PASSWORD(10001,"用户名或密码为空"),
    DUPLICATE_NAME(10002, "商户名称重复");

    /**
     * 错误码
     */
    private int code;

    /**
     * 错误信息
     */
    private String message;

    ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
