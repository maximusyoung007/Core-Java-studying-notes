package springDemo04;
//set方法的属性注入
public class Cars02 {
	private String name;
	private Double price;
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cars02 [name=" + name + ", price=" + price + "]";
	}   
	
}
