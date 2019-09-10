package top.cllccc.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.cllccc.exam.dao.common.dao.DateTimeMapper;
import top.cllccc.exam.dao.common.dao.ExamTimeMapper;
import top.cllccc.exam.dao.common.dao.TimeMapper;
import top.cllccc.exam.domain.DateTime;
import top.cllccc.exam.domain.ExamTime;
import top.cllccc.exam.domain.Time;
import top.cllccc.exam.domain.dto.ExamTimeDto;
import top.cllccc.exam.vo.Response;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/9/10 15:50
 */
@Service
public class ExamTimeService extends BaseService<ExamTime> {

    @Autowired
    DateTimeMapper dateTimeMapper;

    @Autowired
    TimeMapper timeMapper;

    @Autowired
    ExamTimeMapper examTimeMapper;

    @Transactional
    public Response insertExamTime(ExamTimeDto examTimeDto, int examId) {
        Response response = new Response();
        int dateId = 0;
        int gradeId = 0;
        Time time1 = null;
        Time time2 = null;
        // 获取DateTime信息，不存在则插入
        DateTime query = new DateTime();
        query.setDate(examTimeDto.getTimeDate());
        DateTime dateTime = dateTimeMapper.selectOne(query);
        if (dateTime != null) {
            dateId = dateTime.getId();
        } else {
            dateTime = query;
            dateTimeMapper.insert(dateTime); // 若日期不存在，则插入日期
            dateId = dateTime.getId();
        }

        if (examTimeDto != null && examTimeDto.getGradeId() != null) {
            gradeId = examTimeDto.getGradeId();
        }

        // 获取time信息,不存在则插入
        int order1 = examTimeDto.getTimeOrder() * 2;
        int order2 = examTimeDto.getTimeOrder() * 2 - 1;
        Time queryTime = new Time();
        queryTime.setGredeId(gradeId);
        queryTime.setDateId(dateId);
        queryTime.setTimeOrder(order1);
        time1 = timeMapper.selectOne(queryTime);
        if (time1 == null) {
            time1 = new Time();
            time1.setGredeId(queryTime.getGredeId());
            time1.setTimeOrder(order1);
            time1.setDateId(queryTime.getDateId());
            timeMapper.insert(time1);
        }
        queryTime.setTimeOrder(order2);
        time2 = timeMapper.selectOne(queryTime);
        if (time2 == null) {
            time2 = new Time();
            time2.setGredeId(queryTime.getGredeId());
            time2.setTimeOrder(order2);
            time2.setDateId(queryTime.getDateId());
            timeMapper.insert(time2);
        }

        // 插入ExamTime
        ExamTime examTime1 = new ExamTime();
        examTime1.setExamId(examId);
        examTime1.setTimeId(time1.getId());
        examTimeMapper.insert(examTime1);
        ExamTime examTime2 = new ExamTime();
        examTime2.setExamId(examId);
        examTime2.setTimeId(time2.getId());
        examTimeMapper.insert(examTime2);

        return response;
    }
}
