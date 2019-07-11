package top.cllccc.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.cllccc.exam.domain.TeachPlan;

import java.util.List;

@Mapper
public interface TeachPlanDao {
    public List<TeachPlan> getTeachPlanByteacherNo(String teacherNo);
    public List<TeachPlan> getTeachPlanByCourseNo(String courseNo);
    public List<TeachPlan> getAllTeachPlan();
    public int addTeachPlan(TeachPlan teachPlan);
    public int deleteTeachPlan(@Param("teacherNo") String studentNo, @Param("courseNo") String courseNo);
}
