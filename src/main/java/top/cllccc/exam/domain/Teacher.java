package top.cllccc.exam.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "teacher_no")
    private String teacherNo;

    @Column(name = "teacher_name")
    private String teacherName;

    @Column(name = "teacher_prof")
    private String teacherProf;

    @Column(name = "teacher_phone")
    private String teacherPhone;

    @Column(name = "teacher_password")
    private String teacherPassword;

    @Column(name = "dep_id")
    private String depId;

}