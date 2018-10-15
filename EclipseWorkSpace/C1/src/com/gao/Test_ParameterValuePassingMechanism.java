package com.gao;

import java.lang.reflect.Array;

/**
 * @author Gaoch
 *参数传值机制
 *分析内存状态 ，轻易就能理解参数传递状态̬
 *
 */
public class Test_ParameterValuePassingMechanism {
	String name;
	int id;
	int age;
	
	public Test_ParameterValuePassingMechanism(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	void test1(Test_ParameterValuePassingMechanism u) {
		u.age = 20;
		
	}
	
	void test2(Test_ParameterValuePassingMechanism u) {
		u = new Test_ParameterValuePassingMechanism("gaochuang",21);
	}
	public static void main(String[] args) {
		Test_ParameterValuePassingMechanism user = new Test_ParameterValuePassingMechanism("gaochuang",18);
		user.test1(user);
		System.out.println(user.age);
		user.test2(user);
		System.out.println(user.age);
		char [] c = new char[8];
		int [] a = new int[8];
		
	}
}