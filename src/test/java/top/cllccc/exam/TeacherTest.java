package top.cllccc.exam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.cllccc.exam.dao.TeacherDao;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.domain.Teacher;
import top.cllccc.exam.service.ClazsService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherTest {

    @Autowired
    private ClazsService clazsService;

    @Autowired
    private TeacherDao teacherDao;
    @Test
    public void contextLoads() {
        System.out.println(teacherDao);
        Teacher teacher = new Teacher();
        teacher.setTeacherNo("t005");
        teacher.setTeacherPassword("123");
        teacher.setTeacherName("teacher");
        teacher.setTeacherPhone("999999999");
        teacher.setTeacherProf("高级教师");
        teacher.setDepNo("d001");
        int result = teacherDao.addTeacher(teacher);
        teacher.setTeacherName("ccccc");
        int result2 = teacherDao.updateTeacher(teacher);
        System.out.println(result);
        System.out.println(result2);
        List<Teacher> teacherList = teacherDao.getAllTeacher();
        for (Teacher s:teacherList){
            System.out.println(s);
        }
        teacherDao.deleteTeacher(teacher.getTeacherNo());
    }
}