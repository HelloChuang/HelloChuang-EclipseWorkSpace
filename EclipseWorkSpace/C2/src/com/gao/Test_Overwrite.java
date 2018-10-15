package com.gao;

 /**
 * @author Gaoch
 *��==�������������β��б���ͬ
 *��<=��,����ֵ���ͺ������쳣���ͣ�����С�ڵ��ڸ���
 *��>=��,����Ȩ�ޣ�������ڵ��ڸ���
 */
public class Test_Overwrite {
	public static void main(String[] args) {
		Gao g = new Gao();
		g.game();
	}
	String name;
	int id;
	
	void game() {
		System.out.println("Game");
	}
	void study() {
		System.out.println("Study");
	}
	public Test_OverwritePerson whoIsGao() {
		return new Test_OverwritePerson();
	}
}
class Gao extends Test_Overwrite{
	void game() {
		System.out.println("Game2");
	}
	public Student whoIsGao() {
		return new Student();
	}
}
