package com.gao.test2;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Test016 {
	public static void main(String args[]) {
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		mb_operate(a, b);
		System.out.println(a + "." + b);
	} 
	static void mb_operate(StringBuffer x, StringBuffer y) {
		x.append(y);//
		y = x;
	} 
}