package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * 准备一个长度是10，类型是Hero的数组，使用10个Hero对象初始化该数组

然后把该数组序列化到一个文件heros.lol

接着使用ObjectInputStream 读取该文件，并转换为Hero数组，验证该数组中的内容，是否和序列化之前一样

 */
public class SerializableArrays {

	public static void main(String[] args) throws ClassNotFoundException {
		File f = new File("d://heros.lol");
		List<Hero> heros = new ArrayList<>();
		for(int i = 0;i < 10;i++) {
			Hero hero = new Hero();
			hero.setName("hero" + i);
			hero.setHp(100);
			heros.add(hero);
		}
		try(FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis)){
			for(Hero h : heros) {
				oos.writeObject(h);
			}
			for(int i = 0;i < heros.size();i++) {
				Hero h2 = (Hero) ois.readObject();
				System.out.println(h2.getName());
				System.out.println(h2.getHp());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
