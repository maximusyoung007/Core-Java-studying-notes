package servletContext03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletContext03")
public class ServletContext03 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//test01();
		//test02();
		test03();
	}
	//根据classload获取工程下的资源 类加载器（JDBC）
	private void test03() throws IOException{
		Properties properties = new Properties();
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("../../file/config.properties");
		properties.load(is);
		String name = properties.getProperty("name");
		System.out.println("name:" + name);
	}
	private void test02() throws IOException{
		ServletContext context = getServletContext();
		Properties property = new Properties();
		//获取web工程下的资源，转化成流对象，前面隐藏当前工程的根目录 
		InputStream is = context.getResourceAsStream("file/config.properties");
		property.load(is);
		String name = property.getProperty("name");
		System.out.println("name2:" + name);
		is.close();
	}
	//先获取路径，再获取流对象
	private void test01() throws FileNotFoundException,IOException{
		//获取context对象
		ServletContext context = getServletContext();
		//String path1 = context.getRealPath("");得到根目录
		String path2 = context.getRealPath("file/config.properties");//绝对路径
		//System.out.println("path1:" + path1);
		System.out.println("path2:" + path2);
		//创建属性对象
		Properties property = new Properties();
		//指定载入的数据源
		/*
		 * 想要获得web工程下的资源，不能用普通的FileInputStream
		*/
		InputStream is = new FileInputStream(path2);
		property.load(is);
		//获取name属性的值
		String name = property.getProperty("name");
		System.out.println("name: " + name);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
