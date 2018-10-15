package com.gao;

public class Test12 {
	public static void main(String[] args) {
		
		System.out.println(diGui(3));
		printShow(9);
		
		int [] arr = {5,6,3,1,8,6,1,3,5,7,9,5,3,6,44,532};
		selectSortHigh(arr);
		print(arr);
	}
	public static int diGui(int x){
		if(x==1)return 1;
		return x + diGui(x-1);
	}
	public static void printShow(int x){
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(i+"×" + j+ "=" + i*j +" ");
			}
			System.out.println();
		}
	}
	public static void selectSortLow(int[] arr){
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void selectSortHigh(int[] arr){
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[minIndex]){
					minIndex = j;
				}
			}
			if(minIndex!=i){
				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	public static void print(int []arr){
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
