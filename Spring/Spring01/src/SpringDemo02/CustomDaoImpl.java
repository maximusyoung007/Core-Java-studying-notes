package SpringDemo02;

public class CustomDaoImpl implements CustomDao{
	public void setup() {
		System.out.println("CustomDaoImpl被初始化了...");
	}
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("CustomImpl执行了save()方法...");
	}
	public void destroy() {
		System.out.println("CustomDaoImpl被销毁了");
	}
}
