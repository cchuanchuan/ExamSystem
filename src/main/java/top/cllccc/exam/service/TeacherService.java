package top.cllccc.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cllccc.exam.constants.ResponseCode;
import top.cllccc.exam.dao.common.dao.DateTimeMapper;
import top.cllccc.exam.dao.common.dao.TeacherMapper;
import top.cllccc.exam.dao.common.dao.TimeMapper;
import top.cllccc.exam.domain.DateTime;
import top.cllccc.exam.domain.Teacher;
import top.cllccc.exam.domain.Time;
import top.cllccc.exam.domain.dto.ExamTimeDto;
import top.cllccc.exam.vo.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/9/2 8:48
 */
@Service
public class TeacherService extends BaseService<Teacher> {

    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    private DateTimeMapper dateTimeMapper;

    @Autowired
    private TimeMapper timeMapper;


    public Response queryHasTimeTeacher(ExamTimeDto examTimeDto) {
        Response response = new Response();
        List<Integer> timeIds = getTimeIdList(examTimeDto);
        List<Teacher> teachers = teacherMapper.queryHasTimeTeacher(timeIds);
        if (teachers == null || teachers.size() == 0) {
            response.setCode(ResponseCode.QUERY_FAILURE.getCode());
            response.setMessage(ResponseCode.QUERY_FAILURE.getMessage());
        } else {
            response.setData(teachers);
        }
        return response;
    }

    public List<Integer> getTimeIdList(ExamTimeDto examTimeDto) {
        int dateId = 0;
        int gradeId = 0;
        List<Integer> timeIds = new ArrayList<>();
        timeIds.add(0);
        if (examTimeDto != null && examTimeDto.getTimeOrder() != null) {
            DateTime query = new DateTime();
            query.setDate(examTimeDto.getTimeDate());
            DateTime dateTime = dateTimeMapper.selectOne(query);
            if(dateTime != null){
                dateId = dateTime.getId();
            }
        }
        if (examTimeDto != null && examTimeDto.getGradeId() != null) {
            gradeId = examTimeDto.getGradeId();
        }
        if (examTimeDto != null && examTimeDto.getTimeOrder() != null) {
            int order1 = examTimeDto.getTimeOrder() * 2;
            int order2 = examTimeDto.getTimeOrder() * 2 - 1;
            Time queryTime = new Time();
            queryTime.setGredeId(gradeId);
            queryTime.setDateId(dateId);
            queryTime.setTimeOrder(order1);
            Time time1 = timeMapper.selectOne(queryTime);
            if(time1 != null){
                timeIds.add(time1.getId());
            }
            queryTime.setTimeOrder(order2);
            time1 = timeMapper.selectOne(queryTime);
            if(time1 != null){
                timeIds.add(time1.getId());
            }
        }
        return timeIds;
    }

}
