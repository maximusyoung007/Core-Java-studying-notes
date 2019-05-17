package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.One;

import pojo.Product;

public interface ProductMapper {
	@Select("select * from product where cid=#{cid}")
	public List<Product> listByCategory(int cid);
	
	@Select(" select * from product ")
    @Results({ 
        @Result(property="category",column="cid",one=@One(select="mapper.CategoryMapper.get")) 
    })
    public List<Product> list();
	
	@Select("select * from product where id = #{id}")
    public Product get(int id);
} 
