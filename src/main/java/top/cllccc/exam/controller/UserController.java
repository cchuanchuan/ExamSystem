package top.cllccc.exam.controller;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTDecodeException;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.cllccc.exam.Utils.PassToken;
import top.cllccc.exam.Utils.TokenHelper;
import top.cllccc.exam.constants.ResponseCode;
import top.cllccc.exam.domain.User;
import top.cllccc.exam.domain.dto.LoginForm;
import top.cllccc.exam.domain.dto.LoginUserDto;
import top.cllccc.exam.service.UserService;
import top.cllccc.exam.vo.Response;
import javax.servlet.http.HttpServletRequest;

/**
 * <h1>用户登录注册信息管理</h1>
 *
 * @Author: CCC
 * @Date 2019/8/22 17:03
 */
@RestController
@Api(value = "用户管理", description = "用户管理")
@RequestMapping("user")
@Slf4j
@PassToken
public class UserController {

    @Autowired
    TokenHelper tokenHelper;

    @Autowired
    UserService userService;

    /**
     * 用戶登录
     * @param loginForm
     * @return
     */
    @PostMapping("login")
    @ResponseBody
    @PassToken
    public String Login(@RequestBody LoginForm loginForm) {
        Response response = new Response();

        System.out.println(loginForm);
        if (loginForm.getUsername() != null && loginForm.getPassword() != null) {
            User user = new User();
            user.setNo(loginForm.getUsername());
            user.setPassword(loginForm.getPassword());
            User queryUser = userService.loginUser(user);

            if (queryUser != null) { //登录成功
                JSONObject jsonObject = new JSONObject();
                String token = tokenHelper.getToken(user);
                jsonObject.put("token",token);
                response.setMessage(ResponseCode.SUCCESS.getMessage());
                response.setCode(ResponseCode.SUCCESS.getCode());
                response.setData(jsonObject);
            }
        }else {
            //用户名或密码为空
            response.setCode(ResponseCode.NULL_USERNAME_PASSWORD.getCode());
            response.setMessage(ResponseCode.NULL_USERNAME_PASSWORD.getMessage());
        }
        return JSONObject.toJSONString(response);
    }

    @GetMapping("getInfo")
    @ResponseBody
    @PassToken
    public String getInfo(String tokenKey){
        Response response = new Response();

        // 获取 token 中的 userno
        String userNo;
        try {
            userNo = JWT.decode(tokenKey).getAudience().get(0);
        } catch (JWTDecodeException j) {
            throw new RuntimeException("401");
        }
        User user = userService.findUserByNo(userNo);
        if(user != null){
            LoginUserDto loginUserDto = new LoginUserDto();
            loginUserDto.setIntroduction(user.getIdentity());
            loginUserDto.setName(user.getName());
            loginUserDto.getRoles().add(user.getIdentity());
            response.setData(loginUserDto);
        }
        return JSONObject.toJSONString(response);
    }

    @PostMapping("logout")
    @ResponseBody
    @PassToken
    public String logOut(HttpServletRequest request){
//        System.out.println("request:"+request);
//        String token = request.getHeader("X-Token");
//        if(token != null) {
//            redisTokenHelp.delete(token);
//        }
        return JSONObject.toJSONString(new Response());
    }
}
