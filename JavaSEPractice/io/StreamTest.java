package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 参考文件输入流的建立，建立一个文件输出流
 */
public class StreamTest {
	public static void main(String[] args) {
		File f = new File("d://tmall.sql");
		try {
			FileOutputStream fops = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
