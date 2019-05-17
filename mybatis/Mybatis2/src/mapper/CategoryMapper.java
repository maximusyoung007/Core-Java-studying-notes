package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.One;

import pojo.Category;

public interface CategoryMapper {
	@Insert("insert into category (name) values (#{name})")
	public int add(Category category);
	
	@Delete("delete from category where id=#{id}")
	public void delete(int id);
	
	@Select("select * from category where id=#{id}")
	public Category get(int id);
	
	@Update("update category set name=#{name} where id=#{id}")
	public int update(Category ccategory);
	
	@Select("select * from category")
	//通过@Result和@Many中调用ProductMapper.listByCategory()方法
	@Results({@Result(property="id",column="id"),
		@Result(property="products",javaType=List.class,column="id",
		many= @Many (select = "mapper.ProductMapper.listByCategory"))
	}
			)
	public List<Category> list();
}
