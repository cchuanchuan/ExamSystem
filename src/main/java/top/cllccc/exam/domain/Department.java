package top.cllccc.exam.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NegativeOrZero;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dep_name")
    private String depName;

    @Column(name = "dep_leader")
    private String depLeader;

    @Column(name = "dep_phone")
    private String depPhone;

    @Column(name = "dep_detail")
    private String depDetail;
}