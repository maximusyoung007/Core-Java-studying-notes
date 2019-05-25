package collectiondemo;

import java.util.LinkedHashSet;

/*
 * 利用LinkedHashSet的既不重复，又有顺序的特性，把Math.PI中的数字，按照出现顺序打印出来，相同数字，只出现一次
 */
public class MathPI {
	public static void main(String[] args) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		String value = String.valueOf(Math.PI);
		for(int i = 0;i < value.length();i++) {
			char c = value.charAt(i);
			if(c <= '9' && c >= '0') {
				set.add(c);
			}
		}
		System.out.println(set);
	}
}
