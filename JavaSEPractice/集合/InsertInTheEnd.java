package collectiondemo;

import java.util.ArrayList;
import java.util.List;

/*
 * 比较 ArrayList和LinkedList 在最后面插入100000条数据，谁快谁慢？为什么？
 * 在List的中间位置，插入数据，比较ArrayList快，还是LinkedList快，并解释为什么？
 */
public class InsertInTheEnd {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		long time1 = insertLast(l1);
		System.out.println("ArrayList在末尾插入1000000个数据耗时" + time1 + "毫秒");
		List<Integer> l2 = new ArrayList<>();
		long time2 = insertLast(l2);
		System.out.println("LinkList在末尾插入1000000个数据耗时" + time2 + "毫秒");
		
		List<Integer> l3 = new ArrayList<>();
		long time3 = insertMiddle(l3);
		System.out.println("ArrayList在中间插入1000000个数据耗时" + time3 + "毫秒");
		List<Integer> l4 = new ArrayList<>();
		long time4 = insertMiddle(l4);
		System.out.println("LinkList在中间插入1000000个数据耗时" + time4 + "毫秒");
	}
	public static long insertLast(List<Integer> l) {
		int total = 100 * 10000;
		long start = System.currentTimeMillis();
		for(int i = 0;i < total;i++) {
			l.add(1);
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		return time;
	}
	public static long insertMiddle(List<Integer> l) {
		int total = 100 * 10000;
		long start = System.currentTimeMillis();
		for(int i = 0;i < total;i++) {
			l.add(l.size() / 2,1);
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		return time;
	}
}
