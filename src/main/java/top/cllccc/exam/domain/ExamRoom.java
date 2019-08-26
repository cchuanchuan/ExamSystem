package top.cllccc.exam.domain;

import javax.persistence.*;

@Table(name = "exam_room")
public class ExamRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "exam_id")
    private String examId;

    @Column(name = "room_id")
    private String roomId;

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
     * @return exam_id
     */
    public String getExamId() {
        return examId;
    }

    /**
     * @param examId
     */
    public void setExamId(String examId) {
        this.examId = examId;
    }

    /**
     * @return room_id
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * @param roomId
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
}