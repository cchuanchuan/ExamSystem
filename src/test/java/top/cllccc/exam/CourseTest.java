package top.cllccc.exam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.cllccc.exam.dao.ClazsDao;
import top.cllccc.exam.dao.CourseDao;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.domain.Course;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseTest {

    @Autowired
    private CourseDao courseDao;
    @Test
    public void contextLoads() {
        //学生信息
        System.out.println(courseDao);
        Course course = new Course();
        course.setCourseNo("c005");
        course.setCourseName("C语言");

        int result = courseDao.addCourse(course);
        course.setCourseName("CC语言");
        int result2 = courseDao.updateCourse(course);
        System.out.println(result);
        System.out.println(result2);
        List<Course>clazsList = courseDao.getAllCourse();
        for (Course s:clazsList){
            System.out.println(s);
        }
        int result3 = courseDao.deleteCourse(course.getCourseNo());
    }
}