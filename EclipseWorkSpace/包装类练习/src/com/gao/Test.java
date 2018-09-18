package com.gao;

/**
 * @author Gaoch
 *Integer包装类练习
 *
 */
public class Test {
	public static void main(String[] args) {
		Integer i = new Integer(1000);//新建
		System.out.println(Integer.MAX_VALUE);//最大值
		System.out.println(Integer.toHexString(i));//转化为16进制
		
		Integer i2 = Integer.parseInt("234");//几种字符串转I n t 的方法
		Integer i3 = new Integer("333");
		System.out.println(i2.intValue());
		
		String str = 234+"";				//in t转字符串的骚操作
		
		
		
	}
	
}
