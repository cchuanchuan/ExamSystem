package top.cllccc.exam.dao.common.dao;

import tk.mybatis.mapper.common.Mapper;
import top.cllccc.exam.domain.ClassRoom;

import java.util.List;

public interface ClassRoomMapper extends Mapper<ClassRoom> {

    List<ClassRoom> queryEmptyClassRoom(List<Integer> timeIds);
}