package top.cllccc.exam.domain;

import javax.persistence.*;

@Table(name = "course_time")
public class CourseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "course_id")
    private Integer courseId;

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
     * @return course_id
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * @param courseId
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * @return time_id
     */
    public Integer getTimeId() {
        return timeId;
    }

    /**
     * @param timeId
     */
    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
    }
}