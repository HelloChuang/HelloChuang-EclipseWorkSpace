package com.gao.chapter.one;
/**
 * 2.根据成绩输出对应的等级，使用if多分支和switch语句分别实现。
a)A级   [90,100]
b)B级   [80,90)
c)C级   [70,80)
d)D级   [60,70)
e)E级   [0,60)
 * @author XX
 *
 */
import java.util.Scanner;

public class Work3_5_2 {
	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		x /= 10;
		
		switch(x) {
		case 0 :
		case 1 :
		case 2 :
		case 3 :
		case 4 :
		case 5 :System.out.println("E");break;
		case 6 :System.out.println("D");break;
		case 7 :System.out.println("C");break;
		case 8 :System.out.println("B");break;
		case 9 :System.out.println("A");break;
		case 10 :System.out.println("A");break;
		
		}
		}
	}
}
