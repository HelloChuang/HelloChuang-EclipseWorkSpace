package com.gao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Test_DateFormat {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  //��ʽ�����
		Date d = new Date(13213213);
		String str = df.format(d);
		System.out.println(str);
		
		
		System.out.println("#######################");
		String str2 = "1996-3-28";
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date d2 = df2.parse(str2);
			System.out.println(d2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
