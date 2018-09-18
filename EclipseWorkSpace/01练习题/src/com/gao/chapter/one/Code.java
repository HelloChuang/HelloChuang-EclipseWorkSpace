package com.gao.chapter.one;

public class Code {
	public static void main(String[] args) {
		 int x =1357,temp;
		 int d = ((x%10)+5)%10;
		 x /=10;
		 int c =((x%10)+5)%10;
		 x /= 10;
		 int b =((x%10)+5)%10;
		 x/=10;
		 int a = ((x%10)+5)%10;
		 x/=10;
		 temp = a;
		 a = d;
		 d = temp;

		 temp = c;
		 c = b;
		 b = temp; 
		 System.out.println(a*1000+b*100+c*10+d);
	}
}
