package top.cllccc.exam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.cllccc.exam.dao.ClassRoomDao;
import top.cllccc.exam.dao.ClazsDao;
import top.cllccc.exam.dao.CourseDao;
import top.cllccc.exam.dao.ExamDao;
import top.cllccc.exam.domain.ClassRoom;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.domain.Course;
import top.cllccc.exam.domain.Exam;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamTest {

    @Autowired
    private ExamDao examDao;
    @Test
    public void contextLoads() {
        //学生信息
        System.out.println(examDao);
        Exam exam = new Exam();
        exam.setCourseNo("c001");
        exam.setExamNo("e005");

        int result = examDao.addExam(exam);
        exam.setCourseNo("c002");
        System.out.println(result);
        List<Exam>clazsList = examDao.getAllExam();
        for (Exam s:clazsList){
            System.out.println(s);
        }
        int result3 = examDao.deleteExam(exam.getExamNo());
    }
}