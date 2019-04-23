package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 设计一个方法
 * public static void execute(String sql)
 * 方法接受的参数是SQL语句，无论是增加，删除，还是修改，都调用这个方法，每次传不同的SQL语句作为参数
 */
public class InsertDeleteUpdate {
	public static void execute(String sql) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.
					getConnection("jdbc:mysql://127.0.0.1:3306/fourtwothree?characterEncoding=UTF-8", "root", "123456");
			Statement s = c.createStatement();
			s.execute(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String insertSql = "insert into hero values(null,'anny',313,500)";
		String deleteSql = "delete from hero where id = 401";
		String updateSql = "update hero set name='winterfell' where id = 400";
		execute(insertSql);
		execute(deleteSql);
		execute(updateSql);
	}
}
