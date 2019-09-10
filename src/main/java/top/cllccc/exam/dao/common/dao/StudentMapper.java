package top.cllccc.exam.dao.common.dao;

import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import top.cllccc.exam.domain.Student;

import java.util.List;

public interface StudentMapper extends Mapper<Student> {

    Integer checkStudentBusyTime(@Param("courseId") Integer courseId,
                                       @Param("list")List<Integer> timeIds);
}