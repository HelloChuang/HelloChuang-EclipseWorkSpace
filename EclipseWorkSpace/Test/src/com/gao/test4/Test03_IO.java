package com.gao.test4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03_IO {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		File file = new File("f:\\t.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);//1.
			int read = fis.read();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fis != null){  //如果在1.之前报错  那么fis就为null   这句话就有用了(防御式编程)
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
