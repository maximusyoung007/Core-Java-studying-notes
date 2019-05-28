package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
/*
 * 把上述拆分出来的文件，合并成一个原文件。

以是否能正常运行，验证合并是否正确
用try()的方式关闭fos，在finally中关闭fis
 */
public class MergeFile {
	public static void main(String[] args) {
		File newFile = new File("d://combin.sql");
		FileInputStream fis = null;
		try (FileOutputStream fos = new FileOutputStream(newFile)){
            for(int i = 1;i <= 10;i++) {
            	File f = new File("d://tmall-" + i + ".sql");
            	fis = new FileInputStream(f);
            	byte[] b = new byte[(int) f.length()];
            	fis.read(b);
            	fos.write(b);
            }
            System.out.println("合拼后的文件是：" + 
            		newFile.getAbsolutePath() + ",大小是：" + newFile.length() + "字节");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        	if(fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        }
	}
}
