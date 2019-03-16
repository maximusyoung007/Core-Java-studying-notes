package c3p0;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import Util.JDBCutil;

public class TestC3p002 {
	@Test
	public void testc3p002() {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			ComboPooledDataSource db = new ComboPooledDataSource();			
			conn = db.getConnection();
			String sql = "insert into account values(7,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "Tony Stark");
			ps.setInt(2, 10000000);
			ps.executeUpdate();
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
