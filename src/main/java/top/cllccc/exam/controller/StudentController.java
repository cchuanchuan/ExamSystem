package top.cllccc.exam.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/8/22 17:02
 */
@RestController
@Api(value = "学生管理", description = "时间管理")
@RequestMapping("time")
@Controller("studentController")
@Slf4j
public class StudentController {
}
