package com.gao.test;

public class Test_XOR_CODE {
	public static void main(String[] args) {
		String s = "abc";
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			c[i] ^= '8';
			System.out.print(c[i]);
		}
		System.out.println();
		for(int i=0;i<c.length;i++) {
			c[i] ^= '8';
			System.out.print(c[i]);
		}
		
		
		float f = 11.1f; 
		
	}
}
