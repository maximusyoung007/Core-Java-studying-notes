package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * 找到一个大于100k的文件，按照100k为单位，拆分成多个子文件，并且以编号作为文件名结束。
比如文件 eclipse.exe，大小是309k。
拆分之后，成为 
eclipse.exe-0
eclipse.exe-1
eclipse.exe-2
eclipse.exe-3
close()在finally中
 */
public class SplitFile {
	public static void main(String[] args) {
		File f = new File("d://tmall.sql");
		int eachLength = 100 * 1024;
		System.out.println("原文件是" + f.getAbsolutePath() + "大小为" + f.length() + "字节");
		if (0 == f.length())
            throw new RuntimeException("文件长度为0，不可拆分");
        //创建一个文件内容数组，大小为原文件大小
        byte[] fileContent = new byte[(int)f.length()];
        int eachSize = 100 * 1024;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(f);//创建基于文件的输入流
            fis.read(fileContent);//将文件读取到数组中，
            fis.close();
            int fileNumber ;//拆分的份数
            if (0 == f.length()%eachSize)
            	fileNumber = (int)f.length() / eachSize;
            else
            	fileNumber = (int)f.length() / eachSize + 1;
 
            for (int i = 1;i <= fileNumber;i++){
            	File eachFile = new File("d://tmall-" + i + ".sql"); //getParent()返回此抽象路径名父目录的路径名字符串
            	byte[] eachContent;
            	// copyOfRange(byte[] original, int from, int to)将指定数组的指定范围复制到一个新数组
            	if (i!=fileNumber){//如果不是最后一个
            		eachContent = Arrays.copyOfRange(fileContent,eachSize*(i-1),eachSize*i);
            	}else {
            		eachContent = Arrays.copyOfRange(fileContent,eachSize*(i-1),fileContent.length);
            	}
            	fos = new FileOutputStream(eachFile);
            	fos.write(eachContent);
                System.out.println("子文件" + eachFile.getAbsolutePath()
                + "，其大小是" + eachFile.length() + "字节");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
        	if(fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
        	if(fos != null)
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
        }
	}
}
