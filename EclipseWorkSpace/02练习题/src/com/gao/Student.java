package com.gao;

public class Student {
	private int age;
	private boolean sex;
	private String name;
	
	
	public Student(){
		
	}
	public Student(int age,boolean sex,String name){
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", sex=" + sex + ", name=" + name + "]";
	}
	
}
