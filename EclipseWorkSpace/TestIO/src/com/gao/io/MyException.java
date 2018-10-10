package com.gao.io;

public class MyException extends RuntimeException{
	int age;
	
	public MyException(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "错误的输入:"+this.age;
	}

}
