package com.gao.test3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test10_Regular {
	public static void main(String[] args) {		//校验  (匹配)
		String s = "931099184";
	
		String regex = "[1-9]\\d{4,10}";
		System.out.println(s.matches(regex));
		
		String s2 = "www.baidu.com";		//分割
		String regex2 = "\\.";
		String[] split = s2.split(regex2);
		for (String string : split) {
			
			System.out.println(string);
		}
		
		String s3 = "abcedaaaaabceeeeeekklsjadfhjjjjj";		//去重
		String regex3 = "(\\w)\\1+";
		String replacement = "***";
		String ss = s3.replaceAll(regex3, replacement);
		System.out.println(ss);
		
		String s4 = "15893687236";				//字符串替换
		String regex4 = "(1[35789][\\d])(\\d{4})(\\d{4})";
		String replacement2 = "$1****$3";
		String sss = s4.replaceAll(regex4, replacement2);
		System.out.println(sss);
		
		//正则获取					获取想要的字符串
		//1。先把正则规则封装成正则对象
		Pattern compile = Pattern.compile("\\d+");
		//2.把要操作的字符串 和正则对象进行关联 并得到 匹配引擎
		
		Matcher matcher = compile.matcher("klsadj234fhsakdjfh2341sdfl111kjsdh");
		//3 操作匹配引擎对象
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		
		
		
	}
}