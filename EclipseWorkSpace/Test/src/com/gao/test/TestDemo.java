package com.gao.test;

public class TestDemo{
	public static void main(String[]args){
		double d = (int)(Math.random()*6)+1;
		System.out.println("��ĵ����ǣ� ");
		System.out.println((int)d);
		
		if(d<4){
			System.out.println("�����ˣ���Ҫ֧����100000000�飡��");
		}
		else if(d==4){
			System.out.println("��ϲ�㣬���ƽ�֣���");
		}
		else if(d==5){
			System.out.println("��Ӯ�ˣ�����50�飬�ٽ���������");
		}
		else if(d==6){
			System.out.println("��Ӯ�ˣ�����100�飡��ϲ��ϲ��");
		}
		
		
	}

}
