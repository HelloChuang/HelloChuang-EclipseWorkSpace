package com.gao.leavl_1;

public class Test21 {
	public static void main(String[] args) {
		int [] arr = {4,7,1,5,9,6};
		//bubbleSort(arr);
		selectSort(arr);
		System.out.println(binarySearch(arr, 5));
		print(arr);
	}
	public static void bubbleSort(int [] arr){
		for (int i = 0; i < arr.length-1; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}
		
	}
	public static void selectSort(int [] arr){
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				minIndex = arr[minIndex]<arr[j]?minIndex:j;
			}
			if(minIndex!=i){
				swap(arr,minIndex,i);
			}
		}
	}
	public static void swap(int [] arr,int x,int y){
		if(arr[x]==arr[y])return;
		arr[x] ^= arr[y];
		arr[y] ^= arr[x];
		arr[x] ^= arr[y];
	}
	public static int  binarySearch(int [] arr,int target){
		int result = -1;
		int left = 0;
		int right = arr.length-1;
		if(left<right){
			int mid = (left+right) >> 1;
			if(target>arr[mid])left = mid +1;
			if(target<arr[mid])right = mid - 1;
			if(target==arr[mid])result = mid;
		}
		
		return result;
	}
	
	public static void print(int [] arr){
		for (int i : arr) {
			System.out.println(i+" ");
		}
	}
	
}
