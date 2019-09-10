package top.cllccc.exam.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.cllccc.exam.domain.Course;
import top.cllccc.exam.service.BaseService;
import top.cllccc.exam.service.CourseService;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/8/29 16:50
 */
@Controller
@RequestMapping("course")
@Slf4j
@RestController
public class CourseController extends  BaseController<Course> {

    @Autowired
    private CourseService courseService;

    @Override
    public BaseService<Course> getBaseService() {
        return courseService;
    }

}
