package top.cllccc.exam.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cllccc.exam.dao.common.dao.StudentMapper;
import top.cllccc.exam.domain.*;
import top.cllccc.exam.domain.dto.ExamCourseTimeDto;
import top.cllccc.exam.domain.dto.ExamTimeDto;
import top.cllccc.exam.vo.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/8/22 15:31
 */
@Service
public class StudentService extends BaseService<Student> {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    TeacherService teacherService;

    /**
     * 查询上课学生在List<timeId>是否空闲
     * @param courseId 课程编号，timeIds时间
     * @return false表示忙，true表示不忙
     */
    public Response checkCourseStudentBusy(ExamCourseTimeDto examCourseTimeDto){
        Response response = new Response();
        List<Integer> timeIds = teacherService.getTimeIdList(examCourseTimeDto.getExamTimeDto());
        Integer busyNum = studentMapper.checkStudentBusyTime(examCourseTimeDto.getCourseId(),timeIds);
        if (busyNum > 0){
            response.setData(false);
            return response;
        }
        response.setData(true);
        return response;
    }


}
