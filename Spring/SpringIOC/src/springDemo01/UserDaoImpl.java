package springDemo01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("UserDao")//相当于 <bean id="UserDao" class="springDemo01.UserDaoImpl"/>
public class UserDaoImpl implements UserDao{
	//注解方式可以没有set方法，如果有set方法，注解加在set方法上，如果没有set方法，注解加在变量上
	@Value("杨允书")
	private String name;
	/*@Value("杨允书")
	public void setName(String name) {
		this.name = name;
	}*/

	@Override
	public void save() {
		System.out.println("传统方法：DAO中保存用户的方法实现了..." + name);
	}

	@Override
	public void IOCsave() {
		// TODO Auto-generated method stub
		System.out.println("IOC注解方式：DAO中保存用户的方法实现了...2" + name);
	}
	
	
}
