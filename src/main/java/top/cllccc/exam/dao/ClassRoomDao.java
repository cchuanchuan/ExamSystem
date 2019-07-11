package top.cllccc.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.Mapping;
import top.cllccc.exam.domain.ClassRoom;

import java.util.List;

@Mapper
public interface ClassRoomDao {
    //根据主键查询
    public ClassRoom getClassRoomByNo(String roomNo);
    //查询所有
    public List<ClassRoom> getAllClassRoom();
    //增加信息
    public int addClassRoom(ClassRoom classRoom);
    //删除信息
    public int deleteClassRoom(String roomNo);
    //修改信息
    public int updateClassRoom(ClassRoom classRoom);
}
