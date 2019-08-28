package top.cllccc.exam.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cllccc.exam.dao.common.dao.TimeMapper;
import top.cllccc.exam.domain.Time;

@Slf4j
@Service("timeService")
public class TimeService extends BaseService<Time> {
    @Autowired
    private TimeMapper timeMapper;

}
