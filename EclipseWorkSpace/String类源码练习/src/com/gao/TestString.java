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
public class TestString {
	public static void main(String[] args) {
		String s1 = new String("abcd");
		String s2 = new String("abcd");
		System.out.println(s1.charAt(2));//��������Ϊ2���ַ�  	����c
		System.out.println(s2.equals(s2));//�Ƚϵ������������ֵ  ����true
		System.out.println(s1==s2);			//�Ƚϵ�����������	����false
		
		String s3 = "def";
		String s4 = "def";
		System.out.println(s3.equals(s4));//s3��s4����ջ��ָ��Ķ��Ƿ������е��ַ������� ����true
		System.out.println(s3==s4);		//����true
		
		System.out.println(s3.indexOf('f'));//�����ַ�Ϊy��value���±� �����û������ַ��򷵻�-1��  ����2
		String s = s3.substring(1);//���ش�ĳ�±꿪ʼ��ӡ���ַ���  		  
		System.out.println(s);	//								���� e f
		
		String s5 = s3.replace('e','*');//���ַ����д��ڵ��ַ���һ�����ַ����棬������һ���µ��ַ�������  ����d*f
		System.out.println(s5);
		
		String s6 = "aabb,ccdd,eeff";
		String[] strArray = s6.split(",");//����ĳ�ַ������зָ����һ���ַ�������   
		for(int i = 0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		
		String s7 = "  aa bb  ";
		String s8 = s7.trim();//���ַ�����ͷ�ͽ�β�Ŀո�ȫ��ɾ��  ���û�з���ԭ��������пո�ͷ���һ���µ��ַ�������
		System.out.println(s8);
		
		System.out.println("Abc".equalsIgnoreCase("abc"));//���Դ�Сд�ıȽ�
		
		System.out.println("Abcbd".lastIndexOf("b"));//���ص�����һ��b���±�
		System.out.println("Abcbd".startsWith("Ab"));//�Ƿ���A b��ͷ
		System.out.println("Abcbd".endsWith("bd"));//�Ƿ���b d��β
		System.out.println("Abcbd".toLowerCase());//ת��ΪСд
		System.out.println("Abcbd".toUpperCase());//ת��Ϊ��д
		
		System.out.println("###############");
		String gh = "a";							//����forһ��������4������,������1+��3
		String gh2 = new String("a");				//����forһ��������5�����󣬷�����1+��4
		for (int i = 0; i < 3; i++) {
			gh += 1;
		}
		System.out.println(gh);
		
		
	}
}
