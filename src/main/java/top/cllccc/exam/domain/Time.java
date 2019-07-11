package top.cllccc.exam.domain;

import lombok.Data;

//课程时间安排
@Data
public class Time {
    private String timeNo;
    private int timeWeek;
    private int timeDay;
    private int timeOrder;//第几节课
}
