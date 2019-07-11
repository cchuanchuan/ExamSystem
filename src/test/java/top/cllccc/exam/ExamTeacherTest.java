package top.cllccc.exam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.cllccc.exam.dao.ClazsDao;
import top.cllccc.exam.dao.ExamTeacherDao;
import top.cllccc.exam.dao.StudentDao;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.domain.ExamTeacher;
import top.cllccc.exam.domain.Student;
import top.cllccc.exam.service.ClazsService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamTeacherTest {

    @Autowired
    private ExamTeacherDao examTeacherDao;
    @Test
    public void contextLoads() {
        System.out.println(examTeacherDao);
        ExamTeacher examTeacher = new ExamTeacher();
        examTeacher.setExamNo("e005");
        examTeacher.setTeacherNo("t005");

        int result = examTeacherDao.addExamTeacher(examTeacher);
        System.out.println(result);
        List<ExamTeacher>clazsList = examTeacherDao.getAllExamTeacher();
        for (ExamTeacher s:clazsList){
            System.out.println(s);
        }
        examTeacherDao.deleteExamTeacher(examTeacher);
    }
}