package listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener,ServletRequestAttributeListener{
	
	//有新增属性是触发
	@Override
	public void attributeAdded(ServletRequestAttributeEvent e) {
		// TODO Auto-generated method stub
		System.out.println("request 增加属性 ");
        System.out.println("属性是" + e.getName());
        System.out.println("值是" + e.getValue());
	}
	
	//移除属性时触发
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("request 移除属性 ");
	}
	
	//有替换属性时触发
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		 System.out.println("request 替换属性 ");
	}
	
	//本次请求结束时触发
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("销毁了一个request");
	}
	
	//访问服务端资源，servlet，html,jsp都会创建一个request
	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("创建了一个Request ");
	}

}
