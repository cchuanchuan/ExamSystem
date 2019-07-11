package top.cllccc.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import top.cllccc.exam.domain.Exam;

import java.util.List;

@Mapper
public interface ExamDao {
    public Exam getExamByExamNo(String examNo);
    public Exam getExamByCourseNo(String courseNo);
    public List<Exam> getAllExam();
    public int addExam(Exam exam);
    public int deleteExam(String examNo);
}
