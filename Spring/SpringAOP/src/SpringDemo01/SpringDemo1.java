package SpringDemo01;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//Spring整合单元测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo1 {
	@Resource(name="productDao")
	private ProductDao productDao;
	@Test
	public void demo01() {
		productDao.save();
		productDao.update();
		productDao.find();
		productDao.delete();
	}
}
