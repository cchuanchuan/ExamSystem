package top.cllccc.exam.domain;

import javax.persistence.*;

public class Course {
    @Column(name = "course_no")
    private String courseNo;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_semester")
    private String courseSemester;

    @Column(name = "c_limit")
    private Integer cLimit;

    private String remark;

    /**
     * @return course_no
     */
    public String getCourseNo() {
        return courseNo;
    }

    /**
     * @param courseNo
     */
    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    /**
     * @return course_name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return course_semester
     */
    public String getCourseSemester() {
        return courseSemester;
    }

    /**
     * @param courseSemester
     */
    public void setCourseSemester(String courseSemester) {
        this.courseSemester = courseSemester;
    }

    /**
     * @return c_limit
     */
    public Integer getcLimit() {
        return cLimit;
    }

    /**
     * @param cLimit
     */
    public void setcLimit(Integer cLimit) {
        this.cLimit = cLimit;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}