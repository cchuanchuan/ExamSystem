package top.cllccc.exam.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cllccc.exam.constants.ResponseCode;
import top.cllccc.exam.dao.common.dao.CourseMapper;
import top.cllccc.exam.dao.common.dao.GradeMapper;
import top.cllccc.exam.dao.common.dao.TimeMapper;
import top.cllccc.exam.domain.Course;
import top.cllccc.exam.domain.Time;
import top.cllccc.exam.domain.dto.Grade;
import top.cllccc.exam.vo.Response;

import java.util.List;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/8/27 16:27
 */
@Slf4j
@Service
public class CourseService extends BaseService<Course> {

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    TimeMapper timeMapper;

    @Autowired
    GradeMapper gradeMapper;


}
