package com.gao.test3;

public class Test17 {
	public static void main(String[] args) {
		int [] arr = {8,6,2,1,5,8,9,5,4};
		heapSort(arr);
		//bubbleSort(arr);
		//selectSort(arr);
		QSort(arr);
		print(arr);
	}
	public static void bubbleSort(int [] arr){
		for (int i = 0; i < arr.length-1; i++) {
			boolean b = false;
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					swap(arr, j, j+1);
					b = true;
				}
			}
			if(!b)return;
		}
	}
	public static void selectSort(int [] arr){
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for (int j = 1+i; j < arr.length; j++) {
				minIndex = arr[minIndex]<arr[j] ? minIndex : j;
			}
			if(minIndex!=i){
				swap(arr, minIndex, i);
			}
		}
	}
	public static void QSort(int [] arr){
		QuickSort(arr,0,arr.length-1);
	}
	private static void QuickSort(int[] arr, int left, int right) {

		if(left<right){
			int flag = arr[left];
			int i = left-1;
			int j = right+1;
			while(true){
				while(arr[++i]<flag);
				while(arr[--j]>flag);
				if(i>=j)break;
				swap(arr, i, j);
			}
			QuickSort(arr, left, i-1);
			QuickSort(arr, j+1, right);
		}
		
	}
	
	public static void heapSort(int [] arr){
		if(arr==null||arr.length<2)return ;
		for (int i = 0; i < arr.length; i++) {
			heapInsert(arr, i);
		}
		int size = arr.length;
		swap(arr, 0, --size);
		while(size>0){
			heapify(arr, 0, size);
			swap(arr, 0, --size);
		}
	}
	public static void heapInsert(int [] arr,int index){
		while(arr[index]>arr[(index-1)/2]){
			swap(arr, index, (index-1)/2);
			index = (index-1)/2;
		}
	}

	public static void heapify(int [] arr ,int index,int size){
		int left = index*2+1;
		
		while(left<size){
			int largest = left+1<size&&arr[left+1]>arr[left] ? left+1 : left ;//呦呦呦忘了边界判断
			largest = arr[largest] > arr[index] ? largest : index;
			if(index == largest){   ////   忘了写了   如果这个节点已经是子树的最大值了，就结束循环
				break;
			}
			swap(arr, largest, index);
			index = largest;
			left = index*2+1;
		}
		
	}
	public static void swap(int []arr , int x, int y){
		if(arr[x]==arr[y])return;
		arr[x] ^= arr[y];
		arr[y] ^= arr[x];
		arr[x] ^= arr[y];
	}
	public static void print(int [] arr){
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
}
