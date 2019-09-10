package top.cllccc.exam.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cllccc.exam.constants.ResponseCode;
import top.cllccc.exam.dao.common.dao.ClazsMapper;
import top.cllccc.exam.dao.common.dao.CourseMapper;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.domain.Teacher;
import top.cllccc.exam.vo.Response;

import java.util.List;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/8/29 16:59
 */
@Service
@Slf4j
public class ClazsService extends BaseService<Clazs> {

    @Autowired
    ClazsMapper clazsMapper;

    public Response queryClazsByCourse(Integer courseId){
        Response response = new Response();

        List<Clazs> list = clazsMapper.queryClazsByCourse(courseId);
        if(list ==null || list.size() ==0){
            response.setCode(ResponseCode.QUERY_FAILURE.getCode());
            response.setMessage(ResponseCode.QUERY_FAILURE.getMessage());
        }else {
            response.setData(list);
        }
        return response;
    }
}
