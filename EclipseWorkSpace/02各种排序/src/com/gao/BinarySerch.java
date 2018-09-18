package com.gao;

public class BinarySerch {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int res = binarySerch2(arr, 8);
		System.out.println(res);
	}
	public static int binarySerch(int[] arr,int x){
		int low = 0;
		int high = arr.length-1;
		int midIndex = (low+high) >> 1;
		int mid = arr[midIndex];
		
		
		while(low<=high){
			if(x > mid){
				low = midIndex+1;
				midIndex = (low+high )>>1;
				mid = arr[midIndex];
			}
			else if(x < mid){
				high = midIndex -1;
				midIndex = (low+high)>>1;
				mid = arr[midIndex];
			}
			else{
				return midIndex;
			}
		}
		return -1;
		
	}
	public static int binarySerch2(int [] arr,int x){
		int low = 0;
		int high = arr.length-1;
		while(low<=high){
			int midIndex = (low+high)>>1;
		if(x>arr[midIndex]){
			low = midIndex + 1;
		}
		else if(x<arr[midIndex]){
			high = midIndex -1;
		}
		else return midIndex;
		}
		return -1;
	}
}
