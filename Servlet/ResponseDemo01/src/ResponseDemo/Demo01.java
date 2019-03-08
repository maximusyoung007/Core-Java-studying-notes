package ResponseDemo;

import java.io.IOException;
import java.nio.charset.Charset;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo01 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//test01(response);
		//test02(response);
		//以字节流输出
		//无论字节流还是字符流，直接用这句话指定编码即可
		response.setContentType("text/html;charset=UTF-8");
		//String csn = Charset.defaultCharset().name();
		//System.out.println("默认的String里面的getBytes方法使用的码表是：" + csn);
		//response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getOutputStream().write("风吹草地现牛羊".getBytes("Unicode"));
	}

	private void test02(HttpServletResponse response) throws IOException {
		//指定输出到客户端的时候，这些文字使用UTF-8编码
		response.setCharacterEncoding("UTF-8");
		//直接规定浏览器看这份数据时用什么编码
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write("天苍苍野茫茫");
	}

	private void test01(HttpServletResponse response) throws IOException {
		//response.setCharacterEncoding("UTF-8");
		//以字符流的方式写数据
		//response.getWriter().write("<h1>hello response...</h1>");
		//字节流
		response.getOutputStream().write("<h1>hello response2...</h1>".getBytes());
		//不能同时使用
		
		//设置当前数据的状态码
		//response.setStatus("");
		//设置一个头
		//response.setHeader(name, value);
		//设置相应的内容类型以及编码
		//response.setContentType(type);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
