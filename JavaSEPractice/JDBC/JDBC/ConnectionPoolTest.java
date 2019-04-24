package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 向数据库中插入100条数据，比较传统方式和数据库连接池方式的性能差异
 * 1. 使用传统方式创建100个线程，每个线程都会创建新的连接，通过这个连接向数据库插入1条数据，然后关闭这个连接。
 * 2. 使用数据库连接池的方式，创建一个有10条连接的连接池，然后创建100个线程，每个线程都会向连接池借用连接，借用到后，向数据库插入1条数据，然后归还这个连接。
 * 通过时间统计，比较这两种方式的性能表现差异。
 */
public class ConnectionPoolTest {
	public static void main(String[] args) {
		//传统方法插入100条数据
		long start1 = System.currentTimeMillis();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fourtwothree?characterEncoding=UTF-8", "root", "123456");
			Statement s = c.createStatement();
			String sql = "insert into item values(null,'葡萄汁',7);";
			for(int i = 0;i < 100;i++) {
				s.execute(sql);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		long end1 = System.currentTimeMillis();
		System.out.println("传统方式用时" + (end1-start1) + "毫秒");
		
		//数据库连接池方式插入一百条数据
		long start2 = System.currentTimeMillis();
		Thread[] thread1 = new Thread[100];
		ConnectionPool cp = new ConnectionPool(10);
		for(int i = 0;i < 100;i++) {
			WorkThread wt = new WorkThread(cp);
			wt.start();
			thread1[i] = wt;
		}
		for(Thread t : thread1) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long end2 = System.currentTimeMillis();
		System.out.println("数据库连接池方式插入100条数据耗时" + (end2-start2) + "毫秒");
	}
}
class WorkThread extends Thread{
	private ConnectionPool cp;
	public WorkThread(ConnectionPool cp) {
		this.cp = cp;
	}
	public void run() {
		Connection c = cp.getConnection();
		String sql = "insert into item values(null,'苹果汁',7);";
		try {
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		cp.returnConnection(c);
	}
}
