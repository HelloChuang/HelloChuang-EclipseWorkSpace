package com.gao.chapter.one;

import java.util.Scanner;

/**
 * 2.�����Ӣ�ĵ��ʵĵ�һ����ĸ�ж����ڼ��������һ����ĸ��һ���ģ�������жϵڶ�����ĸ��
 * ���������һ����ĸ��S,������жϵڶ�����ĸ������ڶ�����ĸ��a,�����������������
 * ���ڵ�Ӣ�ĵ������±���ʾ��
����һ	���ڶ�	������		������		������	������	       ������
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
	case 'm':System.out.println("��һ");break;
	case 'w':
	case 'W':System.out.println("����");break;
	case 'f':
	case 'F':System.out.println("����");break;
	case 'T':
	case 't':
		if(c[1]=='u')System.out.println("�ܶ�");
		else System.out.println("����");break;
	case 'S':
	case 's':
		if(c[1]=='a')System.out.println("����");
		else System.out.println("����"); break;
	
	}
	}
}
