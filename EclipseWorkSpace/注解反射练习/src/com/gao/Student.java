package com.gao;

@AnnoTable("namkjlak")
public class Student {
	
	
	@AnnoField(columnName="name",type="varchar",length=10)
	private String name;
	
	@AnnoField(columnName="id",type="int",length=10)
	private int id;
	
	@AnnoField(columnName="age",type="int",length=10)
	private int age;
	
	
	
	public Student(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void add() {
		System.out.println("+");
	}
}
