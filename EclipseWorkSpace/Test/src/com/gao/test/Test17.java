package com.gao.test;

public class Test17 {
	public static void main(String[] args) {
		Student s = new Student();
	}
}

class Student{
	private int age;
	private int id;
	
	
	public Student(){
		System.out.println("无参构造器");
		System.out.println("id:"+ id);
	}
	public Student(int age,int id){
		this.age = age;
		this.id = id;
	}
	{
		System.out.println("对id进行赋值操作");
		id = 3;
	}
	{
		System.out.println("代码块1");
		System.out.println("代码块2");
	}
	{
		System.out.println("代码块3");
		System.out.println("代码块4");
	}
	static {
		System.out.println("静态初始化块");
	}
	
}
