package com.gao.chapter.one;

public class WhileTest {
	public static void main(String[] args) {
		int i  = 1;
		while(i<6) {
			int j = 1;
			while(j<6) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
