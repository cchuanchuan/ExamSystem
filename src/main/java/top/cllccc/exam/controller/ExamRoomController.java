package top.cllccc.exam.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.cllccc.exam.domain.ExamRoom;
import top.cllccc.exam.service.BaseService;
import top.cllccc.exam.service.ExamRoomService;
import top.cllccc.exam.service.ExamService;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/9/3 9:03
 */
@Slf4j
@Controller
@RestController
@RequestMapping("examRoom")
public class ExamRoomController extends BaseController<ExamRoom> {

    @Autowired
    ExamRoomService examRoomService;

    @Override
    public BaseService<ExamRoom> getBaseService() {
        return examRoomService;
    }
}
