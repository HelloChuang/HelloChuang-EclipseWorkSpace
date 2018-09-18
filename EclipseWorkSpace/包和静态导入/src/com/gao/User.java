package com.gao;
import java.util.Date;
import java.sql.*;  //sql中也有一个叫Date的类，这个时候就都导入，调用的时候把包名也写上

import static java.lang.Math.PI;  //引入后可直接调用该类的静态属性，从而可以直接使用该类的静态属性
 /**
 * @author Gaoch
 *
 *
 */
public class User {
	public static void main(String[] args) {
		java.util.Date date = new Date();//调用的时候把包名也写上
		System.out.println(PI);
		System.out.println(date.toString());
	}
}
