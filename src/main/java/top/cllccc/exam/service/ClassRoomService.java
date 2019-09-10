package top.cllccc.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cllccc.exam.constants.ResponseCode;
import top.cllccc.exam.dao.common.dao.ClassRoomMapper;
import top.cllccc.exam.domain.ClassRoom;
import top.cllccc.exam.domain.Teacher;
import top.cllccc.exam.domain.dto.ExamTimeDto;
import top.cllccc.exam.vo.Response;

import java.util.List;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/9/3 8:20
 */
@Service
public class ClassRoomService extends BaseService<ClassRoom> {

    @Autowired
    ClassRoomMapper classRoomMapper;

    @Autowired
    TeacherService teacherService;

    public Response queryEmptyClassRoom(ExamTimeDto examTimeDto){
        Response response = new Response();
        List<Integer> timeIds = teacherService.getTimeIdList(examTimeDto);
        List<ClassRoom> classRooms = classRoomMapper.queryEmptyClassRoom(timeIds);
        if (classRooms == null || classRooms.size() == 0) {
            response.setCode(ResponseCode.QUERY_FAILURE.getCode());
            response.setMessage(ResponseCode.QUERY_FAILURE.getMessage());
        } else {
            response.setData(classRooms);
        }
        return response;
    }
}
