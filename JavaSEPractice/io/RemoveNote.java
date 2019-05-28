package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 设计一个方法，用于移除Java文件中的注释
 
public void removeComments(File javaFile)
 

比如，移出以//开头的注释行
 
File f = new File("d:/LOLFolder/LOL.exe");
System.out.println("当前文件是：" +f);
//文件是否存在
System.out.println("判断是否存在："+f.exists());
//是否是文件夹
System.out.println("判断是否是文件夹："+f.isDirectory());
 


 */
public class RemoveNote {

	public static void main(String[] args) {
		File f = new File("d://Hero.java");
		File f2 = new File("d://Hero3.java");
		try(FileReader fd = new FileReader(f);
				FileWriter fw = new FileWriter(f2);
				BufferedReader br = new BufferedReader(fd);
				PrintWriter bw = new PrintWriter(fw);){
			System.out.println("去除文件之前：");
			while(true) {
				String line = br.readLine();
				System.out.println(line);
				if(line == null) 
					break;
				//System.out.println(line.length());
				if(line.length() >= 2) {
					String test = line.substring(0,2);
					if(!test.equals("//"))
						bw.println(line);
				}
			}
			//确实已经在Hero3.java中去除了注释，但为啥没有正确输出，以后再看吧...
			FileReader fd2 = new FileReader(f2);
			BufferedReader br2 = new BufferedReader(fd2);
			System.out.println("去除文件之后：");
			while(true) {
				String line = br2.readLine();
				if(line == null)
					break;
				System.out.println(line);
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
