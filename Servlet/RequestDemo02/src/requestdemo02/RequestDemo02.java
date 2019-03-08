package requestdemo02;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo02 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置请求体里的文字编码
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		//test01(name, password);
		System.out.println("Post:" + "username:" + name + " password:" + password);
	}
	/*
	 *get方式解决中文乱码问题
	 */
	private void test01(String name, String password) throws UnsupportedEncodingException {
		System.out.println("username:" + name + " password:" + password);
		//先让文字回到ISO-8859-1的字节编码，再重新编码
		name = new String(name.getBytes("ISO-8859-1"),"UTF-8");
		System.out.println("username:" + name + " password:" + password);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
