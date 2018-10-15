package com.gao.test;

import java.util.Scanner;

/**
 * 2.���ݳɼ������Ӧ�ĵȼ���ʹ��if���֧��switch���ֱ�ʵ�֡�
a)A��   [90,100]
b)B��   [80,90)
c)C��   [70,80)
d)D��   [60,70)
e)E��   [0,60)
 * @author XX
 *
 */
public class Test_Switch {
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
