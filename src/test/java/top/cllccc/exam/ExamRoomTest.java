package top.cllccc.exam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.cllccc.exam.dao.ClazsDao;
import top.cllccc.exam.dao.ExamRoomDao;
import top.cllccc.exam.dao.StudentDao;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.domain.ExamRoom;
import top.cllccc.exam.domain.Student;
import top.cllccc.exam.service.ClazsService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamRoomTest {

    @Autowired
    private ExamRoomDao examRoomDao;
    @Test
    public void contextLoads() {
        System.out.println(examRoomDao);
        ExamRoom examRoom = new ExamRoom();
        examRoom.setExamNo("e005");
        examRoom.setRoomNo("r005");

        int result = examRoomDao.addExamRoom(examRoom);
        System.out.println(result);
        List<ExamRoom>clazsList = examRoomDao.getAllExamRoom();
        for (ExamRoom s:clazsList){
            System.out.println(s);
        }
        examRoomDao.deleteExamRoom(examRoom);
    }
}