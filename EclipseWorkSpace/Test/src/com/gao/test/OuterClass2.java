package com.gao.test;

public class OuterClass2 {
	public static void main(String[] args) {
		//非静态内部类
		InnerClass inn = new OuterClass2().new InnerClass();
		//静态内部类
		OuterClass2.StaticInnerClass sinn = new OuterClass2.StaticInnerClass();
		//匿名内部类
		new Abst(){

			@Override
			public void show() {
				
				
			}};
		
	}
		//局部内部类
	
	private int age;
	public static int id;
	public class InnerClass{
		private int age;
		public  int id;
	}
	public static class StaticInnerClass{
		private int age;
		public static int id;
	}
}
abstract class Abst{
	public abstract void show();
}