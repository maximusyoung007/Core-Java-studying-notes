package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;

import pojo.OrderItem;

public interface OrderItemMapper {
	@Select(" select * from orderitem where oid = #{oid}")
    @Results({ 
        @Result(property="product",column="pid",one=@One(select="mapper.ProductMapper.get")) 
    }) 
    public List<OrderItem> listByOrder(int oid);
}
