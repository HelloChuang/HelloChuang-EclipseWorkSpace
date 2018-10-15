package com.gao;

public abstract class Test_AbstructClass_Animal {
	int age;
	public abstract void run();
}

class Dogg extends Test_AbstructClass_Animal{

	@Override
	public void run() {
		System.out.println("DOG RUN!");
		doGet();
	}
	public void doGet() {
		System.out.println("DOG.doGet!");
	}
	
}
class Catt extends Dogg{
	
	@Override
	public void run() {
		System.out.println("CAT RUN!");
	}
	
	public void doGet() {
		System.out.println("CAT.doGet!");
	}
	
}
