package top.cllccc.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.cllccc.exam.domain.ExamRoom;

import java.util.List;

@Mapper
public interface ExamRoomDao {
    public List<ExamRoom> getExamRoomByExamNo(String examNo);
    public List<ExamRoom> getAllExamRoom();
    public int addExamRoom(ExamRoom examRoom);
    public int deleteExamRoom(ExamRoom examRoom);
    public int deleteExamRoomByExamNo(@Param("examNo") String examNo);

}
