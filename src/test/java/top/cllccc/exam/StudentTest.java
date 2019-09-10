package top.cllccc.exam;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.cllccc.exam.dao.common.dao.StudentMapper;
import top.cllccc.exam.domain.Student;

/**
 * <h1>学生测试类</h1>
 *
 * @Author: CCC
 * @Date 2019/8/22 15:21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class StudentTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void test() throws Exception {
        Student student = new Student();
        student.setStudentNo("20216110119");
        student.setStudentPassword("123456");
        student.setStudentName("aaa");
        student.setStudentPhone("15561651-");
        student.setStudentAddress("china");
        student.setClassId(1);

        int restule = studentMapper.insert(student);
        System.out.println(restule);
        System.out.println(student.getId());


    }
}
