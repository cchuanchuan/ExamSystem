package top.cllccc.exam.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.cllccc.exam.ExamApplication;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.domain.Student;
import top.cllccc.exam.service.ClazsService;
import top.cllccc.exam.service.StudentService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ExamApplication.class)
public class ClazsTest {
    @Autowired
    private ClazsService clazsService;

    @Before
    public void before(){
    }
    @After
    public void after(){
    }

    @Test
    public void test(){
        Clazs clazs = clazsService.queryClazsByNo("0001");
        System.out.println(clazs);
        System.out.println();
    }
}
