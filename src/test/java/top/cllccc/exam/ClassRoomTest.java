package top.cllccc.exam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.cllccc.exam.dao.ClassRoomDao;
import top.cllccc.exam.dao.ClazsDao;
import top.cllccc.exam.dao.CourseDao;
import top.cllccc.exam.domain.ClassRoom;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.domain.Course;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassRoomTest {

    @Autowired
    private ClassRoomDao classRoomDao;
    @Test
    public void contextLoads() {
        //学生信息
        System.out.println(classRoomDao);
        ClassRoom classRoom = new ClassRoom();
        classRoom.setRoomNo("c005");
        classRoom.setRoomSeats(100);
        classRoom.setRoomName("A101");

        int result = classRoomDao.addClassRoom(classRoom);
        classRoom.setRoomName("B101");
        int result2 = classRoomDao.updateClassRoom(classRoom);
        System.out.println(result);
        System.out.println(result2);
        List<ClassRoom>clazsList = classRoomDao.getAllClassRoom();
        for (ClassRoom s:clazsList){
            System.out.println(s);
        }
        int result3 = classRoomDao.deleteClassRoom(classRoom.getRoomNo());
    }
}