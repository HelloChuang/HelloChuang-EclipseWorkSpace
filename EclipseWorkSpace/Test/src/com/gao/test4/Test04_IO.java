package com.gao.test4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *测试缓冲流
 */
public class Test04_IO {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException  {
		File file = new File("f:\\test2.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("共产主义接班人\n我们是");
		bw.flush();
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();   //重要的方法  读完之后会返回null
		while(line!=null){
			System.out.println(line);
			line = br.readLine();
		}
		
		
		
		
		
	}
	
			
}
