package com.gao.fast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		try (FileInputStream is = new FileInputStream("c:/test.rar");
				FileOutputStream os = new FileOutputStream("f:/test.rar");)
		{
			byte [] b = new byte[1024<<8];
			int len = is.read(b);
			int con = 0;
			long start = System.currentTimeMillis();
			while(len>0) {
				os.write(b, 0, len);
				len = is.read(b);
				con++;
			}
			os.flush();
			
			long end = System.currentTimeMillis();
			System.out.println(end-start);
			System.out.println(con);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
