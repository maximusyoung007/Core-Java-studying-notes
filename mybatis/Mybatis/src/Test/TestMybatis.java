package Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pojo.Category;
import pojo.Order;
import pojo.OrderItem;
import pojo.Product;

public class TestMybatis {
	public static void main(String[] args) throws IOException {
		//根据配置文件mybatis-config.xml得到sqlSessionFactory 。
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		//然后再根据sqlSessionFactory 得到session
		SqlSession session = sqlSessionFactory.openSession();
		
		/*
		 * 最后通过session的selectList方法，调用sql语句listCategory。
		 * listCategory这个就是在配置文件Category.xml中那条sql语句设置的id。
		 * 执行完毕之后，得到一个Category集合，遍历即可看到数据。
		 */
		/*List<Category> cs = session.selectList("listCategory");
		for(Category c : cs) {
			System.out.println(c.getId() + " : " + c.getName());
		}
		
		List<Product> ps = session.selectList("listProduct");
		for(Product p : ps) {
			System.out.println(p.getId() + " " + p.getName() + " " + p.getPrice());
		}
		
		Category c = new Category();
		//c.setName("newCategory");
		//session.insert("addCategory",c);插入
		c.setId(6);
		//删除
		session.delete("deleteCategory",c);
		
		//选择一个
		Category c1 = session.selectOne("getCategory",3);
		System.out.println(c1.getId() + " " + c1.getName() + "\n");
		
		c1.setName("修改category的内容");
		//修改
		session.update("updateCategory",c1);
		listAll(session);
		
		System.out.println("模糊查询");
		List<Category> cs = session.selectList("listCategoryByName","6");
		for(Category c2 : cs) {
			System.out.println(c2.getName());
		}
		
		System.out.println("多条件查询");
		//因为是多个参数，而selectList方法又只接受一个参数对象，所以需要把多个参数放在Map里，然后把这个Map对象作为参数传递进去
		Map<String,Object> params = new HashMap<>();
		params.put("id", 3);
		params.put("name","ne");
		List<Category> cs2 = session.selectList("listCategoryByIdAndName",params);
		for(Category c3 : cs2) {
			System.out.println(c3.getName());
		}*/
		
		/*List<Category> cs = session.selectList("listCategory");
		for(Category c : cs) {
			System.out.println(c);
			List<Product> ps = c.getProducts();
			for(Product p : ps) {
				System.out.println("\t" + p);
			}
		}*/
		
		/*List<Product> ps = session.selectList("listProduct");
		for(Product p : ps) {
			System.out.println(p+" 对应的分类是 \t "+ p.getCategory());
		}*/
		//listOrder(session);
		System.out.println("查询所有的");
		List<Product> ps = session.selectList("listProduct");
		for(Product p : ps) {
			System.out.println(p);
		}
		/*System.out.println("模糊查询");
		Map<String,Object> params = new HashMap<>();
		params.put("name","a");
		params.put("price","10");
		List<Product> ps2 = session.selectList("listProduct",params);
        for (Product p : ps2) {
            System.out.println(p);
        }  */
		/*System.out.println("多条件查询");
        Map<String,Object> params = new HashMap<>();
        //params.put("name","a");
        params.put("price","10");
        List<Product> ps2 = session.selectList("listProduct",params);
        for (Product p : ps2) {
            System.out.println(p);
        }  */
		Product p = new Product();
		p.setId(6);
		p.setName("product z");
		p.setPrice(92);
		session.update("updateProduct",p);
		System.out.println("查询更改后的：");
		
		listAll(session);
		session.commit();
		session.close();
	}
	
	public static void listAll(SqlSession session) {
		/*List<Category> cs = session.selectList("listCategory");
		for(Category c : cs) {
			System.out.println(c.getId() + " : " + c.getName());
		}*/
		List<Product> ps = session.selectList("listProduct");
		for(Product p : ps) {
			System.out.println(p);
		}
		
	}
	public static void listOrder(SqlSession session) {
		List<Order> os = session.selectList("listOrder");
		for(Order o : os) {
			System.out.println(o.getCode());
			List<OrderItem> ois = o.getOrderItems();
			for(OrderItem oi : ois) {
				System.out.format("\t%s\t%f\t%d%n", 
				oi.getProduct().getName(),oi.getProduct().getPrice(),oi.getNumber());
			}
		}
	}
	private static void deleteOrderItem(SqlSession session) {
		Order o1 = session.selectOne("getOrder",1);
		Product p6 = session.selectOne("getProduct",6);
		OrderItem oi = new OrderItem();
		oi.setProduct(p6);
		oi.setOrder(o1);
		session.delete("deleteOrderItem",oi);
	}
	private static void addOrderItem(SqlSession session) {
		Order o1 = session.selectOne("getOrder",1);
		Product p6 = session.selectOne("getProduct",6);
		OrderItem oi = new OrderItem();
		oi.setProduct(p6);
        oi.setOrder(o1);
        oi.setNumber(200);
         
        session.insert("addOrderItem", oi);
	}
}
