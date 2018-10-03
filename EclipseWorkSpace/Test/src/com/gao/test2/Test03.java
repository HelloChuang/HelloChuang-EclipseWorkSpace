package com.gao.test2;

public class Test03 {
	public static void main(String[] args) {
		int [] arr = {7,6,5,1,3};
		//bubbleSort(arr);
		//selectSort(arr);
		QSort(arr);
		
		System.out.println(binarySerch(arr, 5));
		print(arr);
	}
	public static void bubbleSort(int [] arr){
		for (int i = 0; i < arr.length-1; i++) {
			boolean b = false;
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
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
				if(arr[minIndex]>arr[j]){
					minIndex = j;
				}
			}
			if(minIndex!=i){
				int temp = arr[minIndex];
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
			int i = left -1;
			int j = right +1;
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
	public static int binarySerch(int [] arr,int target){
		int low = 0;
		int high = arr.length - 1;
		while(low<high){
			int midIndex = (low+high)>>1;
		if(target>arr[midIndex])low = midIndex + 1;
		else if(target<arr[midIndex])high = midIndex -1;
		else return midIndex;
		
		}
		return -1;
	}
	public static void print(int [] arr){
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
