package request01;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Demo01 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取头信息
		Enumeration<String> allname = request.getHeaderNames();
		while(allname.hasMoreElements()) {
			String name = (String)allname.nextElement();
			String value = request.getHeader(name);
			System.out.println(name  + "=" + value) ;
		}
		System.out.println("---------------------------------------");
		//获取客户端提交上来的信息
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		System.out.println("name:" + name);
		System.out.println("address:" + address);
		System.out.println("--------------------------------------------");
		//获取所有参数，得到一个枚举集合
		Map<String,String[]> map = request.getParameterMap();
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			String value = map.get(key)[0];
			System.out.println(key + "==" + value);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
