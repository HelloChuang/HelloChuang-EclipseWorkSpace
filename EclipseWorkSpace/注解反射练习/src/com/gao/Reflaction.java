package com.gao;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Reflaction {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		try {
			//��ȡ�������е�ע��
			Class clazz = Class.forName("com.gao.Student");
			Annotation[] anno = clazz.getAnnotations();
			for (Annotation a : anno) {
				System.out.println(a);
			}
			//�����ָ��ע���ֵ
			AnnoTable s = (AnnoTable)clazz.getAnnotation(AnnoTable.class);
			System.out.println(s.value());
			
			//�����ָ�����Ե�ע��
			Field f = clazz.getDeclaredField("name");
			AnnoField af = f.getAnnotation(AnnoField.class);
			System.out.println(af.columnName()+"--"+af.length()+"--"+af.type());
			
			//���ݻ�õı������ֶε���Ϣ��ƴ��DDL��䣬Ȼ��ʹ��JDBCִ�����SQL�������ݿ���������صı�
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
