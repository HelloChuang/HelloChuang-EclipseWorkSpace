package com.gao.chapter.one;

import java.util.Scanner;

/**
 * 3.�����·ݣ������Ӧ�ļ��ڣ�������������������ü��ڵĳ���ͻ��
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
		case 2:System.out.println("��װ�ع�");break;
		case 3:
		case 4:
		case 5:System.out.println("���ⰻȻ");break;
		case 6:
		case 7:
		case 8:System.out.println("�����ƻ�");break;
		case 9:
		case 10:
		case 11:System.out.println("�����Ҷ");break;
			
		}
	}
}
