package com.gao;

public class Test_ChaixiangZhuangxiang {
	public static void main(String[] args) {
		Integer i = 1000; //jdk5.0之后，自动装箱，编译器为我们改进代码 Integer i = new Integer();
		
		Integer b = 2000;
		int c = b; 
		
		System.out.println(c);
		
		Integer d = 1234;
		Integer d2 = 1234;
		System.out.println(d == d2);
		System.out.println(d.equals(d2));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		Integer e = 123; 		//[-128,127]之间的数，仍当作基本数据类型来处理
		Integer e2 = 123;
		System.out.println(e==e2);
		System.out.println(e.equals(e2));
	}
}
