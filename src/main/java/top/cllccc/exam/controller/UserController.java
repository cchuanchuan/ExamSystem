package top.cllccc.exam.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.cllccc.exam.Utils.RedisTokenHelp;
import top.cllccc.exam.constants.ResponseCode;
import top.cllccc.exam.domain.Student;
import top.cllccc.exam.domain.dto.LoginForm;
import top.cllccc.exam.domain.dto.TokenModel;
import top.cllccc.exam.service.StudentService;
import top.cllccc.exam.vo.Response;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/8/22 17:03
 */
@RestController
@Api(value = "用户管理", description = "用户管理")
@RequestMapping("login")
@Slf4j
public class UserController {

    @Autowired
    StudentService studentService;

    @Autowired
    RedisTokenHelp redisTokenHelp;

    @PostMapping("student")
    @ResponseBody
    public String LoginStudent(@RequestBody LoginForm loginForm) {
        Response response = new Response();
        response.setResponseCode(ResponseCode.LOGIN_ERROR.getCode());
        response.setResponseMessage(ResponseCode.LOGIN_ERROR.getMessage());

        System.out.println(loginForm);
        if (loginForm.getUsername() != null && loginForm.getPassword() != null) {
            Student student = new Student();
            student.setStudentNo(loginForm.getUsername());
            student.setStudentPassword(loginForm.getPassword());
            Student queryStudent = studentService.queryStudent(student);

            if (queryStudent != null) { //登录成功
                TokenModel tokenModel = new TokenModel();
                tokenModel.setStudentToken(queryStudent.getStudentNo());

                redisTokenHelp.create(tokenModel);
                response.setResponseMessage(ResponseCode.SUCCESS.getMessage());
                response.setResponseCode(ResponseCode.SUCCESS.getCode());
                response.setData(tokenModel);

                boolean hasstu = redisTokenHelp.check(tokenModel);
                System.out.println("redis查询: " + hasstu);
            }
        }else {
            //用户名或密码为空
            response.setResponseCode(ResponseCode.NULL_USERNAME_PASSWORD.getCode());
            response.setResponseMessage(ResponseCode.NULL_USERNAME_PASSWORD.getMessage());
        }



        return JSONObject.toJSONString(response);
    }
}
