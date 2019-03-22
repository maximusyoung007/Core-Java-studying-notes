package springDemo01;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
	//注入DAO
	//@Autowired
	@Resource
	private UserDao userdao;
	@Override
	public void save() {
		System.out.println("userService中的save方法执行");
		userdao.IOCsave();
	}
	
}
