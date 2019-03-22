package SpringDemo03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo3 {
	@Test
	public void demo01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductService ps = (ProductService)ac.getBean("productService");
		ps.save();
	}
}
