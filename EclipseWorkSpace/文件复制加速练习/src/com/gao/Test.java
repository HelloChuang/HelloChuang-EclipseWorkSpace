package com.gao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		try (FileInputStream is = new FileInputStream("c:/test.rar");
				FileOutputStream os = new FileOutputStream("f:/test.rar");
				){
			long start = System.currentTimeMillis();
			byte[] b = new byte[256];
			int len = is.read(b);
			int con = 0;
			while(len > 0) {
				os.write(b,0,len);
				len = is.read(b);
				con++;
			}
			os.flush();
			
			long end = System.currentTimeMillis();
			System.out.println(end-start);
			System.out.println(con);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
	}
}
