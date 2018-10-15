package com.gao.test3;



public class Test04 {
	public static void main(String[] args) {
		Person actor = new Actor("郜创",18,true,"zzu","《呵呵》");
		Person athlete = new Athlete("郜创",18,true,"跳远","6.27米");
		
		show(actor);
		show(athlete);
	}
	public static void show(Person p){
		p.introduceSelf();
	}
}

abstract class Person {
	private String name;
	private int age;
	private boolean sex;

	public abstract void introduceSelf();

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
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
	 * @return the sex
	 */
	public boolean isSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
}

class Actor extends Person {
	private String graduateInstitutions;
	private String magnumOpus;

	public Actor() {
		super();
	}

	public Actor(String name, int age, boolean sex, String graduateInstitutions, String magnumOpus) {
		super(name, age, sex);
		this.graduateInstitutions = graduateInstitutions;
		this.magnumOpus = magnumOpus;

	}

	@Override
	public void introduceSelf() {
		System.out.println("大家好，我是"+getName()+"\n今年"+getAge()+"\n我毕业于："+
				this.graduateInstitutions+"\n代表作有："+this.magnumOpus);
	}

}
class Athlete extends Person{
	private String event;
	private String grade;
	public Athlete() {
		super();
	}
	
	public Athlete(String name, int age, boolean sex,String event, String grade) {
		super(name, age, sex);
		this.event = event;
		this.grade = grade;
	}

	@Override
	public void introduceSelf() {
		System.out.println("大家好，我是"+getName()+"\n今年"+getAge()+"\n我擅长的运动项目是："+
				this.event+"\n最好成绩是："+this.grade);
	}
		
	}
	
