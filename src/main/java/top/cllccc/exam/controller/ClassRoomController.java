package top.cllccc.exam.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.cllccc.exam.domain.ClassRoom;
import top.cllccc.exam.domain.dto.ExamTimeDto;
import top.cllccc.exam.service.BaseService;
import top.cllccc.exam.service.ClassRoomService;
import top.cllccc.exam.vo.Response;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/9/3 8:21
 */

@Controller
@RestController
@RequestMapping("classRoom")
@Slf4j
public class ClassRoomController extends BaseController<ClassRoom> {

    @Autowired
    ClassRoomService classRoomService;

    @Override
    public BaseService<ClassRoom> getBaseService() {
        return classRoomService;
    }

    @PostMapping("queryEmptyClassRoom")
    public String queryEmptyClassRoom(@RequestBody ExamTimeDto examTimeDto) {
        Response response = classRoomService.queryEmptyClassRoom(examTimeDto);
        return JSONObject.toJSONString(response);
    }
}
