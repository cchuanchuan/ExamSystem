package top.cllccc.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.service.ClazsService;

import javax.annotation.Resource;

@RequestMapping("/class")
@Controller
public class ClazsController {

    @Autowired
    ClazsService clazsService;

    @GetMapping("queryClazsByNo")
    @ResponseBody
    public Clazs queryClazsByNo(String class_no){
        return clazsService.queryClazsByNo(class_no);
    }
}
