package cookiedemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie01 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		//创建对象的几种方式
		//1直接new 2.单例模式 提供静态方法 3.工厂模式构建 stu
		Cookie cookie = new Cookie("aa","bb");
		//给响应，添加一个cookie
		response.addCookie(cookie);
		response.getWriter().write("请求成功");
		//客户端收到的信息页面，响应头中多了一个cookie字段
		
		//获取客户端带来的cookie
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie c : cookies) {
				String name = c.getName();
				String value = c.getValue();
				System.out.println(name + "==" + value);
			}
		}
		//设置有效时间
		//cookie.setMaxAge(60 * 60 * 24 * 7);
		//赋值新的值
		//cookie.setValue(newValue);
		//用于指定只有请求了指定的域名，才带上该cookie
		//cookie.setDomain(pattern);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
