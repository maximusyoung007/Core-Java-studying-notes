package DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Dao.StudentDao;
import Util.JDBCutil;

public class StudentDaoImpl implements StudentDao{
	@Override
	public void findAll(){
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try{
		    conn = JDBCutil.getConn();
			st = conn.createStatement();
			String sql = "select * from student";
			rs = st.executeQuery(sql);
			while(rs.next()) {
				String name = rs.getString("name");
				System.out.println("name:" + name);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			JDBCutil.release(conn,st,rs);
		}
	}

	//@Override
	/*public void login(String username, String password) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try{
		    conn = JDBCutil.getConn();
			st = conn.createStatement();
			String sql = "select * from student where name='" + username + "'and password='" + password + "'";
			rs = st.executeQuery(sql);
			if(rs.next())
				System.out.println("登陆成功");
			else 
				System.out.println("登录失败");
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			JDBCutil.release(conn,st,rs);
		}
	}*/
	@Override
	public void login(String username, String password) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try{
		    conn = JDBCutil.getConn();
		    String sql = "select * from student where name=? and password=?";
		    PreparedStatement ps = conn.prepareStatement(sql);
		    ps.setString(1, username);
		    ps.setString(2, password);
		    rs = ps.executeQuery();
			st = conn.createStatement();
			//String sql2 = "select * from student where name='" + username + "'and password='" + password + "'";
			//rs = st.executeQuery(sql2);
			if(rs.next())
				System.out.println("登陆成功");
			else 
				System.out.println("登录失败");
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally { 
			JDBCutil.release(conn,st,rs);
		}
	}
	@Override
	public void insert(String name,String password) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCutil.getConn();
			String sql = "insert into student values(null,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,password);
			int result = ps.executeUpdate();
			if(result > 0) {
				System.out.println("插入成功");
			}
			else
				System.out.println("插入失败");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCutil.release(conn, ps);
		}	
	}
	@Override
	public void delete(int id) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCutil.getConn();
			String sql = "delete from student where id=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			int result = ps.executeUpdate();
			if(result > 0) {
				System.out.println("删除成功");
			}
			else
				System.out.println("删除失败");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCutil.release(conn, ps);
		}	
	}
	public void update(int id,String name) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCutil.getConn();
			String sql = "update student set name=? where id=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1,name);
			ps.setInt(2, id);
			int result = ps.executeUpdate();
			if(result > 0) {
				System.out.println("修改成功");
			}
			else
				System.out.println("修改失败");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCutil.release(conn, ps);
		}	
	}
}
