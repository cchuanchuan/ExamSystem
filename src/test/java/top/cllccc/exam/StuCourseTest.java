package top.cllccc.exam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.cllccc.exam.dao.ClazsDao;
import top.cllccc.exam.dao.StuCourseDao;
import top.cllccc.exam.dao.StudentDao;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.domain.StuCourse;
import top.cllccc.exam.domain.Student;
import top.cllccc.exam.service.ClazsService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StuCourseTest {

    @Autowired
    private StuCourseDao stuCourseDao;
    @Test
    public void contextLoads() {
        System.out.println(stuCourseDao);
        StuCourse stuCourse = new StuCourse();
        stuCourse.setStudentNo("202161109");
        stuCourse.setCourseNo("c002");
        stuCourse.setScore(-1);

        int result = stuCourseDao.addStuCourse(stuCourse);
        stuCourse.setScore(100);
        int result2 = stuCourseDao.updateStuCourse(stuCourse);
        System.out.println(result);
        System.out.println(result2);
        List<StuCourse>clazsList = stuCourseDao.getAllStuCourse();
        for (StuCourse s:clazsList){
            System.out.println(s);
        }
        stuCourseDao.deleteStuCourse(stuCourse.getStudentNo(),stuCourse.getCourseNo());
    }
}