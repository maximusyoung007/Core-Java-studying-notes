package collectiondemo;

import java.util.ArrayList;

/*
 * 如果就是要判断集合里是否存在一个 name等于 "hero 1"的对象，应该怎么做？
 */
public class TestCollection1 {
	public static void main(String[] args) {
		ArrayList<String> heros = new ArrayList<>();
		for(int i = 0;i < 5;i++) {
			heros.add("hero" + i);
		}
		for(int i = 0;i < 5;i++)
			System.out.println(heros.get(i));
		
		for(int i = 0;i < 5;i++) {
			if(heros.get(i).equals("hero1"))
				System.out.println("存在");
		}
	}
}
