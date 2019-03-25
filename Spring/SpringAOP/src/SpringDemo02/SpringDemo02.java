package SpringDemo02;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//Spring整合单元测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo02 {
	@Resource(name="orderDao")
	private OrderDao orderDao;
	@Test
	public void demo01() {
		orderDao.save();
		orderDao.update();
		orderDao.delete();
		orderDao.find();
	}
}
