package top.cllccc.exam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.cllccc.exam.dao.ClazsDao;
import top.cllccc.exam.dao.CourseTimeDao;
import top.cllccc.exam.dao.StudentDao;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.domain.CourseTime;
import top.cllccc.exam.domain.Student;
import top.cllccc.exam.service.ClazsService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseTimeTest {

    @Autowired
    private CourseTimeDao courseTimeDao;
    @Test
    public void contextLoads() {
        System.out.println(courseTimeDao);
        CourseTime courseTime = new CourseTime();
        courseTime.setCourseNo("c005");
        courseTime.setTimeNo("t005");

        int result = courseTimeDao.addCourseTime(courseTime);
        System.out.println(result);
        List<CourseTime>clazsList = courseTimeDao.getAllCourseTime();
        for (CourseTime s:clazsList){
            System.out.println(s);
        }
        courseTimeDao.deleteCourseTime(courseTime.getTimeNo(),courseTime.getCourseNo());
    }
}