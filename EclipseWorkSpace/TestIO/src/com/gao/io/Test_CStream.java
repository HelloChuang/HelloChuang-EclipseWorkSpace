package com.gao.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Test_CStream {
	public static void main(String[] args) throws IOException {
		try(
				FileReader r = new FileReader("c:/test.txt");
				FileWriter w = new FileWriter("f:/test.txt");
				) 
		{
			
			int len = r.read();
			while(-1!=len) {
				w.write(len);
				System.out.println(len);
				len = r.read();
			}
			w.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}