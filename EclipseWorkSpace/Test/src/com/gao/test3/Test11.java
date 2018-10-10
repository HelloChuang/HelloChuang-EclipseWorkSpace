package com.gao.test3;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author XX
 *ip字符串     排序
192.168.31.180
123.11.23.123
 8.8.8.8
114.114.114.114
192.168.5.180
123.11.23.4
 */
public class Test11 {
	public static void main(String[] args) {
		String [] s = new String[]{
				"192.168.31.180",
				"123.11.23.123",
				" 8.8.8.8",
				"114.114.114.114",
				"192.168.5.180",
				"123.11.23.4"
		};
		for (int i = 0; i < s.length; i++) {
			s[i] = s[i].replaceAll("(\\d+)", "00$1");
		}
		for (String string : s) {
			System.out.println(string);
		}
		
		
		System.out.println("=================");
		for (int i = 0; i < s.length; i++) {
			s[i] = s[i].replaceAll("0*(\\d{3})","$1" );
		}
		for (String string : s) {
			System.out.println(string);
		}
		
		
		Arrays.sort(s);
		for (String string : s) {
			System.out.println(string);
		}
		
		for (int i = 0; i < s.length; i++) {
			s[i] = s[i].replaceAll("0*(\\d+)", "$1");
		}
		System.out.println("===================");
		for (String string : s) {
			System.out.println(string);
		}
		

				
				
				
				
				
				
				
				
		
	}
}
