package com.gao.test2;

/**
 * String-StringBuffer-StringBuilder 方法练习
 * @author XX
 *
 */
public class Test_String_StringBuffer {
	public static void main(String[] args) {
		testString();
		testStringBuffer();
		//测试String的intern方法
		char[] c = {'a','b','c'};
		String ss = new String(c);
		String sss = ss.intern();
		System.out.println(ss=="abc");
		System.out.println(sss=="abc");
		
		
		
	}
	
	public static void testString(){
		//几种构造方法
		String string = new String();
		String string2 = new String("abc");
		String string3 = new String(new char[]{'a','b','c'});
		/**string4
		 * 分配一个新的 String，它包含取自字符数组参数一个子数组的字符。
		 * offset 参数是子数组第一个字符的索引，count 参数指定子数组的长度。
		 * 该子数组的内容已被复制；后续对字符数组的修改不会影响新创建的字符串。      
		 */
		String string4 = new String(new char[]{'a','b','c'},1,2);   //bc
		
		String s1 = "abcdef";
		String s2 = "cdef";
		//几种常用方法
		s1.length();
		s1.equals(s2);
		s1.compareTo(s2);
		s1.compareToIgnoreCase(s1);
		s1.charAt(3);//输入索引，返回指定字符
		s1.concat(s2);//s1+s2
		s1.contains(s2);
		
		
		char [] c = new char[]{'a','b','c','d'};
		String s5 = "";
		String s6 = "";
		s5 = s5.copyValueOf(c);			//返回abcd
		s6 = s6.copyValueOf(c,1,2);   //返回bc
		
		s1.endsWith("f");
		s1.startsWith("a");
		s1.indexOf(99,0);    //输入字符，返回所在索引
		s1.indexOf('c',0);
		s1.lastIndexOf('c');
		s1.substring(0, 2);   //返回索引从0-2的字符串
		s1.toCharArray();
		s1.toLowerCase();
		s1.toUpperCase();
		s1.trim();
		
		
	}
	public static void testStringBuffer(){
		//构造器
		StringBuffer sb1 = new StringBuffer();    //默认开辟16个字节长度的空间
		StringBuffer sb2 = new StringBuffer(10);   //开辟指定的空间
		StringBuffer sb3 = new StringBuffer("abcdef");
		
		//方法
		sb1.append(true);
		System.out.println(sb1.hashCode());
		sb1.append("abc");
		System.out.println(sb1.hashCode());
		
		sb1.capacity();   //返回当前容量，并不是当前字符数组长度
		sb2.ensureCapacity(50);//如果要频繁的添加元素 , 可以考虑提前扩容 ， 来增加运行的效率
		sb1.delete(0, 1);
		sb1.trimToSize();//把没有被赋值的数组空闲区域给去除
		sb1.setCharAt(3, 'z');  //把索引位置为3的字符替换为给定字符
		sb1.reverse();			//反转字符串  并返回新的
		sb1.insert(0, "我是插进来的");
		System.out.println(sb1);
		
		
	}
	public static void testStringBuilder(){}
}
