package com.gao.test3;

public class Test13_hundrandDick {
	public static void main(String[] args) {
		int x,y,z;
		for ( x = 0; x <= 20; x++) {
			for (y = 0; y <= 30; y++) {
				z = 100 - x - y;
				if(z%3==0){
					int cost = x*5+y*3+z/3;
					if(cost==100){
						System.out.println("公鸡："+x+"母鸡:"+y+"小鸡"+z);
					}
				}
			}
		}
	}
}
