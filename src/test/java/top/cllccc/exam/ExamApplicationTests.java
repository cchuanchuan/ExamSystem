package top.cllccc.exam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.cllccc.exam.domain.Clazs;
import top.cllccc.exam.service.ClazsService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamApplicationTests {

	@Autowired
	private ClazsService clazsService;
	@Test
	public void contextLoads() {
		Clazs clazs = clazsService.queryClazsByNo("0001");
		System.out.println(clazs);
		System.out.println();
	}

}
