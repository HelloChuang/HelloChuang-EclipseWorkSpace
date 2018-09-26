package com.gao.test;

public class OuterClass { // 包含了内部类的类 这是外部类

	public static void main(String[] args) {
		// 创建外部类的对象
		OuterClass outerClass = new OuterClass();
		// 根据外部类的对象创建内部类的对象 这里使用 .new 的方式
		InnerClass innerClass = outerClass.new InnerClass();
		InnerClass2 innerClass2 = new InnerClass2();
		int i = innerClass2.id;
		
		System.out.println(OuterClass.InnerClass2.angle);
	}

	private String name;
	private int age;
	static int id;
	private OuterClass() {

	}

	public OuterClass(String name, int age) {

		super();
		this.name = name;
		this.age = age;
	}

	private static void add() {
		System.out.println("OuterClass.add()");
	}

	public void outerShow() {
		System.out.println("我是外部类的 show方法");
		// 在 非静态方法里 可以直接 new 内部类的对象
		InnerClass innerClass = new InnerClass();
		// this.new InnerClass(); this. 被隐藏了
	}

	class InnerClass {// 成员内部类
		static final public int count = 1;// 不是静态属性 这是常量 静态的常量

		private int iname;

		public InnerClass() {
		}

		public InnerClass(int iname) {
			this.iname = iname;
		}

		public void innerShow() {
			System.out.println("我是内部类的 show 方法");
			// 两者有同名属性的时候
			// 使用 外部类.类名.属性 的方法 可以定位使用 外部类的属性
			String i = OuterClass.this.name;
		}
	}

	// 唯一标识 : com.innerclass.OuterClass.A
	class A {
	}
	static class InnerClass2{
		public static int angle;
		public int id;
		public static void main(String[] args) {
			OuterClass outer = new OuterClass();
			String s= outer.name;
		}
		
	}
}