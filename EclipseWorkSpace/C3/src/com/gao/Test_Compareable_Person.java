package com.gao;

public class Test_Compareable_Person implements Comparable{
	private int age;
	private String name;
	private boolean sex;
	
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public Test_Compareable_Person(int age, String name, boolean sex) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	public Test_Compareable_Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
	@Override
	public int compareTo(Object o) {
		Test_Compareable_Person p = (Test_Compareable_Person)o;
		return (this.sex?0:1) - (p.sex?0:1);
	}
	
	
}
