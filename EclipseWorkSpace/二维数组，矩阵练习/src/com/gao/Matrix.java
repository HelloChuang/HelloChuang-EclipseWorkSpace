package com.gao;

public class Matrix {
	
	public static void main(String[] args) {
		int[][] a = {
				{1,3},
				{2,4},
		};
		int[][] b = {
				{1,2},
				{3,4},
		};
		int[][] c = new int[2][2];
		add(a,b,c);
		print(c);

	}
	public static void print(int[][] c) {
		for (int i = 0; i < c.length; i++) {
			for(int j=0;j<c.length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void add(int[][] a,int[][] b,int[][] c) {
		for(int i= 0;i<c.length;i++) {
			for(int j = 0;j<c.length;j++) {
				c[i][j] = a[i][j]+b[i][j];
			}
		}
	}
}
