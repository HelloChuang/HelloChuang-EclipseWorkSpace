package com.gao;

import java.util.Date;

/**
 * 以1970年1月1日为一个标准，以毫秒级计算时间，用long保存
 * @author Gaoch
 *
 */
public class DateTest {
	public static void main(String[] args) {
		Date d = new Date();    				//d为当前系统时间
		System.out.println(d.toGMTString());
		long t = System.currentTimeMillis();
		System.out.println(t);
		Date d2 = new Date(1000);
		System.out.println(d2.toGMTString());
		
		d2.setTime(24645654);						//设置时间
		System.out.println(d2.toGMTString());
		
		System.out.println(d2.getTime());			//获取时间
		System.out.println(d.getTime()<d2.getTime());//比较时间
	
	}
	
}
