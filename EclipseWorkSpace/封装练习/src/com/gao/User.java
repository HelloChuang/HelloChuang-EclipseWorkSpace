package com.gao;

/**
 * @author Gaoch
 *
 */
public class User {
	private String name;
	private int age;
	private int id;
	public static void main(String[] args) {
		GaoChuang gao = new GaoChuang();
	}
	public User() {
		System.out.println("this is father");
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(age<=1&&age>=130) {
			this.age = age;			
		}else {
			System.out.println("请输入正确的年龄！");
		}
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void Game() {
		System.out.println("play game");
	}
}

