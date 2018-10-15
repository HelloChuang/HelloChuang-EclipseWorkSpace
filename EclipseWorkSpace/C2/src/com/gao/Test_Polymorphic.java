package com.gao;

public class Test_Polymorphic {
	public static void main(String[] args) {
		Dog d = new Dog();

		
		Test_Polymorphic a = new Dog();   	//�Զ�����ת��
									//�ô������Բ�����ʹ������̳л���д�ķ���
									//ʧ����ʧȥ������������Ա������������Ա�����Ĳ�����ʹ��
								
		Dog d2 = (Dog)a;      //ǿ������ת��
		

		
		//Animal c = new Cat(); //�������಻�ܻ���ת
		//Dog d3 = (Dog)c;
		
		LetAnimalCry(d);
		LetAnimalCry(a);
		LetAnimalCry(d2);
	//	LetAnimalCry(d3);
	}
	static void LetAnimalCry(Test_Polymorphic a) {  //��������ָ���������
		a.shut();
	}
	public void shut() {
		System.out.println("����һ��");
	}
	public final void cantbe() {  //final�ؼ���  ���ڷ����ϣ���������д�����Ա�����
									//�������ϣ��������̳�
	}								//���ڱ����ϣ��������޸ģ�һ�����˳�ֵ���Ͳ������ٱ���ֵ
}
class Dog extends Test_Polymorphic{
	public void shut() {
		System.out.println("����������");
	}
	public void LookDoor() {
		
	}
}
class Cat extends Test_Polymorphic{
	public void shut() {
		System.out.println("����������");
	}
}
