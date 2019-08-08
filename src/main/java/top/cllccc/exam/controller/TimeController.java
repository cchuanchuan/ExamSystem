package top.cllccc.exam.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.cllccc.exam.dao.common.dao.TimeMapper;
import top.cllccc.exam.domain.Time;
import top.cllccc.exam.service.TimeService;

import java.util.List;

@Api(value = "时间管理",description = "时间管理")
@RequestMapping("time")
@Controller("timeController")
@Slf4j
public class TimeController {

    @Autowired
    TimeMapper timeMapper;

    @Autowired
    TimeService timeService;

    @ApiOperation("查询所有时间")
    @GetMapping("checkTime")
    @ResponseBody
    public List<Time> checkTime(){
        return timeMapper.selectAll();
    }
}
