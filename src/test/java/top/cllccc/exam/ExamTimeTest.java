package top.cllccc.exam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.cllccc.exam.dao.ClazsDao;
import top.cllccc.exam.dao.ExamTimeDao;
import top.cllccc.exam.dao.StudentDao;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.domain.ExamTime;
import top.cllccc.exam.domain.Student;
import top.cllccc.exam.service.ClazsService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamTimeTest {

    @Autowired
    private ExamTimeDao examTimeDao;
    @Test
    public void contextLoads() {
        System.out.println(examTimeDao);
        ExamTime examTime = new ExamTime();
        examTime.setExamNo("e005");
        examTime.setTimeNo("t005");

        int result = examTimeDao.addExamTime(examTime);
        System.out.println(result);
        List<ExamTime>clazsList = examTimeDao.getAllExamTime();
        for (ExamTime s:clazsList){
            System.out.println(s);
        }
        examTimeDao.deleteExamTime(examTime);
    }
}