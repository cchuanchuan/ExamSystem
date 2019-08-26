package top.cllccc.exam.domain;

import javax.persistence.*;

@Table(name = "exam_teacher")
public class ExamTeacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "exam_id")
    private Integer examId;

    /**
     * 监考老师
     */
    @Column(name = "teacher_id")
    private Integer teacherId;

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
    public Integer getExamId() {
        return examId;
    }

    /**
     * @param examId
     */
    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    /**
     * 获取监考老师
     *
     * @return teacher_id - 监考老师
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * 设置监考老师
     *
     * @param teacherId 监考老师
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}