package top.cllccc.exam.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.cllccc.exam.domain.dto.Grade;
import top.cllccc.exam.service.BaseService;
import top.cllccc.exam.service.GradeService;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/9/7 15:20
 */
@Slf4j
@Controller
@RestController
@RequestMapping("grade")
public class GradeController extends BaseController<Grade> {

    @Autowired
    GradeService gradeService;

    @Override
    public BaseService<Grade> getBaseService() {
        return gradeService;
    }
}
