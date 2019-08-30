package top.cllccc.exam.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clazs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "class_name")
    private String className;

    /**
     * 班级人数
     */
    @Column(name = "class_grade")
    private Integer classGrade;

    @Column(name = "class_count")
    private Integer classCount;

    @Column(name = "dep_id")
    private Integer depId;

}