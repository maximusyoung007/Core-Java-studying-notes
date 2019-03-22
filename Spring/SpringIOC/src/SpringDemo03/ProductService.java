package SpringDemo03;

import javax.annotation.Resource;
//XML管理类，注解完成属性注入
public class ProductService {
	@Resource(name="productDao")
	private ProductDao pd;
	@Resource(name="orderDao")
	private OrderDao od;
	/*
	public void setPd(ProductDao pd) {
		this.pd = pd;
	}

	public void setOd(OrderDao od) {
		this.od = od;
	}*/

	public void save() {
		System.out.println("ProductService的save方法执行了");
		pd.save();
		od.save();
	}
}
