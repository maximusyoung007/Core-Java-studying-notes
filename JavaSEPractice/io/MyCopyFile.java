package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制文件是常见的IO操作，设计如下方法，实现复制源文件srcFile到目标文件destFile
 
public static void copyFile(String srcFile, String destFile){
}
 */
public class MyCopyFile {
	/*
	 *  使用字节流
	 */
	public static void copyFile(String src, String dest){
		File srcFile = new File(src);
		File destFile = new File(dest);
		try (FileInputStream fis = new FileInputStream(srcFile);
				FileOutputStream fos = new FileOutputStream(destFile)){
			byte[] all = new byte[(int) srcFile.length()];
			fis.read(all);
			fos.write(all);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String s1 = "D://test.txt";
		String s2 = "D://test2.txt";
		copyFile(s1,s2);
	}
}
