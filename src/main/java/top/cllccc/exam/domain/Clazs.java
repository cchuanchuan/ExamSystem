package top.cllccc.exam.domain;

import javax.persistence.*;

public class Clazs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "class_name")
    private String className;

    /**
     * 班级人数
     */
    @Column(name = "class_grade")
    private Integer classGrade;

    @Column(name = "class_count")
    private Integer classCount;

    @Column(name = "dep_id")
    private Integer depId;

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
     * @return class_name
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 获取班级人数
     *
     * @return class_grade - 班级人数
     */
    public Integer getClassGrade() {
        return classGrade;
    }

    /**
     * 设置班级人数
     *
     * @param classGrade 班级人数
     */
    public void setClassGrade(Integer classGrade) {
        this.classGrade = classGrade;
    }

    /**
     * @return class_count
     */
    public Integer getClassCount() {
        return classCount;
    }

    /**
     * @param classCount
     */
    public void setClassCount(Integer classCount) {
        this.classCount = classCount;
    }

    /**
     * @return dep_id
     */
    public Integer getDepId() {
        return depId;
    }

    /**
     * @param depId
     */
    public void setDepId(Integer depId) {
        this.depId = depId;
    }
}