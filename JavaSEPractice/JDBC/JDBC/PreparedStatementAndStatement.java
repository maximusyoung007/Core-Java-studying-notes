package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * 向数据库中插入10000条数据，分别使用Statement和PreparedStatement，比较各自花的时间差异
 */
public class PreparedStatementAndStatement {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.
					getConnection("jdbc:mysql://127.0.0.1:3306/fourtwothree?characterEncoding=UTF-8", "root", "123456");
			long start1 = System.currentTimeMillis();
			for(int i = 0;i < 10000;i++) {
				String sql = "insert into hero values(null,'Statement',313,50)";
				Statement s = c.createStatement();
				s.execute(sql);
			}
			long end1 = System.currentTimeMillis();
			System.out.println("Statement耗时" + (end1-start1) + "毫秒");
			long start2 = System.currentTimeMillis();
			for(int i = 0;i < 10000;i++) {
				String sql2 = "insert into hero values(null,'PreparedStatement',313,50)";
				PreparedStatement ps = c.prepareStatement(sql2);
				ps.execute();
			}
			long end2 = System.currentTimeMillis();
			System.out.println("PreparedStatement耗时" + (end2-start2) + "毫秒");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
	}
/*
 * 测试结果：
 * Statement耗时642312毫秒
 * PreparedStatement耗时690524毫秒
 * 可能跟硬件有关吧...
 */
}
