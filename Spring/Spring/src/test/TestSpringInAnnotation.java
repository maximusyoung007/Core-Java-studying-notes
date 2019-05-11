package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pojo.Category;

@RunWith(SpringJUnit4ClassRunner.class) // 表明是一个spring的测试类
@ContextConfiguration("classpath:applicationContext.xml") //定位spring的配置文件

public class TestSpringInAnnotation {
	@Autowired //给这个测试类装配Category对象
	Category c;
	@Test
	public void test() {
		System.out.println(c.getName());
	}
}
