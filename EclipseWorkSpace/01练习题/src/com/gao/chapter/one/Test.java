package com.gao.chapter.one;

public class Test {
	public static void main(String[] args) {
		for(int i = 0;i<4;i++) {
			for(int j = 0;j<i;j++)System.out.print(" ");
			System.out.print("*");
			for(int j = 3;j>i;j--)System.out.print(" ");
			for(int j = 2;j>i;j--)System.out.print(" ");
			if(i<3)System.out.println("*");
		}
		
		
	}
}
