package dbcp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

import Util.JDBCutil;

public class TestDBCP02 {
	@Test
	public void testDBCP02() {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			BasicDataSourceFactory factory = new BasicDataSourceFactory();
			Properties properties = new Properties();
			InputStream is = new FileInputStream("dbcpconfig.properties");
			properties.load(is);
			DataSource bds = factory.createDataSource(properties);			
			conn = bds.getConnection();
			String sql = "insert into account values(5,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "batman");
			ps.setInt(2, 10000000);
			ps.executeUpdate();
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCutil.release(conn, ps);
		}
	}
}
