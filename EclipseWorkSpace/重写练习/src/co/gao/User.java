package co.gao;

 /**
 * @author Gaoch
 *��==�������������β��б���ͬ
 *��<=��,����ֵ���ͺ������쳣���ͣ�����С�ڵ��ڸ���
 *��>=��,����Ȩ�ޣ�������ڵ��ڸ���
 */
public class User {
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
	public Person whoIsGao() {
		return new Person();
	}
}
class Gao extends User{
	void game() {
		System.out.println("Game2");
	}
	public Student whoIsGao() {
		return new Student();
	}
}
