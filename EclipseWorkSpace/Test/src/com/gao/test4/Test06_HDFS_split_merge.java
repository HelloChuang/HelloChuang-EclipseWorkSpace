package com.gao.test4;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test06_HDFS_split_merge {
	public static void main(String[] args) throws IOException {
		HDFS hdfs = new HDFS();
		//hdfs.splitFile(new File("d:\\test.mp4"), 5, "f:\\", "hello");
		//hdfs.mergeFiles(new File("f:\\test.mp4"), 5, "f:\\", "hello");
	}
}

class HDFS {
	
	@SuppressWarnings("resource")
	public boolean mergeFiles(File targetFile, int count, String path, String name) {
		try {
			FileOutputStream fos = new FileOutputStream(targetFile);
			for (int i = 0; i < count; i++) {
				FileInputStream fis = new FileInputStream(path+name+i);
				byte [] buf = new byte[128];
				int size = fis.read(buf);
				while(size>0){
					fos.write(buf, 0, size);
					size = fis.read(buf);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	
	
	public boolean splitFile(File sourceFile, int count, String path, String name) throws IOException {
		long size = sourceFile.length();
		long sizePerFile = size / count + 1;
		FileInputStream fis = new FileInputStream(sourceFile);
		// BufferedInputStream bis = new BufferedInputStream(fis);
		// int read = bis.read(); //发现了用字节输入缓冲流读的话无法获得所读的长度,想要做到等长分割有待改进
		byte[] buf = new byte[128];
		for (int i = 0; i < count; i++) {
			FileOutputStream fos = null;

			int lenOfRead = fis.read(buf);
			int countSize = 0;

			while (lenOfRead > 0) {
				fos = new FileOutputStream(path + name + i);
				fos.write(buf, 0, lenOfRead);
				countSize += lenOfRead;
				if (countSize > sizePerFile)
					break;
				lenOfRead = fis.read(buf);
			}
			fos.close();
			System.out.println(i + 1);
		}

		return true;
	}

	
}