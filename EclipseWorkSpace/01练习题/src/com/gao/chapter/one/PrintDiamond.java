package com.gao.chapter.one;

/**
 * 
 * @author XX
 *
 */
public class PrintDiamond {
	public static void main(String[] args) {
		for(int i = 0;i<3;i++) {
			for(int j = 3;j>i;j--)System.out.print(" ");
			if(i>0)System.out.print("*");//顶点打一个
			for(int j = 1;j<i+1;j++)System.out.print(" ");//第二行两个*中间只能有一个空格
			for(int j = 1;j<i;j++)System.out.print(" ");
			System.out.println("*");
		}
		for(int i = 0;i<4;i++) {
			for(int j = 0;j<i;j++)System.out.print(" ");
			System.out.print("*");
			for(int j = 3;j>i;j--)System.out.print(" ");
			for(int j = 2;j>i;j--)System.out.print(" ");
			if(i<3)
			System.out.println("*");
		}
		
	}
}
