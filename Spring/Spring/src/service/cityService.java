package service;

import java.util.List;

import dao.cityDao;
import pojo.City;

public class cityService {
	public void outputCity(){
		List<City> cities = new cityDao().get();
		for(City city : cities) {
			int id = city.getId();
			String name = city.getName();
			if(id > 4078) {
				System.out.println(id + "  " + name);
			}
		}
	}
}
