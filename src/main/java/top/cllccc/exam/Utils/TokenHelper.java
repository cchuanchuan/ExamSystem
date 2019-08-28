package top.cllccc.exam.Utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Component;
import top.cllccc.exam.domain.User;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/8/27 15:02
 */
@Component
public class TokenHelper {
    public String getToken(User user) {
        String token="";
        token= JWT.create().withAudience(""+user.getNo())
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }
}
