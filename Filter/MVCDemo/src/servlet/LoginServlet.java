package servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		//输入正确的用户名和密码，跳转到listHero
		if("admin".equals(name) && "123".equals(password)) {
			request.getSession().setAttribute("userName",name);
			response.sendRedirect("listHero");
		}
		//输入错误的用户名或密码，跳转到login.html，重新登录
		else {
			response.sendRedirect("login.html");
		}
	}
}