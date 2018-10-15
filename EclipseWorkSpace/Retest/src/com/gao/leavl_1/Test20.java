package com.gao.leavl_1;

public class Test20 {
	public static void main(String[] args) {
		int [] arr = {5,3,7,1,9};
		//bubbleSort(arr);
		//selectSort(arr);
		QSort(arr);
		print(arr);
		System.out.println(binarySerch(arr, 1));
	}
	public static int binarySerch(int [] arr, int target){
		int left = 0;
		int right = arr.length-1;
		while(left<=right){
		int midIndex = (right+left)>>1;
		if(arr[midIndex]>target){
			right = midIndex -1;
		}
		else if(arr[midIndex]<target){
			left = midIndex + 1;
		}
		else return midIndex;
		}
		return -1;
	}
	public static void bubbleSort(int [] arr){
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
	public static void selectSort(int [] arr){
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for (int j = 1+i; j < arr.length; j++) {
				if(arr[minIndex]>arr[j]){
					minIndex  = j;
				}
			}
			if(minIndex!=i){
				temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
	}
	public static void QSort(int [] arr){
		QuickSort(arr,0,arr.length-1);
	}
	private static void QuickSort(int[] arr, int left, int right) {
		if(left<right){
			int flag = arr[left];
			int i = left - 1;
			int j = right +1 ;
			while(true){
			while(arr[++i]<flag);
			while(arr[--j]>flag);
			if(i>=j)break;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			}
			QuickSort(arr, left, i-1);
			QuickSort(arr, j+1, right);
		}
		
	}
	public static void print(int []arr){
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
