package top.cllccc.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.cllccc.exam.domain.ExamTime;

import java.util.List;

@Mapper
public interface ExamTimeDao {
    public List<ExamTime> getExamTimeByExamNo(String examNo);
    public List<ExamTime> getAllExamTime();
    public int addExamTime(ExamTime examTime);
    public int deleteExamTime(ExamTime examTime);
    public int deleteExamTimeByExamNo(@Param("examNo") String examNo);

}
