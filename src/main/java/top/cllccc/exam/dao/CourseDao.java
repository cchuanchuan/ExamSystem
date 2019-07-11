package top.cllccc.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import top.cllccc.exam.domain.Course;

import java.util.List;

@Mapper
public interface CourseDao {
    public Course getCourseByNo(String courseNo);
    public List<Course> getAllCourse();
    public int addCourse(Course course);
    public int deleteCourse(String courseNo);
    public int updateCourse(Course course);
}
