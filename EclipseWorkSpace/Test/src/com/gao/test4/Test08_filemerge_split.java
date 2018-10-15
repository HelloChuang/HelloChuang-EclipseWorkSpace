package com.gao.test4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
@SuppressWarnings("all")
public class Test08_filemerge_split {
	public static void main(String[] args) {
		//splitFile(new File("d:\\test.mp4"), 5, "f:\\", "hello");
		mergeFile(new File("f:\\helloc.mp4"), 5, "f:\\", "hello");
	}
	public static boolean mergeFile(File file,int count,String path,String name){
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			for (int i = 0; i < count; i++) {
				FileInputStream fis = new FileInputStream(path+name+i);
				byte [] buf = new byte[128];
				int size = fis.read(buf);
				while(size>0){
					fos.write(buf, 0, size);
					size = fis.read(buf);
				}
				fis.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return true;
	}
	public static boolean splitFile(File file,int count,String path,String name){
		long lenOfFile = file.length();
		long lenOfEach = (lenOfFile / count) + 1;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			byte[] buf = new byte[128];
			
			for (int i = 0; i < count; i++) {
				FileOutputStream fos = new FileOutputStream(path+name+i);
				int len = fis.read(buf);
				int count2 = 0;
				while(len>0){
					fos.write(buf,0,len);
					count2 += len;
					if(count2>lenOfEach)break;
					len = fis.read(buf);
				}
				fos.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return true;
	}
}