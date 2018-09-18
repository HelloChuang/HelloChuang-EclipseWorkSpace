package com.gao;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		
		show();
	}
	public static void show() {
		Person[] persons = new Person[5];
		persons[0] = new Person(45,"ÕÅ°ØÖ¥",false);
		persons[1] = new Person(43,"Ğ»öª·æ",true);
		persons[2] = new Person(1,"Íõ·Æ",false);
		persons[3] = new Person(15,"Íõ·Æ",true);
		persons[4] = new Person(100,"Íõ·Æ",false);
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
