package servletContext02;
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletContext02 extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//创建属性对象
		Properties property = new Properties();
		//指定载入的数据源
		/*
		 * 想要获得web工程下的资源，不能用普通的FileInputStream
		 */
		InputStream is = new FileInputStream("classes/config.properties");
		property.load(is);
		//获取name属性的值
		String name = property.getProperty("name");
		System.out.println("name: " + name);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
