package com.gao.test;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[50];
		judgeNum(arr, n);
	}
	public static void judgeNum(int [] arr,int n){
		for (int i = 0; i < 50; i++) {
			arr[i] = (int)(Math.random()*n);
		}
		print(arr);
		System.out.println("最大数：" + maxNum(arr));
		System.out.println("最小数：" + minNum(arr));
		System.out.println("大于等于60的数有：" + countNum(arr));
		
		
	}
	public static int maxNum(int [] arr){
		int max  = arr[0];
		for (int i : arr) {
			if(i > max)max = i;
		}
		return max;
	}
	public static int minNum(int [] arr){
		int min  = arr[0];
		for (int i : arr) {
			if(i < min )min  = i;
		}
		return min;
	}
	public static int countNum(int [] arr){
		int count = 0;
		for (int i : arr) {
			if(i>=60)count++;
		}
		return count;
	}
	public static void print(int [] arr){
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
	
	}
}