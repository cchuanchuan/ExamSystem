package top.cllccc.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import top.cllccc.exam.domain.Time;

import java.util.List;

@Mapper
public interface TimeDao {

    public List<Time> getTimeByNo(String timeNo);
    public List<Time> getAllTime();
    public int addTime(Time time);
    public int deleteTime(String timeNo);
    public int updateTime(Time time);


}
