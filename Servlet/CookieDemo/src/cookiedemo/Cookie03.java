package cookiedemo;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cookiedemoUtil.CookieUtil;

public class Cookie03 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		if("admin".equals(userName) && "123".equals(passWord)) {
			Cookie[] cookies = request.getCookies();
			Cookie cookie = CookieUtil.findCookie(cookies,"last");
			if(cookie == null) {
				Cookie c = new Cookie("last",System.currentTimeMillis()+"");
				c.setMaxAge(60 * 60);
				response.addCookie(c);
				response.getWriter().write("welcome!!");
			}
			else {
				long lastVisitTime = Long.parseLong(cookie.getValue());
				response.getWriter().write("Welcome," + "last time you login is:" + new Date(lastVisitTime));
				cookie.setValue(System.currentTimeMillis()+"");
				response.addCookie(cookie);
			}
		}
		else {
			response.getWriter().write("登录失败");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
