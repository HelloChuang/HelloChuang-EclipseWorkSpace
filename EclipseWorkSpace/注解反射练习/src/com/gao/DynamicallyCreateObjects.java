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
			Student s = clazz.newInstance();  //��ʵ�ǵ�����Sudent���޲ι��췽��
			System.out.println(s);
			//�����вι���������̬��������
			Constructor<Student> c = clazz.getDeclaredConstructor(String.class,int.class,int.class);
			Student s2 = c.newInstance("۬��",15,18);//��̬ʵ��������
			System.out.println(s2.getName());
			//��̬�����࣬��̬��������
			s.getName();
			//�������仰��������һ�仰�������������Ƕ�̬�����ģ��ô����ṩ�˸���Ŀհ����û����
			//���Զ�̬�������ݿ��е����ݣ��ó���������
			Method m = clazz.getDeclaredMethod("setName", String.class);
			m.invoke(s, "۬����");											
			
			System.out.println(s.getName());
			//ͨ������API��������
			Field f = clazz.getDeclaredField("name");
			f.setAccessible(true);//���û����һ�䣬��������˽�����Ժͷ��������Ͽ��Բ�������ȫ��飬����ֱ�ӷ���
			f.set(s, "����");					//ͨ������ֱ��д����
			System.out.println(s.getName());
			System.out.println(f.get(s));	//��ȡֵ����һ�ַ�������ͨ�����䣡��������
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}
}
