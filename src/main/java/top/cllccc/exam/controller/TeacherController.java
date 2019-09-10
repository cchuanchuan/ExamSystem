package top.cllccc.exam.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.cllccc.exam.dao.common.dao.DateTimeMapper;
import top.cllccc.exam.dao.common.dao.TimeMapper;
import top.cllccc.exam.domain.DateTime;
import top.cllccc.exam.domain.Teacher;
import top.cllccc.exam.domain.Time;
import top.cllccc.exam.domain.dto.ExamTimeDto;
import top.cllccc.exam.service.BaseService;
import top.cllccc.exam.service.DateTimeService;
import top.cllccc.exam.service.TeacherService;
import top.cllccc.exam.service.TimeService;
import top.cllccc.exam.vo.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/9/2 8:49
 */
@RestController
@RequestMapping("teacher")
@Controller
public class TeacherController extends BaseController<Teacher> {

    @Autowired
    private TeacherService teacherService;

    @Override
    public BaseService<Teacher> getBaseService() {
        return teacherService;
    }


    @PostMapping("queryHasTimeTeacher")
    public String queryHasTimeTeacher(@RequestBody ExamTimeDto examTimeDto) {
        Response response = teacherService.queryHasTimeTeacher(examTimeDto);
        return JSONObject.toJSONString(response);
    }
}
