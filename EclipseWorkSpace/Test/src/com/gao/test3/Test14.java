package com.gao.test3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test14 {
	public static void test() throws MyException{//1.如果遇到 throws , 那么异常会抛给 本方法的调用处 去解决
		if(2>1){
			throw new MyException();
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) throws MyException {
		
		
		try {	//2.如果 try catch 会尝试着捕获异常  捕获成功程序继续向下执行  捕获失败 抛给方法调用者
			test();
		} catch (ArrayIndexOutOfBoundsException s) {// 捕获失败 抛给方法调用者
			s.printStackTrace();
		}
		catch (Exception e) {   //假如调用此catch 因为有该发生的异常属于Exceptoion  可以捕获成功  如该例子
			e.printStackTrace();
		}
		
	//	String i = args[0];  
		//3.如果没有任何异常处理机制的内容 , 就会执行默认的机制  . 抛给方法调用着  , 如果一直向上抛 , 中间环节都没有处理  ,  最终抛给虚拟机
		//虚拟机会 输出异常信息  中止程序 .
		
		
		
		File file = new File("D:\\Test\\test.txt");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
		    fis = new FileInputStream(file);
		    fos = new FileOutputStream("f:\\result.txt");
			int read = fis.read();
			
			while(read != -1){
				fos.write(read);
				System.out.println((char)read);
				read = fis.read();
			}
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
