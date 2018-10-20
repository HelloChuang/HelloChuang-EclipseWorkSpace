package com.gao.test4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
@SuppressWarnings("all")
public class Test08_ {
	public static void main(String[] args) {
		//splitFile(new File("d:\\test.mp4"), 5, "f:\\", "hello");
		mergeFile(new File("f:\\hello.mp4"), 5, "f:\\", "hello");
	}
	
	public static boolean splitFile(File file,int count,String path,String name){
		long lenOfFile = file.length();
		long lenOfEach = (lenOfFile / count) + 1;
		try {
			FileInputStream fis = new FileInputStream(file);
			byte [] buf = new byte[128];
			for (int i = 0; i < count; i++) {
				FileOutputStream fos = new FileOutputStream(path+name+i);
				int size = fis.read(buf);    //返回的是数组内容的真是个数
				int sizeCount = 0;
				while(size > 0){
					fos.write(buf,0,size);
					sizeCount += size;
					if(sizeCount>lenOfEach)break;
					size = fis.read(buf);
				}
				fos.close();
				System.out.println("success"+i);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return true;
	}
	public static boolean mergeFile(File file,int count,String path,String name){
		FileOutputStream fos = null;
		try {
			  fos = new FileOutputStream(file);
			  FileInputStream fis = null;
			byte[] buf = new byte[128];
			for (int i = 0; i < count; i++) {
				fis = new FileInputStream(path+name+i);
				int len = fis.read(buf);
				while(len>0){
					fos.write(buf, 0, len);
					len = fis.read(buf);
				}
				fis.close();
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fos!=null) 
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return true;
	}
}