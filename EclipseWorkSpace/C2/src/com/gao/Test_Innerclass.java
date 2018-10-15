package com.gao;

public class Test_Innerclass {
	
	public static void main(String[] args) {
		Face.Nose n = new Face().new Nose();//ʵ�����Ǿ�̬�ڲ���
		
		Face.Ear e = new Face.Ear(); //ʵ������̬�ڲ���
		
		n.breath();
		e.listen();
	}
	
}
class Face{
	int size = 5;
	String type;
	
	class Nose{	//�Ǿ�̬�ڲ��ֻ࣬���ⲿ����ڲŴ���
		public void breath() {
			System.out.println("������");
		}
	}
	static class Ear{  //��̬�ڲ��࣬����ڣ��ⲿ�಻һ������
		public void listen() {
			System.out.println("����");
		}
	}
}