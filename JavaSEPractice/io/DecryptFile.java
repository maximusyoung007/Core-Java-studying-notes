package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 解密在文件加密中生成的文件。
设计一个方法
 
public static void decodeFile(File decodingFile, File decodedFile);
 

在这个方法中把decodingFile的内容进行解密，然后保存到decodedFile文件中。
解密算法： 
数字：
如果不是0的数字，在原来的基础上减1，比如6变成5, 4变成3
如果是0的数字，变成9
字母字符：
如果是非a字符，向左移动一个，比如e变成d, H变成G
如果是a，a->z, A-Z。
字符需要保留大小写
非字母字符：
比如',&^ 保留不变，中文也保留不变
 */
public class DecryptFile {
	public static void decodeFile(File decodingFile, File decodedFile) {
		try(FileReader fd = new FileReader(decodingFile);
				FileWriter fw = new FileWriter(decodedFile);){
			char[] all = new char[(int) decodingFile.length()];
			System.out.println("解密之前的文件内容：");
			fd.read(all);
			for(int i = 0;i < all.length;i++) {
				System.out.print(all[i] + " ");
				if(i % 20 == 0)
					System.out.println();
			}
			for(int i = 0;i < all.length;i++) {
				if(0 < all[i] && all[i] <= 9) {
					all[i] -= 1;
				}
				else if (all[i] == 0)
					all[i] = 9;
				else if(('a' < all[i] && all[i] <= 'z' ||(all[i] > 'A' && all[i] <= 'Z'))) {
					all[i] -= 1;
				}
				else if(all[i] == 'a')
					all[i] = 'z';
				else if(all[i] == 'A')
					all[i] = 'Z';
				else
					all[i] = all[i];
			}
			fw.write(all);
			System.out.println("加密之后的文件内容：");
			for(int i = 0;i < all.length;i++) {
				System.out.print(all[i] + " ");
				if(i % 20 == 0)
					System.out.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		File f1 = new File("d://tmalle.sql");
		File f2 = new File("d://tmalle2.sql");
		decodeFile(f1,f2);
		
	}
}
