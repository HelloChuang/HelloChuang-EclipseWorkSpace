package com.gao.test3;

import java.util.Arrays;

public class Test15 {
	public static void main(String[] args) {
		String[] s = {
				"192.168.31.180",
				"123.11.23.123",
				 "8.8.8.8",
				"114.114.114.114",
				"192.168.5.180",
				"123.11.23.4"
		};
		
		System.out.println("//---------------------------补零");
		for (int i = 0; i < s.length; i++) {
			s[i] = s[i].replaceAll("(\\d+)", "00$1");
		}
		for (String string : s) {
			System.out.println(string);
		}
		
		System.out.println("//-------------------------去零");
		for (int i = 0; i < s.length; i++) {
			s[i] = s[i].replaceAll("0*(\\d{3})", "$1");
		}
		for (String string : s) {
			System.out.println(string);
		}
		
		
		System.out.println("//-------------------------比较");
		Arrays.sort(s);
		for (String string : s) {
			System.out.println(string);
		}
		
		System.out.println("//-------------------------还原");
		for (int i = 0; i < s.length; i++) {
			s[i] = s[i].replaceAll("0*(\\d+)", "$1");
		}
		for (String string : s) {
			System.out.println(string);
		}
	}
}
