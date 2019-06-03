package mapper;

import java.util.List;

import pojo.Category;
import util.Page;

public interface CategoryMapper {
	public int add(Category category);
	public void delete(int id);
	public Category get(int id);
	public int update(Category category);
	public List<Category> list();
	//public List<Category> list(Page page);
	//public int total();
} 
