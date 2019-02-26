package JDBCTest;
import java.sql.*;
import Util.JDBCutil;
public class JDBCTest2 {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		// TODO Auto-generated method stub
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

}
