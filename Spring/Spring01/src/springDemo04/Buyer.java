package springDemo04;

public class Buyer {
	private String name;
	private Cars02 car2;
	public void setName(String name) {
		this.name = name;
	}
	public void setCar2(Cars02 car2) {
		this.car2 = car2;
	}
	@Override
	public String toString() {
		return "buyer [name=" + name + ", car2=" + car2 + "]";
	}
	
}
