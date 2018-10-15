package com.gao;

import java.util.Date;

/**
 * ��1970��1��1��Ϊһ����׼���Ժ��뼶����ʱ�䣬��long����
 * @author Gaoch
 *
 */
public class Test_Date {
	public static void main(String[] args) {
		Date d = new Date();    				//dΪ��ǰϵͳʱ��
		System.out.println(d.toGMTString());
		long t = System.currentTimeMillis();
		System.out.println(t);
		Date d2 = new Date(1000);
		System.out.println(d2.toGMTString());
		
		d2.setTime(24645654);						//����ʱ��
		System.out.println(d2.toGMTString());
		
		System.out.println(d2.getTime());			//��ȡʱ��
		System.out.println(d.getTime()<d2.getTime());//�Ƚ�ʱ��
	
	}
	
}
