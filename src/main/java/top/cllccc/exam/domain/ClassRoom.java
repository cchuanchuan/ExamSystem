package top.cllccc.exam.domain;

import javax.persistence.*;

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

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return room_no
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * @param roomNo
     */
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    /**
     * @return room_place
     */
    public String getRoomPlace() {
        return roomPlace;
    }

    /**
     * @param roomPlace
     */
    public void setRoomPlace(String roomPlace) {
        this.roomPlace = roomPlace;
    }

    /**
     * @return room_capacity
     */
    public Integer getRoomCapacity() {
        return roomCapacity;
    }

    /**
     * @param roomCapacity
     */
    public void setRoomCapacity(Integer roomCapacity) {
        this.roomCapacity = roomCapacity;
    }
}