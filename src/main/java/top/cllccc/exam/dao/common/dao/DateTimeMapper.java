package top.cllccc.exam.dao.common.dao;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import top.cllccc.exam.domain.DateTime;

public interface DateTimeMapper extends Mapper<DateTime> {

    DateTime queryByDate(@Param("dateTime")DateTime dateTime);


}