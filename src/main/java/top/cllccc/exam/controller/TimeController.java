package top.cllccc.exam.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.cllccc.exam.dao.common.dao.TimeMapper;
import top.cllccc.exam.service.TimeService;


@RestController
@Api(value = "时间管理",description = "时间管理")
@RequestMapping("time")
@Controller("timeController")
@Slf4j
public class TimeController {

    @Autowired
    private TimeMapper timeMapper;

    @Autowired
    private TimeService timeService;

    @ApiOperation("查询所有时间")
    @GetMapping("checkTime")
    //@ResponseBody
    public String checkTime(){
        log.info("checkTime");
        return timeService.get(2,1);
    }
}
