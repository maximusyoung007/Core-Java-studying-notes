package servletdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
  /*
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String result = null;
        System.out.println("name:" + name);
        System.out.println("password:" + password);
        if("admin".equals(name) && "123".equals(password))
          result = "<div style='color:green'>success</div>";
        else 
          result = "<div style='color:red'>fail</div>";
        response.getWriter().println(result);
    }*/
    public LoginServlet() {
      System.out.println("LoginServlet构造方法被调用");//LoginServlet方法只能执行一次，servlet是单实例的
    }
    //init方法在构造方法后执行，只执行一次
    public void init(ServletConfig config) {
        System.out.println("init(ServletConfig)");
    }
    //web应用重新启动或关闭Tomcat时执行
    public void destroy() {
        System.out.println("destroy()");
    }
 
  protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8"); 
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    
    System.out.println("浏览器发出请求时的完整URL，包括协议 主机名 端口(如果有): " + request.getRequestURL());
    System.out.println("浏览器发出请求的资源名部分，去掉了协议和主机名: " + request.getRequestURI());
    System.out.println("请求行中的参数部分: " + request.getQueryString());
    System.out.println("浏览器所处于的客户机的IP地址: " + request.getRemoteAddr());
    System.out.println("浏览器所处于的客户机的主机名: " + request.getRemoteHost());
    System.out.println("浏览器所处于的客户机使用的网络端口: " + request.getRemotePort());
    System.out.println("服务器的IP地址: " + request.getLocalAddr());
    System.out.println("服务器的主机名: " + request.getLocalName());
    System.out.println("得到客户机请求方式: " + request.getMethod());
 
        
    /*String result = null;
    System.out.println("name:" + name);
    System.out.println("password:" + password);
    if("admin".equals(name) && "123".equals(password))
      //result = "<div style='color:green'>登录成功</div>";
      //服务端跳转页面
      request.getRequestDispatcher("login_success.html").forward(request, response);
    else
      //result = "<div style='color:red'>登录失败</div>";
      //客户端跳转页面
      response.sendRedirect("login_fail.html");
    //response.setContentType("text/html; charset=UTF-8");
    //PrintWriter pw = response.getWriter();
    //pw.println(result);*/
        
 
       /* if ("admin".equals(name) && "123".equals(password)) {
            request.getRequestDispatcher("success.html").forward(request, response);//302客户端跳转
        } else {
            response.setStatus(301);
            response.setHeader("Location", "fail.html");//301方式
        }*/
    //设置不使用缓存
    try {
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("pragma", "no-cache");
        response.getWriter().println("<h1>Hello Servlet!</h1>");
        response.getWriter().println(new Date().toLocaleString());
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

  }
  
  /*protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
 
        // byte[] bytes = name.getBytes("ISO-8859-1");
        // name = new String(bytes, "UTF-8");
 
        String password = request.getParameter("password");
 
        System.out.println("name:" + name);
 
    }*/
}
