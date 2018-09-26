package com.gao.test;

public class Test16 {
	public static void main(String[] args) {
		int [] arr = {5,3,1,7,2};
		//bubble(arr);
		Qsort(arr);
		print(arr);
	}
	public static void bubble(int [] arr){
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length-1-i; j++) {//忘了写-i
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(!flag ){
				return;
			}
		}
	}
	public static void selectSort(int [] arr){
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {//少写个+i
				if(arr[minIndex]>arr[j]){
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
	public static void insertSort(){
		
	}
	public static void Qsort(int [] arr){
		QuickSort(arr,0,arr.length-1);
	}
	public static void QuickSort(int [] arr , int left,int right){
		if(left<right){
			int flag = arr[left];
			int i = left - 1;
			int j = right +1;
			while(true){
				while(arr[++i]<flag);
				while(arr[--j]>flag);
				if(i>=j)break;
				swop(arr,i,j);
			}
			QuickSort(arr, left, i-1);
			QuickSort(arr, j+1, right);
		}
	}
	public static void swop(int [] arr,int i ,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	public static void print(int [] arr){
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
