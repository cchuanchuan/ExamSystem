package top.cllccc.exam.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.cllccc.exam.domain.Student;
import top.cllccc.exam.service.BaseService;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/8/22 17:02
 */
@RestController
@Api(value = "学生管理", description = "时间管理")
@RequestMapping("student")
@Controller("studentController")
@Slf4j
public class StudentController {

    @Autowired
    BaseService<Student> baseService;

    @GetMapping("queryStudentPage")
    public String queryStudentPage(){
        log.info("queryStudentPage");
        return JSONObject.toJSONString(baseService.queryPage(1,1));
    }



}
