package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.One;

import pojo.Category;
import provider.CategoryDynaSqlProvider;

public interface CategoryMapper {
	@InsertProvider(type=CategoryDynaSqlProvider.class,method="add") 
    public int add(Category category); 
        
    @DeleteProvider(type=CategoryDynaSqlProvider.class,method="delete")
    public void delete(int id); 
        
    @SelectProvider(type=CategoryDynaSqlProvider.class,method="get") 
    public Category get(int id); 
      
    @UpdateProvider(type=CategoryDynaSqlProvider.class,method="update") 
    public int update(Category category);  
        
    @SelectProvider(type=CategoryDynaSqlProvider.class,method="list")     
    public List<Category> list(); 
	
	/*@Select("select * from category")
	//通过@Result和@Many中调用ProductMapper.listByCategory()方法
	@Results({@Result(property="id",column="id"),
		@Result(property="products",javaType=List.class,column="id",
		many= @Many (select = "mapper.ProductMapper.listByCategory"))
	}
			)
	public List<Category> list();*/
}
