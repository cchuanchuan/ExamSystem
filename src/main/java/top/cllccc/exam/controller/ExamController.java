package top.cllccc.exam.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.cllccc.exam.domain.Exam;
import top.cllccc.exam.domain.dto.AddExamDto;
import top.cllccc.exam.service.BaseService;
import top.cllccc.exam.service.ExamService;
import top.cllccc.exam.vo.Response;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/9/3 8:52
 */
@Controller
@RequestMapping("exam")
@RestController
@Slf4j
public class ExamController extends BaseController<Exam> {
    @Autowired
    ExamService examService;

    @Override
    public BaseService<Exam> getBaseService() {
        return examService;
    }

    @PostMapping("addExamDto")
    public String addExamDto(@RequestBody  AddExamDto addExamDto){

        Response response = examService.addExamDto(addExamDto);
        System.out.println(addExamDto);
        return JSONObject.toJSONString(response);
    }

}
