package com.gao;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		
		show();
	}
	public static void show() {
		Person[] persons = new Person[5];
		persons[0] = new Person(45,"�Ű�֥",false);
		persons[1] = new Person(43,"л����",true);
		persons[2] = new Person(1,"����",false);
		persons[3] = new Person(15,"����",true);
		persons[4] = new Person(100,"����",false);
		for (Person person : persons) {
			System.out.println(person);
		}
		Arrays.sort(persons);
		System.out.println("===================");
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
