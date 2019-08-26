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
    SUCCESS("00000", "请求成功"),
    LOGIN_ERROR("00001","用户名或密码错误"),
    NULL_USERNAME_PASSWORD("00002","用户名或密码为空"),
    DUPLICATE_NAME("00001", "商户名称重复");

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误信息
     */
    private String message;

    ResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
