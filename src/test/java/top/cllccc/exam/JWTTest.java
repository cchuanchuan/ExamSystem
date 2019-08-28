package top.cllccc.exam;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.cllccc.exam.domain.Student;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/8/27 15:43
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class JWTTest {

    @Test
    public void test() {
        String token = "";
        token= JWT.create().withAudience("202161109")
                .sign(Algorithm.HMAC256("123456"));

        System.out.println("token:"+token);
        // 获取 token 中的 userno
        String userNo;
        String user2;
        try {
            userNo = JWT.decode(token).getAudience().get(0);
        } catch (JWTDecodeException j) {
            throw new RuntimeException("401");
        }
        System.out.println("userNO:"+userNo);

    }
}
