package com.gao;

import java.util.Arrays;

public class Test_Compareable_Test {
	public static void main(String[] args) {
		
		
		show();
	}
	public static void show() {
		Test_Compareable_Person[] persons = new Test_Compareable_Person[5];
		persons[0] = new Test_Compareable_Person(45,"�Ű�֥",false);
		persons[1] = new Test_Compareable_Person(43,"л����",true);
		persons[2] = new Test_Compareable_Person(1,"����",false);
		persons[3] = new Test_Compareable_Person(15,"����",true);
		persons[4] = new Test_Compareable_Person(100,"����",false);
		for (Test_Compareable_Person person : persons) {
			System.out.println(person);
		}
		Arrays.sort(persons);
		System.out.println("===================");
		for (Test_Compareable_Person person : persons) {
			System.out.println(person);
		}
	}
}
