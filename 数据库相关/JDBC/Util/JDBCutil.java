package Util;

import java.sql.*;
import java.util.Properties;
import java.io.*;

public class JDBCutil {
	static String driverClass = null;
	static String url = null;
	static String name = null;
	static String password = null;
	static {
		try{//创建一个属性配置对象
			Properties properties = new Properties();
			//InputStream is = new FileInputStream("jdbc.properties");
			ClassLoader cl = JDBCutil.class.getClassLoader();
			InputStream is = cl.getResourceAsStream("jdbc.properties");
			//导入输入流
			properties.load(is);
			driverClass = properties.getProperty("driverClass");
			url = properties.getProperty("url");
			name = properties.getProperty("name");
			password = properties.getProperty("password");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConn(){
		Connection conn = null;
		try{
			//注册驱动
			Class.forName(driverClass);
			//建立连接
			conn = DriverManager.getConnection(url,name,password);
		}catch(Exception e) {
			e.printStackTrace();
		}  
		return conn;
	}
	public static void release(Connection conn,Statement st,ResultSet rs) {
		closeRs(rs);
		closeSt(st);
		closeConn(conn);
	}
	public static void release(Connection conn,Statement st) {
		closeConn(conn);
		closeSt(st);
	}
	public static void release(Connection conn,PreparedStatement ps) {
		closeConn(conn);
		closePs(ps);
	};
	private static void closePs(PreparedStatement ps) {
		try{
			if(ps != null)
				ps.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ps = null;
		}
	}
	private static void closeRs(ResultSet rs) {
		try{
			if(rs != null)
				rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			rs = null;
		}
	} 
	private static void closeSt(Statement st) {
		try{
			if(st != null)
				st.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			st = null;
		}
	}
	private static void closeConn(Connection conn) {
		try{
			if(conn != null)
				conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			conn = null;
		}
	}
}
