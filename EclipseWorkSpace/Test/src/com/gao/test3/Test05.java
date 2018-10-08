package com.gao.test3;

public class Test05 {
	public static void main(String[] args) {
		Musician musician = new Musician();
		Erhu erhu = new Erhu();
		Piano piano = new Piano();
		violin violin = new violin();
		musician.play(erhu);
		musician.play(piano);
		musician.play(violin);
	}
}
class Musician{
	public void play(Instrument i){
		i.makeSound();
	}
}
abstract class Instrument{
	public abstract void makeSound();
}
class Erhu extends Instrument{

	@Override
	public void makeSound() {
		System.out.println("二胡的声音");
		
	}
	
}
class Piano extends Instrument{
	@Override
	public void makeSound() {
		System.out.println("钢琴的声音");
		
	}
}
class violin extends Instrument{
	@Override
	public void makeSound() {
		System.out.println("小提琴的声音");
		
	}
}