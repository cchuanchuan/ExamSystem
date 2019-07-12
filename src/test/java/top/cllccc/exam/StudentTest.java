package top.cllccc.exam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.cllccc.exam.dao.StudentDao;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.domain.Student;
import top.cllccc.exam.service.ClazsService;

import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {

    @Autowired
    private ClazsService clazsService;

    @Autowired
    DataSource dataSource;
    @Autowired
    private StudentDao studentDao;
    @Test
    public void contextLoads() {
        System.out.println(dataSource);
        //学生信息
		System.out.println(studentDao);
		Student student = new Student();
		student.setStudentNo("202161113");
		student.setStudentPassword("123");
		student.setStudentName("student");
		student.setStudentAddress("chinn");
		student.setStudentPhone("999999999");
        student.setClassNo("c001");
        student.setStudentSex("女");
		int result = studentDao.addStudent(student);
        student.setStudentName("ccccc");
        int result2 = studentDao.updateStudent(student);
		System.out.println(result);
        System.out.println(result2);
        List<Student> studentList = studentDao.getAllStudent();
        for (Student s:studentList){
            System.out.println(s);
        }
        studentDao.deleteStudent(student.getStudentNo());
    }
}