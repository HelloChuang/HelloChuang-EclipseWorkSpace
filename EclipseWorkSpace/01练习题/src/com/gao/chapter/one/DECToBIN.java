package com.gao.chapter.one;

import java.util.Scanner;

/**
 * 13.�Ӽ�������ĳ��ʮ������������ת���ɶ�Ӧ�Ķ����������������
 * @author XX
 *
 */
public class DECToBIN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int temp;
		String s = "";
		while(x!=0) {
			temp = x%2;
			x/=2;
			s += temp;
		}
		
		int a = Integer.parseInt(s);
	
		int temp2 = 0;
		while(a!=0) {
			temp2 = temp2*10 + a%10;
			a /= 10;
		}
		System.out.println(temp2);
				
	}
}
