package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 准备一个文本文件(非二进制)，其中包含ASCII码的字符和中文字符。
设计一个方法 
public static void encodeFile(File encodingFile, File encodedFile);
在这个方法中把encodingFile的内容进行加密，然后保存到encodedFile文件中。
加密算法： 
数字：
如果不是9的数字，在原来的基础上加1，比如5变成6, 3变成4
如果是9的数字，变成0
字母字符：
如果是非z字符，向右移动一个，比如d变成e, G变成H
如果是z，z->a, Z-A。
字符需要保留大小写
非字母字符
比如',&^ 保留不变，中文也保留不变
 */
public class EncryptFile {
	public static void encodeFile(File encodingFile, File encodedFile) {
		try(FileReader fd = new FileReader(encodingFile);
				FileWriter fw = new FileWriter(encodedFile);){
			char[] all = new char[(int) encodingFile.length()];
			System.out.println("加密之前的文件内容：");
			fd.read(all);
			for(int i = 0;i < all.length;i++) {
				System.out.print(all[i] + " ");
				if(i % 20 == 0)
					System.out.println();
			}
			for(int i = 0;i < all.length;i++) {
				if(0 <= all[i] && all[i] < 9) {
					all[i] += 1;
				}
				else if (all[i] == 9)
					all[i] = 0;
				else if(('a' <= all[i] && all[i] < 'z' ||(all[i] >= 'A' && all[i] < 'Z'))) {
					all[i] += 1;
				}
				else if(all[i] == 'z')
					all[i] = 'a';
				else if(all[i] == 'Z')
					all[i] = 'A';
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
		File f1 = new File("d://tmall.sql");
		File f2 = new File("d://tmalle.sql");
		encodeFile(f1,f2);
	}
}
