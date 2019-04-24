package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	List<Connection> list = new ArrayList<Connection>();
	int size;
	public ConnectionPool(int size) {
		this.size = size;
		init();
	}
	public void init() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			for(int i = 0;i < size;i++) {
				Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fourtwothree?characterEncoding=UTF-8", "root", "123456");
				list.add(c);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public synchronized Connection getConnection() {
		while(list.isEmpty()) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//每次从第一个开始拿
		Connection c = list.remove(0);
		return c;
	}
	public synchronized void returnConnection(Connection c) {
		list.add(c);
		this.notifyAll();
	}
}
