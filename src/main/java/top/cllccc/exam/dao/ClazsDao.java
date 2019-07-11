package top.cllccc.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import top.cllccc.exam.domain.Clazs;

import java.util.List;

@Mapper
public interface ClazsDao {
    public Clazs getClazsByNo(String classNo);
    public List<Clazs> getAllClazs();
    public int addClazs(Clazs clazs);
    public int deleteClazs(String classNo);
    public int updateClazs(Clazs clazs);

}
