package top.cllccc.exam.domain;

import javax.persistence.*;

@Table(name = "teach_plan")
public class TeachPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "course_no")
    private Integer courseNo;

    @Column(name = "teacher_no")
    private Integer teacherNo;

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
     * @return course_no
     */
    public Integer getCourseNo() {
        return courseNo;
    }

    /**
     * @param courseNo
     */
    public void setCourseNo(Integer courseNo) {
        this.courseNo = courseNo;
    }

    /**
     * @return teacher_no
     */
    public Integer getTeacherNo() {
        return teacherNo;
    }

    /**
     * @param teacherNo
     */
    public void setTeacherNo(Integer teacherNo) {
        this.teacherNo = teacherNo;
    }
}