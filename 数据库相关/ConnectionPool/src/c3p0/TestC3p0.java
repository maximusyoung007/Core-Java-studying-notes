package c3p0;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import Util.JDBCutil;

public class TestC3p0 {
	@Test
	public void TestC3p0() {
		ComboPooledDataSource ds = new ComboPooledDataSource();
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			ds.setDriverClass("com.mysql.cj.jdbc.Driver");
			ds.setJdbcUrl("jdbc:mysql://localhost/bank");
			ds.setUser("root");
			ds.setPassword("123456");
			conn = ds.getConnection();
			String sql = "insert into account values(6,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "no-one");
			ps.setInt(2, 555);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
