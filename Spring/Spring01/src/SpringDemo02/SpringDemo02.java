package SpringDemo02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo02 {
	
	//Bean的生命周期
	public void demo01() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomDao customerDAO = (CustomDao)applicationContext.getBean("CustomDao");
		customerDAO.save();
		applicationContext.close();//单例创建，在这销毁
	}
	//Bean的作用范围
	@Test
	public void demo02() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomDao customDao1 = (CustomDao)applicationContext.getBean("CustomDao");
		System.out.println(customDao1);
		CustomDao customDao2 = (CustomDao)applicationContext.getBean("CustomDao");
		System.out.println(customDao2);
		System.out.println(customDao1 == customDao2);//customDao1和customDao2是同一个对象,默认情况是单例
		
	}
}
