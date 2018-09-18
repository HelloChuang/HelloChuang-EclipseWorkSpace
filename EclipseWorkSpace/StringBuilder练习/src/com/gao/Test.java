package com.gao;

public class Test {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder();//默认16个字节长度
		StringBuilder s2 = new StringBuilder(32);//也可以自己设置
		StringBuilder s3 = new StringBuilder("abcd");
		s3.append("efg");						//添加字符串
		s3.append(true).append(321).append("随便");//可以连续添加
		
		System.out.println(s3);
		
		StringBuilder gh2 = new StringBuilder("a");				//经过for一共创建了2个对象，方法区1+堆1
		for (int i = 0; i < 1000; i++) {	//value数组长度一开始是17，塞不了这么多，于是不够的话，
			gh2.append(i);					//会创建一个新数组，将老数组中的内容复制给它，
		}									//将老数组回收掉，新数组长度*2+2，以此类推
		System.out.println(gh2);			//容器也是如此机制
		System.out.println("####################33");
		StringBuilder s4 = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		s4.delete(3,5).delete(3, 5);	//删除字符串，可以连续删除
		System.out.println(s4);
		s4.reverse();					//反转字符串
		System.out.println(s4);
		StringBuffer sb = new StringBuffer();//与StringBuilder不同的是，StringBuffer是线程安全的，但因为要等待，于是效率低
	}
	
	
	
}
