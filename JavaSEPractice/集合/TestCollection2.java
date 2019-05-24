package collectiondemo;

import java.util.ArrayList;
import java.util.List;

/*
 * 借助泛型和前面学习的面向对象的知识，设计一个ArrayList，
 * 使得这个ArrayList里，又可以放Hero，又可以放Item,
 * 但是除了这两种对象，其他的对象都不能放
 * 
 * 方法是：建立一个接口LOL，Item和Hero实现该接口，建立一个以LOL为泛型的ArrayList
 */
public class TestCollection2 {
	public static void main(String[] args) {
		List<LOL> lols = new ArrayList<>();
		lols.add(new Hero("金克斯"));
		lols.add(new Item("暴风大剑"));
		for(LOL lol : lols) {
			System.out.println(lol);
		}
		System.out.println(lols.get(0));
		System.out.println(lols.get(1).toString());
	}
}
