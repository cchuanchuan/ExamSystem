package top.cllccc.exam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.cllccc.exam.dao.TimeDao;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.domain.Time;
import top.cllccc.exam.service.ClazsService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TimeTest {
    @Autowired
    private TimeDao timeDao;
    @Test
    public void contextLoads() {
        System.out.println(timeDao);
        Time time = new Time();
        time.setTimeWeek(10);
        time.setTimeDay(2);
        time.setTimeNo("t005");
        time.setTimeOrder(8);
        int result = timeDao.addTime(time);
        time.setTimeOrder(5);
        int result2 = timeDao.updateTime(time);
        System.out.println(result);
        System.out.println(result2);
        List<Time> timeList = timeDao.getAllTime();
        for (Time s:timeList){
            System.out.println(s);
        }
        timeDao.deleteTime(time.getTimeNo());
    }
}