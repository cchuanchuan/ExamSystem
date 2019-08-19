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
public class TimeService {
    @Autowired
    private TimeMapper timeMapper;

    public String get(int pageNum,int pageSize) {
        Page<Time> page = PageHelper.startPage(pageNum,pageSize);

        String str = JSONObject.toJSONString(timeMapper.selectAll());
        System.out.println(page);
        System.out.println("===total:"+page.getTotal());
        return str;
    }
}
