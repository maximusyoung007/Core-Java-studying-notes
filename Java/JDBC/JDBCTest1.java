package JDBCTest;
import java.sql.*;

import Util.JDBCutil;
public class JDBCTest1 {
	public static void main(String[] args){
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		//注册驱动
		try{
			conn = JDBCutil.getConn();
			//创建statement
			st = conn.createStatement();
			//执行查询，得到结果集
			rs = st.executeQuery("select * from product");
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println("id=" + id + "\nname=" + name);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCutil.release(conn, st, rs);
		}
	}
}
