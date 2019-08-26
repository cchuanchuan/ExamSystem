package top.cllccc.exam.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "student_no")
    private String studentNo;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_sex")
    private String studentSex;

    @Column(name = "student_phone")
    private String studentPhone;

    @Column(name = "student_address")
    private String studentAddress;

    @Column(name = "class_id")
    private String classId;

    @Column(name = "student_password")
    private String studentPassword;

}