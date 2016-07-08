package mvn1;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.kael.pojo.User;
import org.kael.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	private ApplicationContext ac = null;
	@Resource
	private IUserService userService = null;

	@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		userService = (IUserService) ac.getBean("userService");
	}

	@Test
	public void test1() {
		User user = userService.getUserById(1);
		System.out.println(user.getUserName());
		logger.info("值：" + user.getUserName());
	}
}
