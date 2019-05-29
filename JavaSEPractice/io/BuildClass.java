package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * 自动创建有一个属性的类文件。
通过控制台，获取类名，属性名称，属性类型，根据一个模板文件，自动创建这个类文件，并且为属性提供setter和getter
 */
public class BuildClass {
	public static void main(String[] args) {
		System.out.println("请输入类的名称：");
		Scanner sc = new Scanner(System.in);
		String className = sc.next();
		System.out.println("请输入属性的类型：");
		String propertyType = sc.next();
		System.out.println("请输入属性的名字：");
		String propertyName = sc.next();
		File f1 = new File("d://model.java");
		File f2 = new File("d://afterReplace.java");
		char[] vn = propertyName.toCharArray();
        vn[0] = Character.toUpperCase(vn[0]);
        String Uvn = String.valueOf(vn);
        try (FileReader fr = new FileReader(f1);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(f2);
                PrintWriter pw = new PrintWriter(fw);) {
            System.out.println("替换后的内容：");
            int count = 0;
            while (true) {
                if (count > 13)
                    break;
                String str = br.readLine();
                str = str.replaceAll("@class@", className);
                str = str.replaceAll("@type@", propertyType);
                str = str.replaceAll("@property@", propertyName);
                str = str.replaceAll("@Uproperty@", Uvn);
                pw.println(str);
                System.out.println(str);
                count++;
            }
            System.out.println("已自动生成java类文件，保存在：" + f2.getAbsolutePath());
        } catch (IOException i) {
            i.printStackTrace();
        }
	}
}
