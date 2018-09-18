package com.gao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DynamicallyCreateObjects {
	public static void main(String[] args) throws InstantiationException, 
	IllegalAccessException, NoSuchMethodException, SecurityException, 
	IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		String path = "com.gao.Student";
		try {
			
			Class<Student> clazz =(Class<Student>) Class.forName(path);
			Student s = clazz.newInstance();  //其实是调用了Sudent的无参构造方法
			System.out.println(s);
			//调用有参构造器来动态创建对象
			Constructor<Student> c = clazz.getDeclaredConstructor(String.class,int.class,int.class);
			Student s2 = c.newInstance("郜创",15,18);//动态实例化对象
			System.out.println(s2.getName());
			//动态调的类，静态创建方法
			s.getName();
			//下面两句话等于上面一句话，不过这两句是动态创建的，好处：提供了更多的空白让用户填补，
			//可以动态调用数据库中的内容，让程序更加灵活
			Method m = clazz.getDeclaredMethod("setName", String.class);
			m.invoke(s, "郜创新");											
			
			System.out.println(s.getName());
			//通过反射API操作属性
			Field f = clazz.getDeclaredField("name");
			f.setAccessible(true);//如果没有这一句，操作不了私有属性和方法，加上可以不用做安全检查，可以直接访问
			f.set(s, "创哥");					//通过反射直接写属性
			System.out.println(s.getName());
			System.out.println(f.get(s));	//获取值的另一种方法！！通过反射！！！！！
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}
}
