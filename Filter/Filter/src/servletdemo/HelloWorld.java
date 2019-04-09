package servletdemo;
import java.io.*;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HelloWorld extends HttpServlet{
	private String message = "hello world";

	public void init(ServletConfig config){
        System.out.println("init of Hello Servlet");
    }

	public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	            
	{
		  /*
		   * host	localhost:8080 ----主机地址
		   * connection	keep-alive ----是否保持连接
			 cache-control	max-age=0 ----缓存时限
		     upgrade-insecure-requests	1
			 user-agent	Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.75 Safari/537.36 ----浏览器基本资料
		   */
			 //accept	text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8 ----浏览器接受的数据类型
			 //accept-encoding	gzip, deflate, br ----浏览器接受的压缩方式
			 //accept-language	zh-CN,zh;q=0.9 ----浏览器接受的语言
		
		
		  Enumeration<String> headerNames = request.getHeaderNames();
		  while(headerNames.hasMoreElements()){
	            String header = headerNames.nextElement();//获取浏览器传递过来的头信息
	            String value = request.getHeader(header);//获取浏览器所有的头信息名称，根据头信息名称就能遍历出所有的头信息
	            System.out.printf("%s\t%s%n",header,value);
	      }
		  try {
			  	PrintWriter pw = response.getWriter();
	            pw.println("<h1>Hello Servlet!</h1>");
	            response.setContentType("text/lol");//不能识别text/lol的内容，弹出下载对话框
	            //response.getWriter().println(new Date().toLocaleString());
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	      // 设置响应内容类型
	      /*response.setContentType("text/html");

	      // 实际的逻辑是在这里
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + message + "</h1>");
	      out.println(new Date().toLocaleString());*/
		}
	  
	  public void destroy()
	  {
	      // 什么也不做
	  }
}
