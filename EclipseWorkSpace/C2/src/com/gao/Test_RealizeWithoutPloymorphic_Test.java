package com.gao;

public class Test_RealizeWithoutPloymorphic_Test {

	public void letAnimalCry(Test_RealizeWithoutPloymorphic_Animal a) {
		a.shut();
}
	public static void main(String[] args) {
		Test_RealizeWithoutPloymorphic_Test t = new Test_RealizeWithoutPloymorphic_Test();
		
		Test_RealizeWithoutPloymorphic_Animal d = new Test_RealizeWithoutPloymorphic_Dog();
		
		t.letAnimalCry(d);
	}
}
