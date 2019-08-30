package top.cllccc.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.cllccc.exam.domain.*;
import top.cllccc.exam.service.BaseService;

import javax.annotation.Resource;

/**
 * <h1>班级信息</h1>
 *
 * @Author: CCC
 * @Date 2019/8/29 15:14
 */
@RestController
@RequestMapping("clazs")
@Controller
public class ClazsController extends BaseController<Clazs> {

    @Autowired
    private BaseService<Clazs> baseService;

    @Bean
    public BaseService<Clazs> getBaseService(){
        return baseService;
    }

}
