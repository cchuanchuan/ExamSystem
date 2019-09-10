package top.cllccc.exam.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/9/10 14:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddExamDto {

    private Integer examId;

    private ExamTimeDto examTimeDto;

    private Integer courseId;

    private List<Integer> teacherIds;

    private List<Integer> roomIds;


}
