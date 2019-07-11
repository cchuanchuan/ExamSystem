package top.cllccc.exam.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

//@Table(name="student")
@Data
public class Student {
    //@Column(name = "student_no",type = "varchar")
    private String studentNo;
    private String studentPassword;
    private String studentName;
    private String studentSex;
    private String studentPhone;
    private String studentAddress;
    private String classNo;
}

