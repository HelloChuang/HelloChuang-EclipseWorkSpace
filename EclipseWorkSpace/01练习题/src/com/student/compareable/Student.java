package com.student.compareable;

import java.util.Arrays;

public class Student implements Comparable {
	
public static void main(String[] args) {
	Student s1 = new Student(18,"c",true);
	Student s2 = new Student(25,"n",false);
	Student s3 = new Student(1,"s",true);
	Student s4= new Student(11,"a",false);
	Student s5 = new Student(8,"c",true);
	Student s6 = new Student(31,"f",false);
	Student s7 = new Student(25,"a",false);
	Student s8 = new Student(13,"d",true);
	Student s9 = new Student(15,"g",false);
	Student s10 = new Student(18,"c",true);
	
	Student [] ss = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
	Arrays.sort(ss);
	
	for (Student student : ss) {
		System.out.println(student.toString());
	}
}
	
	
	
	private int age;
	private String name;
	private boolean sex;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int age, String name, boolean sex) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student)return false;
		Student s = (Student)o;
		if(this.age==s.age&&this.sex==s.sex&&this.name.equals(s.name))return true;
				
		return false;
	}
	@Override
	public int compareTo(Object o) {
		if(!(o instanceof Student))return 0;
		
		Student s = (Student)o;
		
		//先比较年龄，再比较性别，再比较名字   true:man   false:woman
		int result = this.age - s.age;
		if(result==0){
			result = (this.sex ? 0:1) - (s.sex ? 0:1);
			if(result == 0){
				return (this.name.compareTo(s.name));
			}
		}
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
	
}
