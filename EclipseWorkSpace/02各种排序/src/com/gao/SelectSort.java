package com.gao;



public class SelectSort {
	public static void main(String[] args) {
		int [] arr = new int[20];
		
		
		System.out.println("============原数组============");
		randomArr(arr);
		print(arr);
		

		
		
		System.out.println("===========选择普通版============");
		selectSortLow(arr);
		print(arr);
		
		
		System.out.println("=============选择加强版=================");
		randomArr(arr);
		selectSort(arr);
		print(arr);
		
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
	public static void selectSort(int [] arr){
		int temp = 0;
		int count = 0;
		int exchange = 0;
		
		for(int i = 0;i<arr.length-1;i++){
			int minIndex = i;
			for(int j = i+1;j<arr.length;j++){
				count++;
				if(arr[minIndex]>arr[j]){
					minIndex = j;
				}
			}
			if(minIndex!=i){
				exchange++;
				temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
		System.out.println("循环次数："+ count +"	交换次数："+ exchange);
	}
	public static void selectSortLow(int [] arr){
		int temp = 0;
		int count = 0;
		int exchange = 0;
		for(int i = 0;i<arr.length-1;i++){
			for(int j = i+1;j<arr.length;j++){
				count++;
				if(arr[i]>arr[j]){
					exchange++;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("循环次数："+ count +"	交换次数："+ exchange);
	}
}