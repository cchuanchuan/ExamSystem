package top.cllccc.exam.config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import top.cllccc.exam.Utils.PassToken;
import top.cllccc.exam.constants.TokenInfo;
import top.cllccc.exam.domain.User;
import top.cllccc.exam.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.lang.reflect.Method;

/**
 * <h1>登录拦截器，验证token信息</h1>
 *
 * @Author: CCC
 * @Date 2019/8/27 11:18
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private UserService userService;


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception {
        String token = httpServletRequest.getHeader(TokenInfo.TOKEN_HEADER);// 从 http 请求头中取出 token
        // 如果不是映射到方法直接通过
        if (!(object instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) object;
        Method method = handlerMethod.getMethod();

        //检查是否有passtoken注释，有则跳过认证
        if (method.isAnnotationPresent(PassToken.class)) {
            PassToken passToken = method.getAnnotation(PassToken.class);
            return true;
        } else {
            // 执行认证
            if (token == null) {
                httpServletResponse.setContentType("text/html;charset=utf-8");
                PrintWriter resultWriter = httpServletResponse.getWriter();
                resultWriter.write("无token，请重新登录");
                return false;
            }
            // 获取 token 中的 user no
            String userNo;
            try {
                userNo = JWT.decode(token).getAudience().get(0);
            } catch (JWTDecodeException j) {
                throw new RuntimeException("401");
            }
            User user = userService.findUserByNo(userNo);
            if (user == null) {
                httpServletResponse.setContentType("text/html;charset=utf-8");
                PrintWriter resultWriter = httpServletResponse.getWriter();
                resultWriter.write("用户不存在，请重新登录");
                return false;
            }
            // 验证 token
            JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(user.getPassword())).build();
            try {
                jwtVerifier.verify(token);
            } catch (JWTVerificationException e) {
                throw new RuntimeException("401");
            }
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse,
                           Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
    }

}
