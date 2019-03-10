package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session01 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		//得到会话id
		String sessionId = session.getId();
		//存值
		//session.setAttribute(name, value);
		//取值
		//session.getAttribute(name);
		//移除值
		//session.removeAttribute(name);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write("收到请求了...");
		//String sessionId = request.getSession().getId();
		System.out.println("session id = " + sessionId);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
