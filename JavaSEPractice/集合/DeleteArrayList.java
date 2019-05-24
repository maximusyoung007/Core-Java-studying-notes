package collectiondemo;

import java.util.ArrayList;
import java.util.List;

/*
 * 首先初始化一个Hero集合，里面放100个Hero对象，名称分别是从
 * hero 0
 * hero 1
 * hero 2
 * ...
 * hero 99.
 * 通过遍历的手段，删除掉名字编号是8的倍数的对象
 */
public class DeleteArrayList {
	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<>();
		for(int i = 0;i < 100;i++) {
			heros.add(new Hero("hero" + i));
		}
		List<Hero> deleteHeros = new ArrayList<>();
		for(Hero h : heros) {
			int id = Integer.parseInt(h.name.substring(4));
			if(id % 8 == 0) {
				deleteHeros.add(h);
			}
		}
		for(Hero h : deleteHeros) {
			heros.remove(h);
		}
		for(Hero h : heros) {
			System.out.println(h);
		}
	}
}
