package top.cllccc.exam.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.cllccc.exam.ExamApplication;
import top.cllccc.exam.domain.Student;
import top.cllccc.exam.service.StudentService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ExamApplication.class)
public class StudentTest {
    @Autowired
    private StudentService studentService;

    @Before
    public void before(){
    }
    @After
    public void after(){
    }

    @Test
    public void test(){
        List<Student> students = studentService.queryAllStudent();
        System.out.println(students);
        System.out.println();
        Student student = studentService.queryStudentByNo("202161109");
        System.out.println(student);
    }
}
