package top.cllccc.exam.dao.common.dao;

import tk.mybatis.mapper.common.Mapper;
import top.cllccc.exam.domain.Teacher;

import java.util.List;

public interface TeacherMapper extends Mapper<Teacher> {
    List<Teacher> queryHasTimeTeacher(List<Integer> timeIds);
}