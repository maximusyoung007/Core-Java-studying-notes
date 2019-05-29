package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * public static void search(File folder, String search);
假设你的项目目录是 e:/project，遍历这个目录下所有的java文件（包括子文件夹），
找出文件内容包括 Magic的那些文件，并打印出来。
 */
public class FindFile {
	public static void search(File folder, String search) {
		File[] files = folder.listFiles();
		for(File f : files) {
			if(f.isDirectory()) {
				File subFolder = f.getAbsoluteFile();
				search(subFolder,search);
			}
			else if(f.isFile()) {
				int length = f.getName().length();
				String name = null;
				if(length > 5) {
					name = f.getName().substring(length-5,length);
					if(name.equals(".java")) {
						try(FileReader fr = new FileReader(f)){
							char[] all = new char[(int) f.length()];
				            // 以字符流的形式读取文件所有内容
				            fr.read(all);
				            String str = new String(all);
				            if(str.contains(search)) {
				            	System.out.println(f.getAbsolutePath());
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
			}
		}
	}
	public static void main(String[] args) {
		File f = new File("d://codes");
		String str = "Hero";
		search(f,str);
	}
}
