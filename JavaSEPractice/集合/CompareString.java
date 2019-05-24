package collectiondemo;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 创建一个长度是100的字符串数组
使用长度是2的随机字符填充该字符串数组
统计这个字符串数组里重复的字符串有多少种
使用HashSet来解决这个问题
 */
public class CompareString {
	public static String randomString(int length) {
		String pool = "";
		for(int i = '0';i < '9';i++) 
			pool += (char)i;
		for(int i = 'a';i < 'z';i++)
			pool += (char)i;
		for(int i = 'A';i <'Z';i++)
			pool += (char)i;
		char[] s = new char[length];
		for(int i = 0;i < length;i++) {
			int index = (int)(Math.random() * pool.length());
			s[i] = pool.charAt(index);
		}
		String result = new String(s);
		return result;
	}
	public static void main(String[] args) {
		String[] s = new String[100];
	    for (int i = 0; i < s.length; i++) {
	        s[i] = randomString(2);
	    }
	    // 打印
	    for (int i = 0; i < s.length; i++) {
	        System.out.print(s[i] + " ");
	        if ((i+1) % 20 == 0)
	            System.out.println();
	    }
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		for(String s1 : s) {
			if(!set1.add(s1))
				set2.add(s1);
		}
		System.out.println("共有" + set2.size() + "中重复字符串，分别是");
		for(Iterator<String> it = set2.iterator();it.hasNext();) {
			String temp = it.next();
			System.out.print(temp + " ");
		}
	}
}
