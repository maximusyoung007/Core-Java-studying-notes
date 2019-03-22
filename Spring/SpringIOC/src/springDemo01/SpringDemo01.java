package springDemo01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * SpringIOC注解开发的测试类
 * IOC注解详解：
 * 			@Component:组件，修饰一个类，将这个类交个spring管理，有三个衍生注解：@Controller @Service @Repository
 * 			属性注入的注解：
 * 			@Value 普通属性的值
 * 			@Autowired： 对象属性的值,按照类型注入
 * 			@Resource：对象类型的属性注入，按名称注入
 */
public class SpringDemo01 {
	//传统方式
	/*
	@Test
	public void Demo01() {
		UserDao userDAO = new UserDaoImpl();
		//userDAO.setName("朱元璋");
		userDAO.save();
	}*/
	
	//Spring IOC注解的方式
	@Test
	public void Demo02() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userdao = (UserDao)applicationContext.getBean("UserDao");
		userdao.IOCsave();
	}
	@Test
	public void Demo03() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService)applicationContext.getBean("userService");
		userService.save();
	}
	
}
