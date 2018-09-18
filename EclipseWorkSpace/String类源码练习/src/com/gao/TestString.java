package com.gao;

/**
 * 1.字符串相等易于混淆的   ==   和    equals
 * 2.字符串常量在被引用的时候或被比较的时候返回值如何
 * 3.charAt（）用法
 * 4.indexOf（）用法
 * 5.substring（）用法
 * 6.replace（）用法
 * 7.split（）用法
 * 8.trim（）用法
 * 9.lastIndex()
 * 10.startsWith()
 * 11.endsWith()
 * 12.toLowerCase()
 * 13.toUpperCase()
 * 14.equalsIgnoreCase()
 * @author Gaoch
 *
 */
public class TestString {
	public static void main(String[] args) {
		String s1 = new String("abcd");
		String s2 = new String("abcd");
		System.out.println(s1.charAt(2));//返回索引为2的字符  	返回c
		System.out.println(s2.equals(s2));//比较的是两个对象的值  返回true
		System.out.println(s1==s2);			//比较的是两个对象	返回false
		
		String s3 = "def";
		String s4 = "def";
		System.out.println(s3.equals(s4));//s3和s4都在栈中指向的都是方法区中的字符串常量 返回true
		System.out.println(s3==s4);		//返回true
		
		System.out.println(s3.indexOf('f'));//返回字符为y的value的下标 ，如果没有这个字符则返回-1，  返回2
		String s = s3.substring(1);//返回从某下标开始打印的字符串  		  
		System.out.println(s);	//								返回 e f
		
		String s5 = s3.replace('e','*');//将字符串中存在的字符用一个新字符代替，并返回一个新的字符串对象  返回d*f
		System.out.println(s5);
		
		String s6 = "aabb,ccdd,eeff";
		String[] strArray = s6.split(",");//按照某字符串进行分割，返回一个字符串数组   
		for(int i = 0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		
		String s7 = "  aa bb  ";
		String s8 = s7.trim();//将字符串开头和结尾的空格全部删除  如果没有返回原对象，如果有空格就返回一个新的字符串对象
		System.out.println(s8);
		
		System.out.println("Abc".equalsIgnoreCase("abc"));//忽略大小写的比较
		
		System.out.println("Abcbd".lastIndexOf("b"));//返回倒数第一个b的下标
		System.out.println("Abcbd".startsWith("Ab"));//是否以A b开头
		System.out.println("Abcbd".endsWith("bd"));//是否以b d结尾
		System.out.println("Abcbd".toLowerCase());//转换为小写
		System.out.println("Abcbd".toUpperCase());//转换为大写
		
		System.out.println("###############");
		String gh = "a";							//经过for一共创建了4个对象,方法区1+堆3
		String gh2 = new String("a");				//经过for一共创建了5个对象，方法区1+堆4
		for (int i = 0; i < 3; i++) {
			gh += 1;
		}
		System.out.println(gh);
		
		
	}
}
