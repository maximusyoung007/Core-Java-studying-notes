package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 复制文件夹,实现如下方法，把源文件夹下所有的文件 复制到目标文件夹下(包括子文件夹)
 
public static void copyFolder(String srcFolder, String destFolder){
	
}
 */
public class MyCopyFloder {
	public static void copyFolder(String srcFolder, String destFolder){
		File srcF = new File(srcFolder);
        File destF = new File(destFolder);
        if(srcF == null)
        	System.out.println("源文件夹不存在");
        if (srcFolder.equals(destFolder)) {
            System.out.println("目标文件夹与源文件夹名称一致且在同一目录，复制无效");
            return;
        }
        File[] allFile = srcF.listFiles();
        try {
        	for(File f : allFile) {
        		if (f.isDirectory()) {
                    // 若文件列表里有子文件夹，递归对其进行相同的复制操作
                    String subSrcFolder = new String(f.getAbsolutePath());
                    String subDestFolder = new String(destFolder + "/" + f.getName());
                    copyFolder(subSrcFolder, subDestFolder);
                } else if (f.isFile()) {
                	FileInputStream fis = new FileInputStream(f);
                    FileOutputStream fos = 
                    		new FileOutputStream(destFolder + "/" + f.getName()); 
                        byte[] data = new byte[(int) f.length()];
                        fis.read(data);
                        fos.write(data);
                 }
                 
        	}
        }catch(Exception e) {
        	e.printStackTrace();
        }
	}
	public static void main(String[] args) {
        String srcFolder = "D:/SSS";
        String destFolder = "D:/SSS2";
        System.out.println("要进行复制的文件夹为：" + srcFolder);
        copyFolder(srcFolder, destFolder);
        System.out.println("已将源文件夹中所有文件复制至目标文件夹：" + destFolder);
    }
}
