package com.gao.work;

public class ApplyInfo {
	private int  applyId;
	private String name;
	private int age;
	private String classs;
	private String game;
	/**
	 * @return the applyId
	 */
	public int getApplyId() {
		return applyId;
	}
	/**
	 * @param applyId the applyId to set
	 */
	public void setApplyId(int applyId) {
		this.applyId = applyId;
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
	 * @return the classs
	 */
	public String getClasss() {
		return classs;
	}
	/**
	 * @param classs the classs to set
	 */
	public void setClasss(String classs) {
		this.classs = classs;
	}
	/**
	 * @return the game
	 */
	public String getGame() {
		return game;
	}
	/**
	 * @param game the game to set
	 */
	public void setGame(String game) {
		this.game = game;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return 	this.game+"\t"+this.name+"\t"+this.classs+"\t"+this.age;
	}
}
