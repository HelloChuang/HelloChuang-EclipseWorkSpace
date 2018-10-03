package com.gao.test2;

import java.util.Arrays;

public class Test10 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4};
		
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			s += arr[i];
		}
		int i = Integer.parseInt(s);
		++i;
		int x = i;
		int newIndex = 0;
		System.out.println(i);
		while(x!=0){
			
			x/=10;
			newIndex++;
		}
		int [] newArr = new int[newIndex];
		int f = 0;
		for(int j = newArr.length-1;i!=0&&j>=0;j--){
			f =  i%10;
			i /= 10;
			newArr[j] = f;
		}
		for (int j : newArr) {
			System.out.print(j+" ");
		}
		
		
	}
}
