package springDemo04;
//构造方法的属性注入
public class Cars {
	private String name;
	private Double price;
	public Cars(String name,Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cars [name=" + name + ",price=" + price + "]";
	}
}
