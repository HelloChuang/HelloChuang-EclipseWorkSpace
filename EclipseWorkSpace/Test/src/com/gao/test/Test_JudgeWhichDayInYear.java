package com.gao.test;

import java.util.Scanner;

/**
 * 2.题目：输入某年某月某日，判断这一天是这一年的第几天？
			分析：以3月5日为例，先把前两个月的加起来，然后再加上5天即本年第几天，特殊情况，闰年且输入月份大于3需考虑多加一天。可定义数组存储1-12月各月天数。
 * @author XX
 *
 */
public class Test_JudgeWhichDayInYear {
	public static void main(String[] args) {
		int day = 0;
		int [] arr = {0,31,28,31,30,31,30,31,31,30,31,31,30};
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		if(y%4==0)arr[2] = 29;
		
		Scanner sc2 = new Scanner(System.in);
		int m = sc2.nextInt();
		for (int i = 0; i < m; i++) {
			day += arr[i];
		}
		
		Scanner sc3 = new Scanner(System.in);
		int d = sc3.nextInt();
		day += d;
		
		System.out.println(day);
	}
}
