package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import Util.JDBCutil;

public class Transaction {
	@Test
	public void testTransaction() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCutil.getConn();
			//关闭自动提交
			conn.setAutoCommit(false);
			String sql = "update account set money = money- ? where id = ?";
			ps = conn.prepareStatement(sql);
			//rs = ps.executeQuery();
			//给第一个人加100
			ps.setInt(1, -100);
			ps.setInt(2, 1);
			ps.executeUpdate();//没进行一次操作都需要一个该语句
			//给第二个人减一百
			//int a = 10 / 0;
			ps.setInt(1, 100);
			ps.setInt(2, 2);
			ps.executeUpdate();
			/*while(rs.next()) {
				System.out.println(rs.getString("name") + "  " + rs.getInt("money"));
			}*/
			//若所有操作均正确，提交
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				//失败的话回滚异常
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			JDBCutil.release(conn, ps,rs);
		}
	}
}
