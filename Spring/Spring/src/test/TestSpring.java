package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Category;
import pojo.Product;
import service.ProductService;
import service.cityService;

public class TestSpring {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext
				(new String[] {"applicationContext.xml"});
		Category c = (Category) context.getBean("c");
		System.out.println(c.getName());
		
		/*ApplicationContext context2 = new ClassPathXmlApplicationContext
				(new String[] {"applicationContext.xml"});*/
		Product p = (Product) context.getBean("p");
		System.out.println(p.getpName());
		System.out.println(p.getCategory().getName());
		
		ProductService s = (ProductService) context.getBean("s");
		s.doSomeService();
		
		cityService ci = (cityService) context.getBean("ci");
		ci.outputCity();
	}
}
