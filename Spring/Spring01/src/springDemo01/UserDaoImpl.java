package springDemo01;

public class UserDaoImpl implements UserDao{
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public void save() {
		System.out.println("UserDaoImpl执行了..." + name);
	}
}
