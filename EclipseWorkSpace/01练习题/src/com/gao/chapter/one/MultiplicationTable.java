package com.gao.chapter.one;

public class MultiplicationTable {
	public static void main(String[] args) {
		int m;
		for(int i = 1;i<10;i++) {
			for(int j = 1;j<=i;j++) {
				m = i*j;
				System.out.print(i+"��"+j+"="+m+" ");
			}
			System.out.println();
		}
	}
}
