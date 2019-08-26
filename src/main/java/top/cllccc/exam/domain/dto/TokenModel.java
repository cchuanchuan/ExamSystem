package top.cllccc.exam.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.cllccc.exam.constants.TokenInfo;

/**
 * <h1>用户权限token管理</h1>
 *
 * @Author: CCC
 * @Date 2019/8/22 17:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenModel {

    /**
     * 编号（key)
     */
    private String key;

    /**
     * 用户身份(token信息)
     */
    private String tokenInfo;

    /**
     * 设置学生token
     */
    public void setStudentToken(String key) {
        tokenInfo = TokenInfo.STUDENT_TOKEN;
        this.key = key;
    }

    /**
     * 设置教师token
     */
    public void setTeacherToken(String key){
        tokenInfo = TokenInfo.TEACHER_TOKEN;
        this.key = key;
    }

    /**
     * 设置管理员token
     */
    public void setAdminToken(String key){
        tokenInfo = TokenInfo.ADMIN_TOKEN;
        this.key = key;
    }
}
