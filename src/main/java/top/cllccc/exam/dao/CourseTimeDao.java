package top.cllccc.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.cllccc.exam.domain.CourseTime;

import java.util.List;

@Mapper
public interface CourseTimeDao {
    public List<CourseTime> getCourseTimeByTimeNo(String timeNo);
    public List<CourseTime> getCourseTimeByCourseNo(String courseNo);
    public List<CourseTime> getAllCourseTime();
    public int addCourseTime(CourseTime courseTime);
    public int deleteCourseTime(@Param("timeNo") String timeNo, @Param("courseNo") String courseNo);
    public int deleteCourseTimeByCourseNo(@Param("courseNo") String courseNo);
}
