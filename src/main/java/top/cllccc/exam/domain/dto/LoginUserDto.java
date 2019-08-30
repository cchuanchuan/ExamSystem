package top.cllccc.exam.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>登录返回对象</h1>
 *
 * @Author: CCC
 * @Date 2019/8/27 10:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginUserDto {
    /**
     * 头像地址
     */
    private String avatar = "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif";

    /**
     * 简介
     */
    private String introduction;

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份
     */
    private List<String> roles = new ArrayList<>();
}
