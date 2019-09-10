package top.cllccc.exam.dao.common.dao;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import top.cllccc.exam.constants.ResponseCode;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.domain.Teacher;
import top.cllccc.exam.vo.Response;

import java.util.List;

public interface ClazsMapper extends Mapper<Clazs> {

    List<Clazs> queryClazsByCourse(@Param("courseId") Integer courseId);
}