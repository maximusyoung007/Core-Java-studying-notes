package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input {
	public static void main(String[] args) {
		File f = new File("d:/tmall.sql");
		try {
			FileInputStream fis = new FileInputStream(f);
			byte[] all = new byte[(int) f.length()];
			fis.read(all);
			int i = 0;
			for (byte b : all) {
                //打印出来是65 66
                System.out.print(b + " ");
                i++;
                if(i % 10 == 0) {
                	System.out.println();
                }
            }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
