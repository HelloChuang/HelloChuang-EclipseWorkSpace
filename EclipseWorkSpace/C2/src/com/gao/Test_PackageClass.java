package com.gao;

/**
 * @author Gaoch
 *Integer��װ����ϰ
 *
 */
public class Test_PackageClass {
	public static void main(String[] args) {
		Integer i = new Integer(1000);//�½�
		System.out.println(Integer.MAX_VALUE);//���ֵ
		System.out.println(Integer.toHexString(i));//ת��Ϊ16����
		
		Integer i2 = Integer.parseInt("234");//�����ַ���תI n t �ķ���
		Integer i3 = new Integer("333");
		System.out.println(i2.intValue());
		
		String str = 234+"";				//in tת�ַ�����ɧ����
		
		
		
	}
	
}
