package com.gao;

public class PopSort {
	public static void main(String[] args) {
		int [] arr = new int [10];
		randomArr(arr);
		popSortHigh(arr);
		print(arr);
	}
	
	public static void popSortLow(int [] arr){
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void popSortHigh(int [] arr){
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			boolean b = false;
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					b = true;
				}
			}
			if(!b)return;
		}
	}
	
	
	
	
	
	public static void randomArr(int [] arr){
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
	}
	public static void print(int [] arr){
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
	
	}
	
}
