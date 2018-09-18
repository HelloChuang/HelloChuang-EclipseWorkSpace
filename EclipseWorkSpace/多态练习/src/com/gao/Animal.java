package com.gao;

public class Animal {
	public static void main(String[] args) {
		Dog d = new Dog();

		
		Animal a = new Dog();   	//自动向上转型
									//好处：可以操作和使用子类继承或重写的方法
									//失处：失去对子类新增成员变量和新增成员方法的操作和使用
								
		Dog d2 = (Dog)a;      //强制向下转型
		

		
		//Animal c = new Cat(); //两个子类不能互相转
		//Dog d3 = (Dog)c;
		
		LetAnimalCry(d);
		LetAnimalCry(a);
		LetAnimalCry(d2);
	//	LetAnimalCry(d3);
	}
	static void LetAnimalCry(Animal a) {  //父类引用指向子类对象
		a.shut();
	}
	public void shut() {
		System.out.println("叫了一声");
	}
	public final void cantbe() {  //final关键字  加在方法上，不允许被重写，可以被重载
									//加在类上，不允许被继承
	}								//加在变量上，不允许被修改，一旦赋了初值，就不允许再被赋值
}
class Dog extends Animal{
	public void shut() {
		System.out.println("汪汪汪！！");
	}
	public void LookDoor() {
		
	}
}
class Cat extends Animal{
	public void shut() {
		System.out.println("喵喵喵！！");
	}
}
