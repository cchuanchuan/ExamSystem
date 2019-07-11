package top.cllccc.exam.dto;

import lombok.Data;
import top.cllccc.exam.domain.Clazs;

//@Table(name="student")
@Data
public class StudentDTO {
    //@Column(name = "student_no",type = "varchar")
    private String studentNo;
    private String studentPassword;
    private String studentName;
    private String studentSex;
    private String studentPhone;
    private String studentAddress;
    private String classNo;
    private Clazs clazs;

}

