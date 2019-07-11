package top.cllccc.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.cllccc.exam.domain.ExamTeacher;

import java.util.List;

@Mapper
public interface ExamTeacherDao {
    public List<ExamTeacher> getExamTeacherByExamNo(String examNo);
    public List<ExamTeacher> getAllExamTeacher();
    public int addExamTeacher(ExamTeacher examTeacher);
    public int deleteExamTeacher(ExamTeacher examTeacher);
    public int deleteExamTeacherByExamNo(@Param("examNo") String examNo);

}
