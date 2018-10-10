package com.gao.io;

public class Student {
	public static void main(String[] args) {
		try {
			Student s = new Student(-1);
		} catch (MyException e) {
			System.out.println("hehehe");
		}
		
	}
	
	int age;

	public Student(int age) {
		super();
		if(age<0){
			throw new MyException(age);
		}
		this.age = age;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
