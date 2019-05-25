package collectiondemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

/*
 * 使用如下键值对，初始化一个HashMap：
adc - 物理英雄
apc - 魔法英雄
t - 坦克
对这个HashMap进行反转，key变成value,value变成key
 keySet()可以获取所有的key, values()可以获取所有的value
 */
public class KeyAndValue {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("adc", "物理英雄");
		map.put("apc","魔法英雄");
		map.put("t", "坦克");
		for(String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
		List<String> keyList = new ArrayList<>();
		List<String> valueList = new ArrayList<>();
		for(String key : map.keySet()) {
			keyList.add(key);
		}
		for(String value : map.values()) {
			valueList.add(value);
		}
		map.clear();
		for(int i = 0;i < keyList.size();i++) {
			map.put(valueList.get(i),keyList.get(i));
		}
		for(String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}
}
