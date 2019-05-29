package io;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 要求
第一种方式： 使用缓存流把两个数字以字符串的形式写到文件里，再用缓存流以字符串的形式读取出来，然后转换为两个数字。 
注： 两个数字之间要有分隔符用于区分这两个数字。 比如数字是31和15，如果不使用分隔符，那么就是3115，读取出来就无法识别到底是哪两个数字。 使用分隔符31@15能解决这个问题。

第二种方式： 使用数据流DataOutputStream向文件连续写入两个数字，然后用DataInpuStream连续读取两个数字
 */
public class WriteNumber {
	//缓存流
	public static void writeNumberByBufferedReader(File file) {
		try(FileWriter fw = new FileWriter(file);PrintWriter pw = new PrintWriter(fw)){
			pw.print("31");
			pw.print(" ");
			pw.print("15");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(FileReader fd = new FileReader(file);BufferedReader br = new BufferedReader(fd)){
			String line = br.readLine();
			System.out.println(line);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//数据流
	public static void writeNumberByDataOutputStream(File file) {
		try(FileOutputStream fos = new FileOutputStream(file);
				DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeInt(31);
            dos.writeInt(15); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream(file);
				DataInputStream dis = new DataInputStream(fis)){
			int i1 = dis.readInt();
			int i2 = dis.readInt();
			System.out.print(i1 + " " + i2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * 数据流的方式在文件中是以乱码显示的
	 */
	public static void main(String[] args) {
		File f1 = new File("d://writeNumberByBufferedReader.txt");	
		File f2 = new File("d://writeNumberByDataOutputStream.txt");
		writeNumberByBufferedReader(f1);
		writeNumberByDataOutputStream(f2);
	}
}
