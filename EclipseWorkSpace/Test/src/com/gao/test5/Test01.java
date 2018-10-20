package com.gao.test5;

public class Test01 {
	public static void main(String[] args) {
		int [] arr = {5,8,4,1,2,3,6};
		//bubbleSort(arr);
		//selectSort(arr);
		int i = binnarySearch(arr, 5);
		System.out.println(i);
		//print(arr);
		
	}
	public static void bubbleSort(int [] arr){
		for (int i = 0; i < arr.length-1; i++) {
			boolean b = false;
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
					b = true;
				}
			}
			if(!b)return;
		}
	}
	public static void selectSort(int [] arr){
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				minIndex = arr[minIndex]<arr[j] ? minIndex : j;
			}
			if(minIndex != i){
				swap(arr, minIndex, i);
			}
		}
	}
	public static int binnarySearch(int [] arr ,int target){
		int left = 0;
		int right = arr.length - 1;
		while(left<=right){
			int midIndex = (left+right) >> 1;
			if(arr[midIndex]>target){
				right = midIndex -1;
			}
			else if(arr[midIndex]<target){
			 left = midIndex+1;
			}
			else return midIndex;
		}
		
		
		return -1;
	}
	public static void swap(int [] arr,int x , int y){
		if(arr[x]==arr[y])return;
		
		arr[x] ^= arr[y];
		arr[y] ^= arr[x];
		arr[x] ^= arr[y];
	}
	public static void print(int [] arr){
		for (int i : arr) {
			System.out.println(i+" ");
		}
	}
}
