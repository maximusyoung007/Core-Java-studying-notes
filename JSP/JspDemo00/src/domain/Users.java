package domain;

public class Users {
	private String userName;
	private int age;
	public Users(String userName,int age){
		this.userName = userName;
		this.age = age;
	}
	public int setAge(int age) {
		return this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public String setUserName(String username) {
		this.userName = username;
		return this.userName;
	}
	public String getUserName() {
		return this.userName;
	}
}
