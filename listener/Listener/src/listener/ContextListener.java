package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/*
 * 监听context
 */
public class ContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("web应用销毁");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("web应用初始化");
	}
	
}
