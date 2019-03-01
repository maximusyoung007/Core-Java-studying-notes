package learnServlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfig01 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig sc = getServletConfig();
		String s = sc.getServletName();
		System.out.println("servlet name:" + s);//servlet配置文件中servlet文本内容
		//获取具体某一个参数
		String address = sc.getInitParameter("address");
		System.out.println(address);
		System.out.println("---------------------------------------------------");
		//获取所有参数名称
		Enumeration<String> names = sc.getInitParameterNames();
		while(names.hasMoreElements()) {
			String key = (String)names.nextElement();
			String value = sc.getInitParameter(key);
			System.out.println("key:" + key + " value:" + value);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
