package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



/*
 * 当c.setAutoCommit(false);时，事务是不会提交的
 * 只有执行使用 c.commit(); 才会提交
 * 设计一个代码，删除表中前10条数据，但是删除前会在控制台弹出一个提示：
 * 是否要删除数据(Y/N)
 * 如果用户输入Y，则删除
 * 如果输入N则不删除。
 * 如果输入的既不是Y也不是N，则重复提示
 */
public class Transaction {
	public static void main(String[] args) {
		Connection c = null;
		Statement s = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.
					getConnection("jdbc:mysql://127.0.0.1:3306/fourtwothree?characterEncoding=UTF-8", "root", "123456");
			s = c.createStatement();
			c.setAutoCommit(false);
			for(int i = 20409;i <= 20419;i++) {
				String sql = "delete from hero where id=" + i + ";";
				System.out.println("试图删除id=" + i + "的记录");
				s.execute(sql);
			}
			System.out.println("确定要删除记录吗？(Y/N)");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			if(str.equals("Y")) {
				c.commit();
				System.out.println("删除成功");
			}
			else if(str.equals("N")) {
				System.out.println("删除失败");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(s != null) {
				try {
					s.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					c.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
