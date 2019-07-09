package top.cllccc.exam.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class Clazs {
    private String classNo;
    private String className;
    private String classCount;//班级人数
    private List<Student> students;
    private String depNo;


}
