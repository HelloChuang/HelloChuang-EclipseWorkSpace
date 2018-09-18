package com.gao;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args)  {
		MyArrayList arr = new MyArrayList(10) ;
		arr.add("aaaa");
		arr.add("bbbb");
		arr.add("cccc");
		arr.add("dddd");
		arr.add("eeee");
		arr.add("ffff");
		arr.add("gggg");
		System.out.println(arr.get(2));
		System.out.println(arr.size());
		System.out.println(arr.isEmpty());
		arr.remove("aaaa");
		System.out.println(arr.size());
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
	
	}
	
}
