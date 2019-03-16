package dbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

import Util.JDBCutil;

public class TestDBCP {
	@Test
	public void testDBCP() {
		Connection conn = null;
		PreparedStatement ps = null;
		BasicDataSource bds = new BasicDataSource();
		try {
			bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			bds.setUrl("jdbc:mysql://localhost/bank");
			bds.setUsername("root");
			bds.setPassword("123456");
			conn = bds.getConnection();
			String sql = "insert into account values(4,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "max");
			ps.setInt(2, 555);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCutil.release(conn, ps);
		}
	}
}
