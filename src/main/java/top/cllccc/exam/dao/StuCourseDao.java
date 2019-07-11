package top.cllccc.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.cllccc.exam.domain.StuCourse;

import java.util.List;

@Mapper
public interface StuCourseDao {
    public List<StuCourse> getStuCourseByStudentNo(String studentNo);
    public List<StuCourse> getStuCourseByCourseNo(String courseNo);
    public List<StuCourse> getAllStuCourse();
    public int addStuCourse(StuCourse stuCourse);
    public int deleteStuCourse(@Param("studentNo") String studentNo, @Param("courseNo") String courseNo);
    public int updateStuCourse(StuCourse stuCourse);
}
