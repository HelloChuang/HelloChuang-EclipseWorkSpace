package com.gao.chapter.one;

public class FiveSortInif {
	public static void main(String[] args) {
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*100);
		int c = (int)(Math.random()*100);
		int d = (int)(Math.random()*100);
		int e = (int)(Math.random()*100);
		
		int temp;
		if(a>b) {
			temp = a;
			a = b;
			b = temp;
			}
		if(a>c) {
			temp = a;
			a = c;
			c = temp;
		}
		if(a>d) {
			temp = a;
			a = d;
			d = temp;
		}
		if(a>e) {
			temp = a;
			a = e;
			e = temp;
		}
		if(b>c) {
			temp = b;
			b = c;
			c = temp;
		}
		if(b>d) {
			temp = b;
			b = d;
			d = temp;
		}
		if(b>e) {
			temp = b;
			b = e;
			e = temp;
		}
		if(c>d) {
			temp = c;
			c = d;
			d = temp;
		}
		if(c>e) {
			temp = c;
			c = e;
			e = temp;
		}
		if(d>e) {
			temp = d;
			d = e;
			e = temp;
		}

		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
	
	}
}
