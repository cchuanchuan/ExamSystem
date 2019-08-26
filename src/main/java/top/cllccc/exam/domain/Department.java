package top.cllccc.exam.domain;

import javax.persistence.*;

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dep_name")
    private String depName;

    @Column(name = "dep_leader")
    private String depLeader;

    @Column(name = "dep_phone")
    private String depPhone;

    @Column(name = "dep_detail")
    private String depDetail;

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
     * @return dep_name
     */
    public String getDepName() {
        return depName;
    }

    /**
     * @param depName
     */
    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * @return dep_leader
     */
    public String getDepLeader() {
        return depLeader;
    }

    /**
     * @param depLeader
     */
    public void setDepLeader(String depLeader) {
        this.depLeader = depLeader;
    }

    /**
     * @return dep_phone
     */
    public String getDepPhone() {
        return depPhone;
    }

    /**
     * @param depPhone
     */
    public void setDepPhone(String depPhone) {
        this.depPhone = depPhone;
    }

    /**
     * @return dep_detail
     */
    public String getDepDetail() {
        return depDetail;
    }

    /**
     * @param depDetail
     */
    public void setDepDetail(String depDetail) {
        this.depDetail = depDetail;
    }
}