package txDemo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx2.xml")
public class SpringDemo1 {
	@Resource(name="accountService")
	private AccountService accountService;
	@Test
	public void demo01() {
		accountService.transfer("坎特","拿破仑", 1000d);
	}
}
