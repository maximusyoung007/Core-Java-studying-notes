package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 设计一个方法，进行分页查询
 * public static void list(int start, int count)
 * start 表示开始页数，count表示一页显示的总数
 * list(0,5) 表示第一页，一共显示5条数据
 * list(10,5) 表示第三页，一共显示5条数据
 */
public class PagedQuery {
	public static void list(int start,int count) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.
					getConnection("jdbc:mysql://127.0.0.1:3306/fourtwothree?characterEncoding=UTF-8", "root", "123456");
			Statement s = c.createStatement();
			String sql = "select * from hero limit" + start + "," + count;
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int hp = rs.getInt(3);
				int damage = rs.getInt("damage");
				System.out.println(id + " " + name + " " + hp + " " + damage);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
	}
	public static void main(String[] args) {
		int start = 10,count = 5;
		list(10,5);
	}
}
