package com.gao.test3;

public class Test02 {
	public static void main(String[] args) {
		Woker w = new Woker("郜创",14,"大数据开发",3);
		w.work("阿里巴巴", "大数据研发工程师");
	}
}
class Woker{
	private String name;
	private int age;
	private String technicalDirection;
	private int workExperience;
	
	
	public Woker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Woker(String name, int age, String technicalDirection, int workExperience) {
		super();
		if(age<15){
			System.out.println("年龄信息无效！已修改为默认年龄15");
			age = 15;
		}
		this.name = name;
		this.age = age;
		this.technicalDirection = technicalDirection;
		this.workExperience = workExperience;
	}
	public void work(String company,String duty){
		System.out.println("姓名："+this.name+"\n"+"年龄："+this.age+
				"\n"+"技术方向："+this.technicalDirection+"\n"+"工作年限："+this.workExperience+"\n"+"目前就职于："+company+"\n"+
				"职务是:"+duty);
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
	 * @return the technicalDirection
	 */
	public String getTechnicalDirection() {
		return technicalDirection;
	}
	/**
	 * @param technicalDirection the technicalDirection to set
	 */
	public void setTechnicalDirection(String technicalDirection) {
		this.technicalDirection = technicalDirection;
	}
	/**
	 * @return the workExperience
	 */
	public int getWorkExperience() {
		return workExperience;
	}
	/**
	 * @param workExperience the workExperience to set
	 */
	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Woker [name=" + name + ", age=" + age + ", technicalDirection=" + technicalDirection
				+ ", workExperience=" + workExperience + "]";
	}
	
	
}
	