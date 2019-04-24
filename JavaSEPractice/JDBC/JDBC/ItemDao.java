package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * 设计一个ItemDAO，实现了DAO接口，提供相应的功能实现Item类的ORM
 */
import Dao.DAO;

public class ItemDao implements DAO{
	public ItemDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fourtwothree?characterEncoding=UTF-8", "root", "123456");
	}
	public int getTotal() {
		int total = 0;
		try(Connection c = getConnection();Statement s = c.createStatement()){
			String sql = "select count(*) from item";
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				total = rs.getInt(1);
			}
			System.out.println("Total:" + total);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return total;
	}
	@Override
	public void add(Item item) {
		String sql = "insert into item values(null,?,?)";
		try(Connection c = getConnection();PreparedStatement s = c.prepareStatement(sql)){
			s.setString(1,item.name);
			s.setInt(2, 50);
			s.execute();
			ResultSet rs = s.getGeneratedKeys();
			while(rs.next()) {
				int id = rs.getInt(1);
				item.id = id;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(Item item) {
		String sql = "update item set name=?,price=? where id=?";
		try(Connection c = getConnection();PreparedStatement s = c.prepareStatement(sql)){
			s.setString(1, item.name);
			s.setInt(2, item.price);
			s.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		try(Connection c = getConnection();Statement s = c.createStatement()){
			String sql = "delete from item where id=" + id;
			s.execute(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Item get(int id) {
		Item item = null;
		try(Connection c = getConnection();Statement s = c.createStatement()){
			String sql = "select * from item where id=" + id;
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				item = new Item();
				item.name = rs.getString(2);
				item.price = rs.getInt(3);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return item;
	}

	@Override
	public List<Item> list() {
		return list(0, Short.MAX_VALUE);
	}
	@Override
	public List<Item> list(int start, int count) {
		List<Item> list = new ArrayList<Item>();
		String sql = "select * from item by id desc limit ?,?;";
		try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);){
			ps.setInt(1,start);
			ps.setInt(2, count);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Item item = new Item();
				item.id = rs.getInt(1);
				item.name = rs.getString(2);
				item.price = rs.getInt(3);
				list.add(item);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
