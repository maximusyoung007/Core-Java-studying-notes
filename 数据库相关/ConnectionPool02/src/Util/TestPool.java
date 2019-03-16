package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class TestPool {
	@Test
	public void testpool(){
		MyDataSource mydatasource = new MyDataSource();
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = mydatasource.getConnection();
			ps = conn.prepareStatement("insert into account values(3,'lily',90)");
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//mydatasource.addBack(conn);
			JDBCutil.release(conn, ps);
		}
	}
}
