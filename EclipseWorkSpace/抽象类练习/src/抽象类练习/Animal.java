package 抽象类练习;

public abstract class Animal {
	int age;
	public abstract void run();
}

class Dog extends Animal{

	@Override
	public void run() {
		System.out.println("DOG RUN!");
		doGet();
	}
	public void doGet() {
		System.out.println("DOG.doGet!");
	}
	
}
class Cat extends Dog{
	
	@Override
	public void run() {
		System.out.println("CAT RUN!");
	}
	
	public void doGet() {
		System.out.println("CAT.doGet!");
	}
	
}
