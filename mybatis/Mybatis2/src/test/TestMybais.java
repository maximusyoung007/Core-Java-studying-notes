package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mapper.CategoryMapper;
import mapper.OrderMapper;
import mapper.ProductMapper;
import pojo.Category;
import pojo.Order;
import pojo.OrderItem;
import pojo.Product;

public class TestMybais {
	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		CategoryMapper cmapper = session.getMapper(CategoryMapper.class);
		ProductMapper pmapper = session.getMapper(ProductMapper.class);
		//add(cmapper);
		//delete(cmapper);
		//update(cmapper);
		//get(cmapper);
		//listAll(cmapper);
		/*List<Product> ps = pmapper.list();
		for(Product p : ps) {
			System.out.println(p + "\t对应的分类是:\t" + p.getCategory().getName());
		}*/
		listOrder(session);
	}
	private static void add(CategoryMapper mapper) {
		Category c = new Category();
		c.setName("新增加的Category");
		mapper.add(c);
		listAll(mapper);
	}
	
	private static void delete(CategoryMapper mapper) {
		mapper.delete(12);
		listAll(mapper);
	}
	
	private static void update(CategoryMapper mapper) {
		Category c = mapper.get(1);
		c.setName("Category1");
		mapper.update(c);
		listAll(mapper);
	}
	private static void get(CategoryMapper mapper) {
		Category c= mapper.get(2);
        System.out.println(c.getName());
	}
	private static void listAll(CategoryMapper mapper) {
		List<Category> cs = mapper.list();
		for(Category c : cs) {
			System.out.println(c.getName());
			List<Product> ps = c.getProducts();
			for(Product p : ps) {
				System.out.println(p.getId() + " " + p.getName());
			}
		}
	}
	public static void listOrder(SqlSession session) {
		OrderMapper mapper =session.getMapper(OrderMapper.class);
        List<Order> os = mapper.list();
        for (Order o : os) {
            System.out.println(o.getCode());
            List<OrderItem> ois = o.getOrderItems();
            if(null != ois){
                for (OrderItem oi : ois) {
                    System.out.format("\t%s\t%f\t%d%n", oi.getProduct().getName(),oi.getProduct().getPrice(),oi.getNumber());
                }              
            }
 
        }
    }
}
