package com.gao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
@SuppressWarnings("all")
public class HowToGetClass {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException {
		String path = "com.gao.Student";
		try {
			
			Class clazz = Class.forName(path); //获得class的几种方法
			Class clazz2 = String.class;
			Class clazz3 = path.getClass();
			
			int[] arr= new int[10];
			int[][] arr2 = new int [10][]; 
			double[] arr3 = new double[10];
			System.out.println(arr.getClass().hashCode());//维度不同 获得的class不同
			System.out.println(arr2.getClass().hashCode());
			System.out.println(arr3.getClass().hashCode());
			//两种获得名字的方法
			System.out.println("===========下面是通过反射获取类的属性方法和构造器信息==========");
			System.out.println("====获得类名====");
			System.out.println(clazz.getName());   // 1.获得全名2.获得类名
			String className = clazz.getSimpleName();
			System.out.println(className);
			//三种获得属性的方式
			System.out.println("====获得属性====");
			Field[] field = clazz.getFields();  //只能获得公共属性
			Field[] field2 = clazz.getDeclaredFields();//获得全部属性
			Field f = clazz.getDeclaredField("name");//获得指定的属性
			for (Field f1 : field2) {
				System.out.println(f1);
			}
			//获得方法
			System.out.println("====获得方法====");
			Method[] method = clazz.getDeclaredMethods();
			Method[] method2 = clazz.getMethods();
			Method m = clazz.getDeclaredMethod("add",null);//第二个参数是方法的参数类型，没有就为null，原因：因为存在方法重载，只通过方法名获取方法不严谨
			Method m2 = clazz.getDeclaredMethod("setName",String.class);//有参数的情况
			for (Method method3 : method2) {
				System.out.println("方法"+method3);
			}
			//获得构造器
			System.out.println("=====获得构造器=====");
			Constructor[] con = clazz.getDeclaredConstructors();
			Constructor[] c =  clazz.getConstructors();
			Constructor con2 = clazz.getConstructor(null);//获得无参构造器
			Constructor con3 = clazz.getConstructor(String.class,int.class,int.class);//获得有参构造器
			for (Constructor constructor : c) {
				System.out.println("构造器：   "+ constructor);
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
