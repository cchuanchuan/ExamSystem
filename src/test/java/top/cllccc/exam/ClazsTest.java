package top.cllccc.exam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.cllccc.exam.dao.ClazsDao;
import top.cllccc.exam.dao.StudentDao;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.domain.Student;
import top.cllccc.exam.service.ClazsService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClazsTest {

    @Autowired
    private ClazsDao clazsDao;
    @Test
    public void contextLoads() {
		/*Clazs clazs = clazsService.getClazsByNo("0001");
		System.out.println(clazs);
		System.out.println();*/
        //学生信息
        System.out.println(clazsDao);
        Clazs clazs = new Clazs();
        clazs.setClassNo("c005");
        clazs.setClassName("计算机161");
        clazs.setClassCount(60);

        int result = clazsDao.addClazs(clazs);
        clazs.setClassName("class");
        int result2 = clazsDao.updateClazs(clazs);
        System.out.println(result);
        System.out.println(result2);
        List<Clazs>clazsList = clazsDao.getAllClazs();
        for (Clazs s:clazsList){
            System.out.println(s);
        }
    }
}