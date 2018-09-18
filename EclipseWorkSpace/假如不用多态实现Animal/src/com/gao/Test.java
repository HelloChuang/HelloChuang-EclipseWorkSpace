package com.gao;

public class Test {

	public void letAnimalCry(Animal a) {
		a.shut();
}
	public static void main(String[] args) {
		Test t = new Test();
		
		Animal d = new Dog();
		
		t.letAnimalCry(d);
	}
}
