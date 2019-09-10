package top.cllccc.exam.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.cllccc.exam.constants.ResponseCode;
import top.cllccc.exam.dao.common.dao.ExamMapper;
import top.cllccc.exam.dao.common.dao.ExamRoomMapper;
import top.cllccc.exam.dao.common.dao.ExamTeacherMapper;
import top.cllccc.exam.dao.common.dao.ExamTimeMapper;
import top.cllccc.exam.domain.Exam;
import top.cllccc.exam.domain.ExamRoom;
import top.cllccc.exam.domain.ExamTeacher;
import top.cllccc.exam.domain.dto.AddExamDto;
import top.cllccc.exam.vo.Response;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/9/3 8:51
 */
@Service
@Slf4j
public class ExamService extends BaseService<Exam> {

    @Autowired
    ExamMapper examMapper;

    @Autowired
    ExamTeacherMapper examTeacherMapper;

    @Autowired
    ExamTimeMapper examTimeMapper;

    @Autowired
    ExamRoomMapper examRoomMapper;

    @Autowired
    ExamTimeService examTimeService;

    @Autowired
    TeacherService teacherService;

    /**
     * 添加考试
     * @param addExamDto
     * @return
     */
    @Transactional
    public Response addExamDto(AddExamDto addExamDto){
        Response response = new Response();
        int examId = 0;

        // 插入考试信息
        Exam exam = new Exam();
        exam.setCourseId(addExamDto.getCourseId());
        examMapper.insert(exam);
        examId = exam.getId();

        // 插入时间信息
        Response timeResponse = examTimeService.insertExamTime(addExamDto.getExamTimeDto(),examId);

        // 插入监考老师信息
        ExamTeacher examTeacher = new ExamTeacher();
        examTeacher.setExamId(examId);
        for(Integer tid : addExamDto.getTeacherIds()){
            examTeacher.setId(null);
            examTeacher.setTeacherId(tid);
            examTeacherMapper.insert(examTeacher);
        }

        // 插入考试教室信息
        ExamRoom examRoom = new ExamRoom();
        examRoom.setExamId(examId);
        for(Integer rid :addExamDto.getRoomIds()){
            examRoom.setId(null);
            examRoom.setRoomId(rid);
            examRoomMapper.insert(examRoom);
        }
        return response;
    }


}
