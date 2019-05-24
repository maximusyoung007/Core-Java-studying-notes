package collectiondemo;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 生成50个 0-9999之间的随机数，要求不能有重复的
 */
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		while(set.size() < 50) {
			int random = (int)((Math.random()) * 10000);
			//System.out.println(random);
			set.add(random);
		}
		System.out.println("得到50个不重复的随机数");
		int count = 0;
		for(Iterator<Integer> it = set.iterator();it.hasNext();) {
			System.out.println((++count) + " " + it.next());
		}
	}
}
