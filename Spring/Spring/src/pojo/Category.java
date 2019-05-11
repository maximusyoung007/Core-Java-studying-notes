package pojo;

import org.springframework.stereotype.Component;

//为Category类加上@Component注解，即表明此类是bean
@Component("c")
public class Category {
	private int id;
	////因为配置从applicationContext.xml中移出来了，所以属性初始化放在属性声明上进行
	private String name = "Category 1";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
