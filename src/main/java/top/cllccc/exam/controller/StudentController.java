package top.cllccc.exam.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.cllccc.exam.domain.Student;
import top.cllccc.exam.domain.dto.ExamCourseTimeDto;
import top.cllccc.exam.service.BaseService;
import top.cllccc.exam.service.StudentService;
import top.cllccc.exam.vo.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/8/22 17:02
 */
@RestController
@Api(value = "学生管理", description = "学生管理")
@RequestMapping("student")
@Controller("studentController")
@Slf4j
public class StudentController extends BaseController<Student>{

    @Autowired
    BaseService<Student> baseService;

    @Autowired
    StudentService studentService;

    @Override
    public BaseService<Student> getBaseService() {
        return baseService;
    }


    @PostMapping("checkCourseStudentBusy")
    public String checkCourseStudentBusy(@RequestBody ExamCourseTimeDto examCourseTimeDto){
        return JSONObject.toJSONString(studentService.checkCourseStudentBusy(examCourseTimeDto));
    }

    @ApiOperation("查询学生信息")
    @GetMapping("queryStudentPage")
    public String queryStudentPage(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                   @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        log.info("queryStudentPage: pageNum=" + pageNum + "pageSize=" + pageSize);
        return JSONObject.toJSONString(baseService.queryPage(pageNum, pageSize));
    }

    @ApiOperation("增加学生信息")
    @PostMapping("addStudent")
    public String addStudent(@RequestBody Student student) {
        log.info("addStudent: Student=" + student);
        return JSONObject.toJSONString(baseService.addObject(student));
    }

    @ApiOperation("修改学生信息")
    @PutMapping("updateStudent")
    public String updateStudent(@RequestBody Student student) {
        log.info("updateStudent: Student=" + student);
        return JSONObject.toJSONString(baseService.updateObject(student));
    }

    @ApiOperation("删除学生信息")
    @DeleteMapping("deleteStudent")
    public String deleteStudent(@RequestBody Student student) {
        log.info("deleteStudent: Student=" + student);
        return JSONObject.toJSONString(baseService.deleteObject(student));
    }
}
