package springDemo05;

import java.util.*;

//集合属性的注入
public class CollectionBean {
	private String[] arrays;
	private List<String> list;
	private Set<String> set;
	private Map<String,String> map;
	public void setArrays(String[] arrays) {
		this.arrays = arrays;
	}
	
	public void setList(List<String> list) {
		this.list = list;
	}
	
	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "CollectionBean [arrays=" + Arrays.toString(arrays) + ", list=" + list + ", set=" + set + ", map=" + map
				+ "]";
	}
	
}
