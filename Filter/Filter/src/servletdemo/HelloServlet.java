package servletdemo;
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class HelloServlet extends HttpServlet {
 
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
 
        /*try {
            PrintWriter pw = response.getWriter();
            pw.println("<h1>Hello Servlet</h1>");
 
            response.setContentType("text/lol");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
    	
    	try {
            response.setContentType("text/html; charset=UTF-8");//发送的信息是UTF-8编码，并通知浏览器用UTF-8的内容显示
    		//response.setCharacterEncoding("UTF-8");//只发送不通知
 
            PrintWriter pw = response.getWriter();
            pw.println("<h1>第一次 使用 Servlet</h1>");
 
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
    }
 
}