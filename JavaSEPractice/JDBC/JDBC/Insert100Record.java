package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * 向数据库中插入100条数据，并在mysql-front中观察查询结果
 */
public class Insert100Record {
	public static void main(String[] args) {
		try {
			//初始化驱动
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接
			Connection c = DriverManager.getConnection
					("jdbc:mysql://127.0.0.1:3306/fourtwothree?characterEncoding=UTF-8", "root", "123456");
			//创建语句
			Statement s = c.createStatement();
			for(int i = 0;i < 100;i++) {
				String str = String.valueOf(i+1);
				//这样写是为了可以插入变量hero+str
				String sql = "insert into hero values(null," + "'hero" + str + "'" + ",313,50)";
				s.execute(sql);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
