package top.cllccc.exam.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>登录表单</h1>
 *
 * @Author: CCC
 * @Date 2019/8/23 9:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginForm {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}
