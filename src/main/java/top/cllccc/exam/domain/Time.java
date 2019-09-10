package top.cllccc.exam.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "grade_id")
    private Integer gredeId;


    @Column(name = "date_id")
    private Integer dateId;

    @Column(name = "time_order")
    private Integer timeOrder;

}