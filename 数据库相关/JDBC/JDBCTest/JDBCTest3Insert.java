package JDBCTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import Util.JDBCutil;

public class JDBCTest3Insert {
	public static void main(String[] args) throws Exception{
		Connection conn = null;
		Statement st = null;
		conn = JDBCutil.getConn();
		st = conn.createStatement();
		String sql = "insert into product values(null,'kindle',1000,'20180217130205',5)";
		int result = st.executeUpdate(sql);
		if(result > 0)
			System.out.println("添加成功");
		else
			System.out.println("添加失败");
		JDBCutil.release(conn, st);
	}
}
