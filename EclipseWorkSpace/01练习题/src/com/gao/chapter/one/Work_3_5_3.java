package com.gao.chapter.one;

import java.util.Scanner;

/**
 * 3.根据月份，输出对应的季节，并输出至少两个描述该季节的成语和活动。
 * @author XX
 *
 */
public class Work_3_5_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		switch(x) {
		
		case 12:
		case 1:
		case 2:System.out.println("银装素裹");break;
		case 3:
		case 4:
		case 5:System.out.println("春意盎然");break;
		case 6:
		case 7:
		case 8:System.out.println("骄阳似火");break;
		case 9:
		case 10:
		case 11:System.out.println("秋风落叶");break;
			
		}
	}
}
