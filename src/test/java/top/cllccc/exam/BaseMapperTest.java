package top.cllccc.exam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.mybatis.mapper.common.BaseMapper;
import top.cllccc.exam.domain.Time;

import java.util.List;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/8/27 17:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class BaseMapperTest {

    @Autowired
    BaseMapper<Time> baseMapper;

    @Test
    public void test() {
        List<Time> times = baseMapper.selectAll();

        for(Time t: times){
            System.out.println(t);
        }
    }

}
