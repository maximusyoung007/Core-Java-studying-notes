package io;
/*
 * 一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。

遍历这个目录下所有的文件(不用遍历子目录)

找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
 */
import java.io.File;

public class IoPractice1 {
	public static void main(String[] args) {
		File f = new File("C:\\windows");
		File[] fs = f.listFiles();
		if(fs == null)
			return;
		long min = Long.MAX_VALUE;
		long max = 0;
		File minFile = null;
		File maxFile = null;
		for(int i = 0;i < fs.length;i++) {
			if(fs[i].isDirectory())
				continue;
			if(fs[i].length() > max) {
				max = fs[i].length();
				maxFile = fs[i];
			}
			if(fs[i].length() < min && fs[i].length() > 0) {
				min = fs[i].length();
				minFile = fs[i];
			}
		}
		System.out.println("最大的文件是" + maxFile.getAbsoluteFile() + 
				",长度是：" + maxFile.length() + "字节");
		System.out.println("最小的文件是" + minFile.getAbsoluteFile() + 
				",长度是：" + minFile.length() + "字节");
		
		
	}
}
