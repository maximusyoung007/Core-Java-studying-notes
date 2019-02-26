package JDBCTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.*;
import Util.JDBCutil;

/**
 * 
 * 使用Junit执行单元测试
 *
 */
public class TestJunit {
	
	@Test
	public void testQuery() throws Exception{
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		conn = JDBCutil.getConn();
		st = conn.createStatement();
		String sql = "select * from product";
		rs = st.executeQuery(sql);
		while(rs.next()) {
			String name = rs.getString("name");
			System.out.println("name: " + name);
		}
		JDBCutil.release(conn, st, rs);
	}
	public void testInsert() throws Exception{
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		conn = JDBCutil.getConn();
		st = conn.createStatement();
		String sql = "insert into product values(null,'kindle paperwriter',1000,'201802171302052520',5)";
		int result = st.executeUpdate(sql);
		if(result > 0)
			System.out.println("添加成功");
		else
			System.out.println("添加失败");
		JDBCutil.release(conn, st);
	}
}
