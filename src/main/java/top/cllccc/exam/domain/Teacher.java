package top.cllccc.exam.domain;

import javax.persistence.*;

public class Teacher {
    @Column(name = "tc_no")
    private String tcNo;

    @Column(name = "tc_name")
    private String tcName;

    @Column(name = "tc_gender")
    private String tcGender;

    @Column(name = "tc_inst")
    private String tcInst;

    @Column(name = "tc_tel")
    private String tcTel;

    /**
     * @return tc_no
     */
    public String getTcNo() {
        return tcNo;
    }

    /**
     * @param tcNo
     */
    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    /**
     * @return tc_name
     */
    public String getTcName() {
        return tcName;
    }

    /**
     * @param tcName
     */
    public void setTcName(String tcName) {
        this.tcName = tcName;
    }

    /**
     * @return tc_gender
     */
    public String getTcGender() {
        return tcGender;
    }

    /**
     * @param tcGender
     */
    public void setTcGender(String tcGender) {
        this.tcGender = tcGender;
    }

    /**
     * @return tc_inst
     */
    public String getTcInst() {
        return tcInst;
    }

    /**
     * @param tcInst
     */
    public void setTcInst(String tcInst) {
        this.tcInst = tcInst;
    }

    /**
     * @return tc_tel
     */
    public String getTcTel() {
        return tcTel;
    }

    /**
     * @param tcTel
     */
    public void setTcTel(String tcTel) {
        this.tcTel = tcTel;
    }
}