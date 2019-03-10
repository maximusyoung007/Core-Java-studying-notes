package cookiedemo02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cookiedemoUtil.CookieUtil;

public class ProductInfoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取当前用户准备浏览的商品信息
		String id = request.getParameter("id");
		Cookie[] cookies = request.getCookies();
		Cookie cookie = CookieUtil.findCookie(cookies, "history");
		if(cookie == null) {
			//响应返回cookie
			Cookie c = new Cookie("history",id);
			response.addCookie(c);
		}
		else {
			//获取以前的cookie
			String ids = cookie.getValue();
			//形成cookie新的值
			cookie.setValue(id + "#" + ids);
			response.addCookie(cookie);
		}
		//跳转到具体页面
		response.sendRedirect("product_info.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
