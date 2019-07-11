package top.cllccc.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import top.cllccc.exam.domain.Teacher;

import java.util.List;

@Mapper
public interface TeacherDao {
    public Teacher getTeacherByNo(String teacherNo);
    public List<Teacher> getAllTeacher();
    public int addTeacher(Teacher teacher);
    public int deleteTeacher(String teacherNo);
    public int updateTeacher(Teacher teacher);
}
