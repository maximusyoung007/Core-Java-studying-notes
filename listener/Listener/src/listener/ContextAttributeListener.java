package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
/*
 * 监听context 的Attribute
 */
public class ContextAttributeListener implements ServletContextAttributeListener{
	
	//监听属性的增加
	@Override
	public void attributeAdded(ServletContextAttributeEvent e) {
		// TODO Auto-generated method stub
		System.out.println("增加属性");
		System.out.println("属性是：" + e.getName());
		System.out.println("值是：" + e.getValue());
	}
	
	//监听属性的移除
	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("移除属性");
		
	}
	
	//监听属性的替换
	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("替换属性");
	}

}
