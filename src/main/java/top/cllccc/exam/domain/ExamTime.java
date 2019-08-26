package top.cllccc.exam.domain;

import javax.persistence.*;

@Table(name = "exam_time")
public class ExamTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "exam_id")
    private Integer examId;

    /**
     * 考试时间
     */
    @Column(name = "time_id")
    private Integer timeId;

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
     * 获取考试时间
     *
     * @return time_id - 考试时间
     */
    public Integer getTimeId() {
        return timeId;
    }

    /**
     * 设置考试时间
     *
     * @param timeId 考试时间
     */
    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
    }
}