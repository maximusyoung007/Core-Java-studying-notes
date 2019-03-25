package SpringDemo02;

import java.util.Scanner;

public class OrderDao {
	public void save() {
		System.out.println("保存订单");
	}
	public void update() {
		System.out.println("更新订单");
	}
	public String delete() {
		System.out.println("删除订单");
		return "一个陌生女人的来信";
	}
	public void find() {
		System.out.println("查询订单");
		int i = 1 / 0;
	}
}
