package springDemo04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo04 {
	//构造方法方式注入
	@Test
	public void demo01() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Cars car = (Cars)applicationContext.getBean("car");
		System.out.println(car);
	}
	//set方式属性注入
	@Test
	public void demo02() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Cars02 car2 = (Cars02)applicationContext.getBean("car2");
		System.out.println(car2);
	}
	
	@Test
	public void demo03() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Buyer buyer2 = (Buyer)applicationContext.getBean("buyer");
		System.out.println(buyer2);
	}
}
