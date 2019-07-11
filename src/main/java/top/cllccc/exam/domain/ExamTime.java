package top.cllccc.exam.domain;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import lombok.Data;

//考试安排
@Data
public class ExamTime {
    private String examNo;
    private String timeNo;
}
