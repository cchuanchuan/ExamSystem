package top.cllccc.exam.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.cllccc.exam.domain.Time;
import top.cllccc.exam.service.BaseService;
import top.cllccc.exam.service.TimeService;


@RestController
@Api(value = "时间管理", description = "时间管理")
@RequestMapping("time")
@Controller("timeController")
@Slf4j
public class TimeController {

    @Autowired
    private TimeService timeService;

    @ApiOperation("查询时间信息")
    @GetMapping("queryTimePage")
    public String queryTimePage(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                @RequestParam(required = false, defaultValue = "10")Integer pageSize) {
        log.info("queryTimePage");
        return JSONObject.toJSONString(timeService.queryPage(pageNum,pageSize));
    }
}
