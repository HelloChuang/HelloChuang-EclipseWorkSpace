package com.gao.test3;

import org.apache.log4j.net.SyslogAppender;

public class MyException extends RuntimeException{
	@Override
	public String toString() {  
		// TODO Auto-generated method stub
		return "错误的算法";
	}
	
}