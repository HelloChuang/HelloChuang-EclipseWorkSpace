package com.gao.test4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *测试字符流
 */
public class Test02_FileReader_Writer {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter("f:\\test.txt");
			fw.write("测试字符流");
			fw.flush();
//			fw.close();   //close中有flush方法   不管用哪个,如果不用的话,下面的FileReader就读不到内容
//			Thread.sleep(10000);说明缓冲区的释放跟时间无关,非得flush不成
			fr = new FileReader("f:\\test.txt");
			int read = fr.read();
			while(read != -1){
				System.out.println((char)read);
				read = fr.read();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
//			if(fw != null){
//				try {
//					fw.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
			if(fr != null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
