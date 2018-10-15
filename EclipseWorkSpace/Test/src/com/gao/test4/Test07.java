package com.gao.test4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test07 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream("f:\\ObjectData.txt"));
		Student s = new Student(18,"郜创");
		dos.writeObject(s);
		dos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f:\\ObjectData.txt"));
		Object ro = ois.readObject();
		if(ro instanceof Student){
			Student p = (Student)ro;
			System.out.println("name:"+p.getName()+"  age: "+p.getAge());
		}
	
	}
}
class Student implements Serializable{
	private static final long serialVersonUID = 123456;
	int age;
	String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
}