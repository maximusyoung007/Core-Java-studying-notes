package springDemo01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo01 {
	//传统方式
	@Test
	public void test01() {
		//UserDao us = new UserDaoHibernateImp();
		UserDaoImpl userDAO = new UserDaoImpl();//接口中没有setName方法
		userDAO.setName("Chelsea");
		userDAO.save();
		//us.save();
	}
	
	//Spring方式调用
	@Test
	public void test02() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao user = (UserDao)applicationContext.getBean("userDAO");
		user.save();
		//UserDao user2 = (UserDao)applicationContext.getBean("userH");
		//user2.save();
	}
	
	//加载磁盘上的配置文件
	@Test
	public void test03() {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("C:\\applicationContext.xml");
		UserDao user = (UserDao)applicationContext.getBean("userDAO");
		user.save();
	}
}
