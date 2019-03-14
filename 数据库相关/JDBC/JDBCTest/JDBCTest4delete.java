package JDBCTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import Util.JDBCutil;

public class JDBCTest4delete {
	public static void main(String[] args) throws Exception{
		Connection conn = null;
		Statement st = null;
		conn = JDBCutil.getConn();
		st = conn.createStatement();
		String sql = "delete from product where id = 6";
		int result = st.executeUpdate(sql);
		if(result > 0)
			System.out.println("删除成功");
		else
			System.out.println("删除失败");
		JDBCutil.release(conn, st);
	}
}
