package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 当插入一条数据之后，通过获取自增长id，得到这条数据的id，比如说是55. 
 * 删除这条数据的前一条，54.
 * 如果54不存在，则删除53，以此类推直到删除上一条数据。
 */
public class AutoIncrementId {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.
					getConnection("jdbc:mysql://127.0.0.1:3306/fourtwothree?characterEncoding=UTF-8", "root", "123456");
			String sql = "insert into hero values(null,'ironthron',313,50)";
			PreparedStatement ps = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			ps.execute();
			ResultSet rs = ps.getGeneratedKeys();
			int id = 0;
			if(rs.next()) {
				id = rs.getInt(1);
				System.out.println(id);
			}
			Statement s = c.createStatement();
			boolean state = false;
			while(true) {
				sql = "select * from hero where id=" + (id-1);
				rs = s.executeQuery(sql);
				while(rs.next()) {
					if(rs.getString(2) != null) {
						state = true;
					}
				}
				if(state) {
					sql = "delete  from hero where id=" + (id-1);
					s.execute(sql);
					break;
				}
				id--;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
