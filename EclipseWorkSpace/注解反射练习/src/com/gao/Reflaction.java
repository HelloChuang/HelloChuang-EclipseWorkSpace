package com.gao;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Reflaction {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		try {
			//获取该类所有的注解
			Class clazz = Class.forName("com.gao.Student");
			Annotation[] anno = clazz.getAnnotations();
			for (Annotation a : anno) {
				System.out.println(a);
			}
			//获得类指定注解的值
			AnnoTable s = (AnnoTable)clazz.getAnnotation(AnnoTable.class);
			System.out.println(s.value());
			
			//获得类指定属性的注解
			Field f = clazz.getDeclaredField("name");
			AnnoField af = f.getAnnotation(AnnoField.class);
			System.out.println(af.columnName()+"--"+af.length()+"--"+af.type());
			
			//根据获得的表名，字段的信息，拼出DDL语句，然后，使用JDBC执行这个SQL，在数据库中生成相关的表
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
