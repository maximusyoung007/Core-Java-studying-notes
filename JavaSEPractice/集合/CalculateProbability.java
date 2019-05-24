package collectiondemo;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 首先初始化一个List,长度是10，值是0-9。
然后不断的shuffle，直到前3位出现
3 1 4
shuffle 1000,000 次，统计出现的概率
 */
public class CalculateProbability {
	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<>();
		for(int i = 0;i < 10;i++) {
			lists.add(i);
		}
		double count = 0;
		for(int i = 0;i < 1000000;i++) {
			Collections.shuffle(lists);
			if(lists.get(0) == 3 && lists.get(1) == 1 && lists.get(2) == 4)
				count++;
		}
		double result = count / 1000000;
		NumberFormat format = NumberFormat.getPercentInstance();
		format.setMaximumFractionDigits(2);
		System.out.println(format.format(result));
	}
}
