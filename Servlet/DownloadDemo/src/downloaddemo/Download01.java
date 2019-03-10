package downloaddemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//无法下载！！！
public class Download01 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取要下载的文件名
		String fileName = request.getParameter("filename");
		//System.out.println("filename:" + fileName);
		fileName = new String(fileName.getBytes("ISO-8859-1"),"UTF-8");
		//获取这个文件在Tomcat中的绝对路径
		String path = getServletContext().getRealPath("download/" + fileName);
		System.out.println("path:" + path);
		//转化成输入流
		//response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
		InputStream is = new FileInputStream(path);
		ServletOutputStream os = response.getOutputStream();
		int len = 0;
		byte[] buffer = new byte[1024];
		while((len = is.read(buffer)) != -1) {
			os.write(buffer,0,len);
		}
		os.close();
		is.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
