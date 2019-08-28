package top.cllccc.exam.domain;

import lombok.Data;

import javax.persistence.*;

@Data
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "time_grade")
    private Integer timeGrade;

    @Column(name = "time_semester")
    private Integer timeSemester;

    @Column(name = "time_week")
    private Integer timeWeek;

    @Column(name = "time_day")
    private Integer timeDay;

    /**
     * 第order节课
     */
    @Column(name = "time_order")
    private Integer timeOrder;

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
     * @return time_grade
     */
    public Integer getTimeGrade() {
        return timeGrade;
    }

    /**
     * @param timeGrade
     */
    public void setTimeGrade(Integer timeGrade) {
        this.timeGrade = timeGrade;
    }

    /**
     * @return time_semester
     */
    public Integer getTimeSemester() {
        return timeSemester;
    }

    /**
     * @param timeSemester
     */
    public void setTimeSemester(Integer timeSemester) {
        this.timeSemester = timeSemester;
    }

    /**
     * @return time_week
     */
    public Integer getTimeWeek() {
        return timeWeek;
    }

    /**
     * @param timeWeek
     */
    public void setTimeWeek(Integer timeWeek) {
        this.timeWeek = timeWeek;
    }

    /**
     * @return time_day
     */
    public Integer getTimeDay() {
        return timeDay;
    }

    /**
     * @param timeDay
     */
    public void setTimeDay(Integer timeDay) {
        this.timeDay = timeDay;
    }

    /**
     * 获取第order节课
     *
     * @return time_order - 第order节课
     */
    public Integer getTimeOrder() {
        return timeOrder;
    }

    /**
     * 设置第order节课
     *
     * @param timeOrder 第order节课
     */
    public void setTimeOrder(Integer timeOrder) {
        this.timeOrder = timeOrder;
    }
}