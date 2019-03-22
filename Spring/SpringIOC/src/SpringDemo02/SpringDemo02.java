package SpringDemo02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo02 {
	@Test
	public void demo01() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomService cs1 = (CustomService)ac.getBean("customService");
		System.out.println(cs1);
		CustomService cs2 = (CustomService)ac.getBean("customService");
		System.out.println(cs2);
		System.out.println(cs1== cs2);
		ac.close();
	}
}
