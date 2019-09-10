package top.cllccc.exam;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.cllccc.exam.dao.common.dao.DateTimeMapper;
import top.cllccc.exam.dao.common.dao.TeacherMapper;
import top.cllccc.exam.dao.common.dao.TimeMapper;
import top.cllccc.exam.domain.DateTime;
import top.cllccc.exam.service.TeacherService;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/9/9 13:33
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class TeacherTest {

    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    TeacherService teacherService;

    @Autowired
    TimeMapper timeMapper;

    @Autowired
    DateTimeMapper dateTimeMapper;

    @Test
    public void test() throws Exception {

        Calendar myCalendar = new GregorianCalendar(2019, 9-1, 9);
        Date myDate = myCalendar.getTime();
        long d1 = myDate.getTime();

//        Date date = new Date(2019-1900, 9-1, 9);
//        System.out.println(date);

        DateTime dateTime = new DateTime();
        dateTime.setDate(myDate);


        List<DateTime> list1 = dateTimeMapper.selectAll();
        DateTime d = list1.get(0);

        long d2 = d.getDate().getTime();

        System.out.println(myDate);
        System.out.println(d.getDate());
        System.out.println("d1=" + d1 + ",d2=" + d2);
        List<DateTime> list2 = dateTimeMapper.select(dateTime);


        System.out.println(JSONObject.toJSONString(d));
        System.out.println(list1);
        System.out.println(list2);

//        System.out.println(list3);

    }
}
