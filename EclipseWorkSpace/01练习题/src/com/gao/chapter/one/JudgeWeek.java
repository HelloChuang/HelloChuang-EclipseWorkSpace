package com.gao.chapter.one;

import java.util.Scanner;

/**
 * 2.请根据英文单词的第一个字母判断星期几，如果第一个字母是一样的，则继续判断第二个字母。
 * 例如如果第一个字母是S,则继续判断第二个字母，如果第二个字母是a,则输出“星期六”。
 * 星期的英文单词如下表所示。
星期一	星期二	星期三		星期四		星期五	星期六	       星期日
Monday	Tuesday	Wednesday	Thursday	Fridy	Saturday	Sunday
 * @author XX
 *
 */
public class JudgeWeek {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	char[] c = s.toCharArray();
	
	switch(c[0]) {
	case 'M':
	case 'm':System.out.println("周一");break;
	case 'w':
	case 'W':System.out.println("周三");break;
	case 'f':
	case 'F':System.out.println("周五");break;
	case 'T':
	case 't':
		if(c[1]=='u')System.out.println("周二");
		else System.out.println("周四");break;
	case 'S':
	case 's':
		if(c[1]=='a')System.out.println("周六");
		else System.out.println("周日"); break;
	
	}
	}
}
