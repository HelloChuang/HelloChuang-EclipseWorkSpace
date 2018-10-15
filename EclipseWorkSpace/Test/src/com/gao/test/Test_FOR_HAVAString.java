package com.gao.test;

import java.util.Scanner;

public class Test_FOR_HAVAString {
	public static void main(String[] args) {
		String [] s ={"aa","bb","cc","dd","ee","ff","gg","hh","ii","jj"};
		Scanner sc = new Scanner(System.in);
		String sin = sc.next();
		boolean isExist = false;
		for (int i = 0; i < s.length; i++) {
		if(s[i].equals(sin)){ //== 比较是否为同一个对象 ，equals是比较字符串内容是否相等
		isExist = true;
		break;
		}
		else isExist = false;
		}
		if(isExist)
		System.out.println("存在");
		else System.out.println("不存在");
		}
}
