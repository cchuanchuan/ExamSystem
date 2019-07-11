package top.cllccc.exam.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class Clazs {
    private String classNo;
    private String className;
    private int classCount;//班级人数
    private String depNo;
}
