package com.gao.test;

public class TestDemo{
	public static void main(String[]args){
		double d = (int)(Math.random()*6)+1;
		System.out.println("你的点数是： ");
		System.out.println((int)d);
		
		if(d<4){
			System.out.println("你输了，你要支付我100000000块！！");
		}
		else if(d==4){
			System.out.println("恭喜你，打成平手！！");
		}
		else if(d==5){
			System.out.println("你赢了！奖金50块，再接再厉！！");
		}
		else if(d==6){
			System.out.println("你赢了！奖金100块！恭喜恭喜！");
		}
		
		
	}

}
