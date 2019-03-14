package JDBCTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import Util.JDBCutil;

public class JDBCTestUpdate {
	public static void main(String[] args)throws Exception {
		Connection conn = null;
		Statement st = null;
		conn = JDBCutil.getConn();
		st = conn.createStatement();
		String sql = "update product set name='nike' where id=2";
		int result = st.executeUpdate(sql);
		if(result > 0)
			System.out.println("更新成功");
		else
			System.out.println("更新失败");
		JDBCutil.release(conn, st);

	}

}
