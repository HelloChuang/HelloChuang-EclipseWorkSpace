package com.gao;

/**
 * @author Gaoch
 *
 */
public class Test_StaticMethodAndAttribute {
	String name;
	int age;
	int id;
	static String school;
	//静态初始化块
	static {
	    school = "ZZU";
		selfIntraduce();
	}
	
	static void selfIntraduce() {
		System.out.println("我来自于"+school);
	}
	public static void main(String[] args) {
		System.out.println(school);
		selfIntraduce();
	}
}
