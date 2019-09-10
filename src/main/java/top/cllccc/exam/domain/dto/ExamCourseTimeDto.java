package top.cllccc.exam.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/9/9 19:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamCourseTimeDto {

    private ExamTimeDto examTimeDto;

    private Integer courseId;
}
