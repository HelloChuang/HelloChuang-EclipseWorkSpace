package com.gao.test2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test07 {	
	public static void main(String[] args) {
		//delete(new File("C:\\Users\\XX\\Desktop\\Hello"));
		File file = new File("C:\\Users\\XX\\Desktop\\Hello\\test.txt");
		System.out.println(file.isHidden());
		
		System.out.println(file.isFile());
		
	}
	public static void delete(File file){
		if(file.isDirectory()){
			File[] listFiles = file.listFiles();
			for (File f : listFiles) {
				delete(f);
			}
		}
		file.delete();
		
		
		
	}
	public static void showDir(){
		File file = new File("C:\\Users\\XX\\Desktop\\Hello");//目录
		File[] listFiles = file.listFiles(); //与file.list返回字符串不同，file.listFiles获得的是File对象列表
		int fileCount = 0; //记录文件个数
		int dirCount = 0;  //记录目录个数
		long usableSpace = 0;  //记录该目录剩余空间大小
		for (File f : listFiles) {    //遍历输出
			long lastModified = f.lastModified();	//最后修改日期
			Date date = new Date(lastModified);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String format = sdf.format(date);
			System.out.printf("%-25s",format);   
			
			System.out.printf("%-15s",f.getName());  //文件名字
			
			String s = "";
			if(f.isDirectory()){		//是否是目录
				s = "<Dir>";
				dirCount++;
			}else 
				{
				fileCount++;
				}
			System.out.printf("%-10s",s);
			System.out.printf("%-10s",f.length());   //文件大小

			System.out.printf("%-28s",f.getParent());  //上层目录
			System.out.println();
			usableSpace = f.getUsableSpace();     //剩余空间
		}
		System.out.printf("\n\n%30s",fileCount+"个文件" + " " +dirCount+"个目录"+"  剩余空间大小："+ usableSpace);
	}
}
