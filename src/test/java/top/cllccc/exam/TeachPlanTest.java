package top.cllccc.exam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.cllccc.exam.dao.ClazsDao;
import top.cllccc.exam.dao.TeachPlanDao;
import top.cllccc.exam.dao.StudentDao;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.domain.TeachPlan;
import top.cllccc.exam.domain.Student;
import top.cllccc.exam.service.ClazsService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeachPlanTest {

    @Autowired
    private TeachPlanDao teachPlanDao;
    @Test
    public void contextLoads() {
        System.out.println(teachPlanDao);
        TeachPlan teachPlan = new TeachPlan();
        teachPlan.setTeacherNo("t005");
        teachPlan.setCourseNo("c005");

        int result = teachPlanDao.addTeachPlan(teachPlan);
        System.out.println(result);
        List<TeachPlan>clazsList = teachPlanDao.getAllTeachPlan();
        for (TeachPlan s:clazsList){
            System.out.println(s);
        }
        teachPlanDao.deleteTeachPlan(teachPlan.getTeacherNo(),teachPlan.getCourseNo());
    }
}