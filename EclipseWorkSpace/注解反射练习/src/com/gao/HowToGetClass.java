package com.gao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
@SuppressWarnings("all")
public class HowToGetClass {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException {
		String path = "com.gao.Student";
		try {
			
			Class clazz = Class.forName(path); //���class�ļ��ַ���
			Class clazz2 = String.class;
			Class clazz3 = path.getClass();
			
			int[] arr= new int[10];
			int[][] arr2 = new int [10][]; 
			double[] arr3 = new double[10];
			System.out.println(arr.getClass().hashCode());//ά�Ȳ�ͬ ��õ�class��ͬ
			System.out.println(arr2.getClass().hashCode());
			System.out.println(arr3.getClass().hashCode());
			//���ֻ�����ֵķ���
			System.out.println("===========������ͨ�������ȡ������Է����͹�������Ϣ==========");
			System.out.println("====�������====");
			System.out.println(clazz.getName());   // 1.���ȫ��2.�������
			String className = clazz.getSimpleName();
			System.out.println(className);
			//���ֻ�����Եķ�ʽ
			System.out.println("====�������====");
			Field[] field = clazz.getFields();  //ֻ�ܻ�ù�������
			Field[] field2 = clazz.getDeclaredFields();//���ȫ������
			Field f = clazz.getDeclaredField("name");//���ָ��������
			for (Field f1 : field2) {
				System.out.println(f1);
			}
			//��÷���
			System.out.println("====��÷���====");
			Method[] method = clazz.getDeclaredMethods();
			Method[] method2 = clazz.getMethods();
			Method m = clazz.getDeclaredMethod("add",null);//�ڶ��������Ƿ����Ĳ������ͣ�û�о�Ϊnull��ԭ����Ϊ���ڷ������أ�ֻͨ����������ȡ�������Ͻ�
			Method m2 = clazz.getDeclaredMethod("setName",String.class);//�в��������
			for (Method method3 : method2) {
				System.out.println("����"+method3);
			}
			//��ù�����
			System.out.println("=====��ù�����=====");
			Constructor[] con = clazz.getDeclaredConstructors();
			Constructor[] c =  clazz.getConstructors();
			Constructor con2 = clazz.getConstructor(null);//����޲ι�����
			Constructor con3 = clazz.getConstructor(String.class,int.class,int.class);//����вι�����
			for (Constructor constructor : c) {
				System.out.println("��������   "+ constructor);
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
