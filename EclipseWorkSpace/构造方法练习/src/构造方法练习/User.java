

package 构造方法练习;

/**
 * @author Gaoch
 *this的练习
 */
public class User {
	String name;
	int age;
	int id;
	
	public User() {}
	public User(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public User(String name,int age,int id) {
				//this的写法1
				//this.name = name;
				//this.age = age;
				//this的写法2,注意这样写this一定要写在前面，另外this不能用于static方法中
		this(name,age);
		this.id = id;
	}
	
	public static void main(String[] args) {
		User user = new User("gaochuang",18);
		System.out.println(user.name + user.age);
		
		
		
	}
}
