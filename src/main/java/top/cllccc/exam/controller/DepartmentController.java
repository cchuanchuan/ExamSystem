package top.cllccc.exam.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.cllccc.exam.domain.Department;
import top.cllccc.exam.service.BaseService;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/9/2 11:00
 */
@RestController // 返回json数据
@Controller
@RequestMapping("department")
@Slf4j
public class DepartmentController extends BaseController<Department> {

    @Autowired
    BaseService<Department> baseService;

    @Override
    public BaseService<Department> getBaseService() {
        return baseService;
    }
}
