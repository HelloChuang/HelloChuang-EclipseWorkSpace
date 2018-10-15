package com.gao;

/**
 * @author Gaoch
 *
 *
 */
public class Test_OverwriteEquals {
	
	Object oj;
	String str;
	public static void main(String[] args) {
		User user = new User("gaochuang",29,1000);
		User user2 = new User("gaochuang",28,1000);
		System.out.println(user==user2);
		System.out.println(user.equals(user2));
		
		String str1 = new String("ss");
		String str2 = new String("ss");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		
	}
}
class User{
	String name;
	int age;
	int id;
	public User(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
