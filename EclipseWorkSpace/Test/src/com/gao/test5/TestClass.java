package com.gao.test5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 *测试反射
 */
@SuppressWarnings("all")
public class TestClass {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = new Person().getClass();
		
		Constructor<?> constructor = clazz.getConstructor(String.class);
		Object instance = constructor.newInstance("郜创");
		System.out.println(instance);
		//操作静态方法
		 // 静态方法依附类 执行时不需要对象
		Method method = clazz.getMethod("delete", null);
		method.invoke( null);
		
		 // 操作非静态方法
        // 非静态方法依附于对象  必须指明对象才可以运行
		Method method2 = clazz.getMethod("add", null);
		method2.invoke(instance, null); //第一个参数应该是类的实例
		System.out.println(method2);
		
		
		
		//   // 操作非静态属性
		Field field = clazz.getDeclaredField("name");
		field.setAccessible(true);
		Object object = field.get(instance);
		System.out.println(object);
		//    // 操作静态属性
		Field field2 = clazz.getField("age");
		field2.set(null, 15);
		Object object2 = field2.get(null);
		System.out.println(object2);
		
		//暴力反射  改变String
		String str = "sss";
		Class clasz = String.class;
		Field field3 = clasz.getDeclaredField("value");
		field3.setAccessible(true);
		
		field3.set(str, new char[]{'d','d','d'});
		
		System.out.println(str);
	}
}
class Person{
	private String name;
	public static int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void show(int i){
		System.out.println("Person.show()"+i);
	}
	public int add(){
		return 5;
	}
	public static void delete(){
		System.out.println("Person.delete()");
	}
	
	
	
	
	
	
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public static int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public static void setAge(int age) {
		Person.age = age;
	}
	
}