package servletcontext04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	/*
	 * request:包含请求的信息
	 * response:相应数据给浏览器
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取数据
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("username:" + username + " password:" + password);
		//校验数据
		///向客户端输出内容
		PrintWriter pw = response.getWriter();
		if("admin".equals(username) && "123".equals(password)) {
			//System.out.println("登录成功");
			//pw.write("login success...");
			//成功次数累加 先取以前的值
			Object obj = getServletContext().getAttribute("count");
			int totalcount = 1;
			if(obj != null) {
				totalcount = (int)obj + 1; 
			}
			//再累加
			getServletContext().setAttribute("count", totalcount++);
			//System.out.println("登录成功次数为：" + totalcount);
			//设置状态码，重新定位状态码
			response.setStatus(302);
			//定位跳转位置
			response.setHeader("Location","login_success.html");
		}
		else 
			//System.out.println("登录失败");
			pw.write("login failed...");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
