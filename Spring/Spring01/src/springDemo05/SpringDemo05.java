package springDemo05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * 集合类型的属性注入
 */
public class SpringDemo05 {
	@Test
	public void demo01() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionBean cb = (CollectionBean)applicationContext.getBean("collectionBean");
		System.out.println(cb);
	}
}
