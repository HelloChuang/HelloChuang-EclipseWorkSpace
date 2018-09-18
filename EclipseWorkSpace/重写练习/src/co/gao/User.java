package co.gao;

 /**
 * @author Gaoch
 *“==”，方法名，形参列表形同
 *“<=”,返回值类型和声明异常类型，子类小于等于父类
 *“>=”,访问权限，子类大于等于父类
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
