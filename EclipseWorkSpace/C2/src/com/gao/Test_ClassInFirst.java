package com.gao;
class Computer {
	String computerType;
}
public class Test_ClassInFirst {
	String name;
	int age;
	int id;
	Computer com = new Computer();
	void study() {
		System.out.println(com.computerType);
	}
	
	
	public static void main(String[] args) {
		Test_ClassInFirst stu = new Test_ClassInFirst();
		stu.name = "gaochuang";
		Computer com = new Computer();
		com.computerType = "联想";
		stu.com = com;
		stu.study();
		
		
	}
}

