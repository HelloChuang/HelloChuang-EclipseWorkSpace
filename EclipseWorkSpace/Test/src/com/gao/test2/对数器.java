package com.gao.test2;

import java.util.Arrays;

public class 对数器 {
	
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
	// for test
		public static void comparator(int[] arr) {
			Arrays.sort(arr);
		}

		// for test
		public static int[] generateRandomArray(int maxSize, int maxValue) {
			int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
			}
			return arr;
		}

		// for test
		public static int[] copyArray(int[] arr) {
			if (arr == null) {
				return null;
			}
			int[] res = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				res[i] = arr[i];
			}
			return res;
		}

		// for test
		public static boolean isEqual(int[] arr1, int[] arr2) {
			if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
				return false;
			}
			if (arr1 == null && arr2 == null) {
				return true;
			}
			if (arr1.length != arr2.length) {
				return false;
			}
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					return false;
				}
			}
			return true;
		}

		// for test
		public static void printArray(int[] arr) {
			if (arr == null) {
				return;
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}

	
}
