package SpringDemo02;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("customService")
@Scope("prototype")
public class CustomService {
	@PostConstruct//相当于init-method
	public void init() {
		System.out.println("CustomService被初始化了");
	}
	public void save() {
		System.out.println("CustomService的service方法被执行了");
	}
	@PreDestroy//相当于destroy-method
	public void destroy() {
		System.out.println("CustomService被销毁了");
	}
}
