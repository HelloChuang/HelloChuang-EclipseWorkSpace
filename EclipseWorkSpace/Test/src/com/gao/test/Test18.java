package com.gao.test;

public class Test18 {
	public static void main(String[] args) {
		Student1 ddd = new Student1();
		
		
		
		
	}
}

class Student1{
	private long id;
	static long count = 20157730100L;
	{
		id = ++count;
	}
	public Student1() {
		super();
		System.out.println(this.id);
	}
	
}