package com.gao.test;

public class Test21Class implements Test21Interface{
	public static void main(String[] args) {
		Test21Interface t1 = new Test21Class();
		Test21Interface t2 = new Test21Class2();
		
		Test21Class t = new Test21Class();
		t.show(t1);
		t.show(t2);
	}
	public static void show(Test21Interface t){
		t.add();
	}
	@Override
	public void add() {
		System.out.println("Test21Class.add()");
	}

}
class Test21Class2 implements Test21Interface{

	@Override
	public void add() {
		System.out.println("Test21Class2.add()");
		
	}
	
}
