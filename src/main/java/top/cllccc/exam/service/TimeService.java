package top.cllccc.exam.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cllccc.exam.constants.ResponseCode;
import top.cllccc.exam.dao.common.dao.TimeMapper;
import top.cllccc.exam.domain.Time;
import top.cllccc.exam.domain.dto.Grade;
import top.cllccc.exam.vo.Response;

import java.util.List;

@Slf4j
@Service("timeService")
public class TimeService extends BaseService<Time> {
    @Autowired
    private TimeMapper timeMapper;

    public Response queryDistinctGrade(){
        Response response = new Response();

        List<Grade> list = timeMapper.queryDistinctGrade();

        if (list != null && list.size() > 0){
            response.setData(list);
        }else {
            response.setMessage(ResponseCode.QUERY_FAILURE.getMessage());
            response.setCode(ResponseCode.QUERY_FAILURE.getCode());
        }
        return response;
    }

}
