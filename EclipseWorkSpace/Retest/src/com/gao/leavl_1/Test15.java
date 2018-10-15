package com.gao.leavl_1;

public class Test15 {
	public static void main(String[] args) {
		int [] arr = {3,5,1,2};
		//bubbleSort(arr);
		//selectSort(arr);
		mergeSort(arr);
		print(arr);
	}
	public static void bubbleSort(int [] arr){
		if(arr==null||arr.length<2){
			return;
		}
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
		if(arr==null||arr.length<2){
			return;
		}
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				minIndex = arr[minIndex]<arr[j] ? minIndex : j;
			}
			if(minIndex!=i){
				swap(arr,minIndex,i);
			}
		}
	}
	public static void insertSort(int [] arr){
		if(arr==null||arr.length<2){
			return;
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = i-1; j >=0&&arr[j]>arr[j+1]; j--) {
				swap(arr,j,j+1);
			}
		}
	}
	public static void mergeSort(int [] arr){
		sortProcess(arr,0,arr.length-1);
	}
	private static void sortProcess(int[] arr, int left, int right) {
		if(left==right){
			return;
		}
		int mid = left + ((right-left)>>1);
		sortProcess(arr, left, mid);
		sortProcess(arr, mid+1, right);
		merge(arr,left,mid,right);
	}
	private static void merge(int[] arr, int left, int mid, int right) {
		int [] help = new int[right-left+1];
		int i = 0;
		int p1 = left;
		int p2 = mid+1;
		while(p1<=mid&&p2<=right){
			help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++] ;
		}
		while(p1<=mid){
			help[i++] = arr[p1++];
		}
		while(p2<=right){
			help[i++] = arr[p2++];
		}
		for (int j = 0; j < help.length; j++) {
			arr[left+j] = help[j];
		}
		
	}
	public static void swap(int [] arr,int i,int j){
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
	public static void print(int [] arr){
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
