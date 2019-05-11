package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.City;

public class cityDao {
	public List<City> get() {
		List<City> cities = new ArrayList<City>();
		String sql = "select * from city";  
		try {
			Connection c = DBUtil.getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				City city = new City();
				city.setId(rs.getInt(1));
				city.setName(rs.getString(2));
				cities.add(city);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cities;
	}
}
