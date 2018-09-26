package com.gao.test2;

public class StaticBand {
	public static void main(String[] args) {
		
		Son s = new Son();
		System.out.println("子类类型 	存储	子类属性");
		System.out.println(s.name);
		System.out.println("\n子类类型 	存储	子类方法(静态)");
		s.say();
		System.out.println("\n子类类型 	存储	子类方法(非静态)");
		s.hello();
		
		
		System.out.println("\n\n\n");
		System.out.println("父类类型 	存储	子类属性");
		Father f = new Son();
		System.out.println(f.name);
		System.out.println("\n父类类型 	存储	子类方法(静态)");
		f.say();
		System.out.println("\n父类类型 	存储	子类方法(非静态)");
		f.hello();
		
	}
}
class Father{
	protected String name  = "father's name";
	
	public static void say(){
		System.out.println("static in father");
	}
	protected void hello(){
		System.out.println("not static method in father");
		
	}
	

	
	
}

class Son extends Father{
	protected String name  = "son's name";
	public static void say(){
		System.out.println("static in son");
	}
	protected void hello(){
		System.out.println("not static method in son");
	}
}