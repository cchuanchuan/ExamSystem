package top.cllccc.exam.domain;

import lombok.Data;

//学生选课
@Data
public class StuCourse {
    private String studentNo;
    private String courseNo;
    private double score;
}
