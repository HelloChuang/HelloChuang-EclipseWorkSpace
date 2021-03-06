package com.gao.test2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test06_Date {
	public static void main(String[] args) throws ParseException {
		System.out.println("==========DateFormat================");
		//1. 输出 date 时 西方国家的时间风格
		Date date = new Date();
		String s = DateFormat.getDateTimeInstance().format(date);
		System.out.println(s);
		//2.难以计算毫秒 来获得指定时间的 Date 对象
		String s2 = "1996-4-28 7:0:0";
		Date parse = DateFormat.getDateTimeInstance().parse(s2);
		 long year = date.getTime() - parse.getTime();
		 //获取自己的年龄
		 Date date2 = new Date(year);
		 System.out.println(date2.getYear()-70);
		 
		 
		 long i = year/31536000000L;
		 System.out.println(i);
		 
		 System.out.println("========SimpleDateFormat=============");
		 String format = SimpleDateFormat.getDateTimeInstance().format(date);  //与DateFormat一样
		 System.out.println(format);
		 //几种构造方法
		 //1.默认构造方法
		 SimpleDateFormat sdf = new SimpleDateFormat();
		 String s3 = sdf.format(date);
		 System.out.println(s3);
		 //2.构造时指定规则
		 sdf = new SimpleDateFormat("yyyy年MM月dd日       HH时mm分ss秒");
		 System.out.println( sdf.format(date));
		 //解析
		 SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
		 String str = "1321321996年4月27日";
		 str = str.substring(6);   //忽略前六个字符
		 Date d2 = sdf2.parse(str);
		 System.out.println(d2);
		 
				 
		
				
	}
}
