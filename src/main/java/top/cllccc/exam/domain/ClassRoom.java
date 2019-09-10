package top.cllccc.exam.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "class_room")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "room_no")
    private String roomNo;

    @Column(name = "room_place")
    private String roomPlace;

    @Column(name = "room_capacity")
    private Integer roomCapacity;
}