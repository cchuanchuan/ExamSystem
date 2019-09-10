package top.cllccc.exam.dao.common.dao;

import tk.mybatis.mapper.common.Mapper;
import top.cllccc.exam.domain.dto.Grade;
import top.cllccc.exam.domain.Time;

import java.util.List;

public interface TimeMapper extends Mapper<Time> {

    List<Grade> queryDistinctGrade();

}