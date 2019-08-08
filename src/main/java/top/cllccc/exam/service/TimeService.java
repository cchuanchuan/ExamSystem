package top.cllccc.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cllccc.exam.dao.common.dao.TimeMapper;

@Service("timeService")
public class TimeService {
    @Autowired
    TimeMapper timeMapper;

    public void get(){
        timeMapper.selectAll();
    }
}
