package pojo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//为Product类加上@Component注解，即表明此类是bean
@Component("p")
public class Product {
	private int id;
	////因为配置从applicationContext.xml中移出来了，所以属性初始化放在属性声明上进行
	private String pName = "Product 1";
	//@Autowired
	//@Resource(name="c")
	@Autowired
	private Category category;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public Category getCategory() {
		return category;
	}
	
	//@Autowired
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
