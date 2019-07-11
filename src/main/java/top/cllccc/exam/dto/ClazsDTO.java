package top.cllccc.exam.dto;

import lombok.Data;
import top.cllccc.exam.domain.Student;

import java.util.List;

@Data
public class ClazsDTO {
    private String classNo;
    private String className;
    private int classCount;//班级人数
    private String depNo;
    private List<Student> students;
}
