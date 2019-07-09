package top.cllccc.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import top.cllccc.exam.domain.Clazs;

@Mapper
public interface ClazsDao {
    public Clazs queryClazsByNo(String class_no);
}
