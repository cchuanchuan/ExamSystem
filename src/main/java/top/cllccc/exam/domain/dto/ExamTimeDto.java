package top.cllccc.exam.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.omg.CORBA.INTERNAL;

import java.util.Date;


/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/9/9 10:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamTimeDto {

    /**
     * 学期
     */
    private Integer gradeId;

    /**
     * 日期
     */
    private Date timeDate;

    /**
     * 节
     */
    private Integer timeOrder;
}
