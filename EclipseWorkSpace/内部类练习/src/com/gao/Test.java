package com.gao;

public class Test {
	
	public static void main(String[] args) {
		Face.Nose n = new Face().new Nose();//实例化非静态内部类
		
		Face.Ear e = new Face.Ear(); //实例化静态内部类
		
		n.breath();
		e.listen();
	}
	
}
class Face{
	int size = 5;
	String type;
	
	class Nose{	//非静态内部类，只有外部类存在才存在
		public void breath() {
			System.out.println("呼吸！");
		}
	}
	static class Ear{  //静态内部类，其存在，外部类不一定存在
		public void listen() {
			System.out.println("听！");
		}
	}
}