package com.gao;

public class Test_StringBuilder {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder();//Ĭ��16���ֽڳ���
		StringBuilder s2 = new StringBuilder(32);//Ҳ�����Լ�����
		StringBuilder s3 = new StringBuilder("abcd");
		s3.append("efg");						//����ַ���
		s3.append(true).append(321).append("���");//�����������
		
		System.out.println(s3);
		
		StringBuilder gh2 = new StringBuilder("a");				//����forһ��������2�����󣬷�����1+��1
		for (int i = 0; i < 1000; i++) {	//value���鳤��һ��ʼ��17����������ô�࣬���ǲ����Ļ���
			gh2.append(i);					//�ᴴ��һ�������飬���������е����ݸ��Ƹ�����
		}									//����������յ��������鳤��*2+2���Դ�����
		System.out.println(gh2);			//����Ҳ����˻���
		System.out.println("####################33");
		StringBuilder s4 = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		s4.delete(3,5).delete(3, 5);	//ɾ���ַ�������������ɾ��
		System.out.println(s4);
		s4.reverse();					//��ת�ַ���
		System.out.println(s4);
		StringBuffer sb = new StringBuffer();//��StringBuilder��ͬ���ǣ�StringBuffer���̰߳�ȫ�ģ�����ΪҪ�ȴ�������Ч�ʵ�
	}
	
	
	
}
