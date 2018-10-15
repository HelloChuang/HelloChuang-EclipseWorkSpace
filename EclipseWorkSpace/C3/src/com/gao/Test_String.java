package com.gao;

/**
 * 1.�ַ���������ڻ�����   ==   ��    equals
 * 2.�ַ��������ڱ����õ�ʱ��򱻱Ƚϵ�ʱ�򷵻�ֵ���
 * 3.charAt�����÷�
 * 4.indexOf�����÷�
 * 5.substring�����÷�
 * 6.replace�����÷�
 * 7.split�����÷�
 * 8.trim�����÷�
 * 9.lastIndex()
 * 10.startsWith()
 * 11.endsWith()
 * 12.toLowerCase()
 * 13.toUpperCase()
 * 14.equalsIgnoreCase()
 * @author Gaoch
 *
 */
public class Test_String {
	public static void main(String[] args) {
		String s1 = new String("abcd");
		String s2 = new String("abcd");
		System.out.println(s1.charAt(2));//返回索引为2的位置
		System.out.println(s2.equals(s2));//比较两个对象的内容
		System.out.println(s1==s2);			//比较两个对象的地址
		
		String s3 = "def";
		String s4 = "def";
		System.out.println(s3.equals(s4));//返回true  常量池
		System.out.println(s3==s4);		//true
		
		System.out.println(s3.indexOf('f'));//返回第一个f出现的索引
		String s = s3.substring(1);//从索引1开始往后切割	  
		System.out.println(s);	//		
		
		String s5 = s3.replace('e','*');//输出d*f   返回一个新的字符串
		System.out.println(s5);
		
		String s6 = "aabb,ccdd,eeff";
		String[] strArray = s6.split(",");//按特定的字符串分割  并且返回一个字符串数组
		for(int i = 0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		
		String s7 = "  aa bb  ";
		String s8 = s7.trim();//去掉首尾的空格
		System.out.println(s8);
		
		System.out.println("Abc".equalsIgnoreCase("abc"));//比较忽略大小写
		
		System.out.println("Abcbd".lastIndexOf("b"));//返回最后的字符串b的索引
		System.out.println("Abcbd".startsWith("Ab"));//返回boolean值   是否以Ab开头
		System.out.println("Abcbd".endsWith("bd"));//是否以bd结尾
		System.out.println("Abcbd".toLowerCase());//转化成小写  并且返回新的字符串
		System.out.println("Abcbd".toUpperCase());//大写
		
		System.out.println("###############");
		String gh = "a";							//创建了一个对象
		String gh2 = new String("a");				//创建了两个对象
		for (int i = 0; i < 3; i++) {
			gh += 1;
		}
		System.out.println(gh);
		
		
	}
}
