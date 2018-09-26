package com.gao;

public class QSort {
	public static void main(String[] args) {
		int [] arr = {5,3,7,6,9};
		QSort(arr);
		print(arr);
		
	}
	public static void QSort(int [] arr){
		QuickSort(arr,0,arr.length-1);
	}
	public static void QuickSort(int [] arr, int left, int right){
		
		if(left<right){
		 
		int flag = arr[left];				//先设置标记
		int i = left - 1;					//左右两边开始位置
		int j = right +1;
		while(true){
			while(arr[++i]<flag);			//在左边找到比midIndex大的
			while(arr[--j]>flag);			 //在右边找到比midIndex小的
			if(i>=j)break;
			swop(arr,i,j);
		}
		QuickSort(arr,left,i-1);
		QuickSort(arr, j+1,right);
		}
		
	}
	public static void swop(int [] arr,int x,int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	public static  void print(int [] arr){
		for (int i : arr) {
			System.out.print(i+" ");
			
		}
		System.out.println();
	}
	
}
