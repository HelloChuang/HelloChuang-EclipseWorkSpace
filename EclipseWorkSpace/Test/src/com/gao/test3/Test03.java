package com.gao.test3;

public class Test03 {
	public static void main(String[] args) {
		Book book = new Book("金瓶梅","兰陵笑笑生","北京邮电出版社",8);
		book.imformationIntroduce();
	}
}
class Book{
	private String name;
	private String auther;
	private String publishingHouse;
	private float price;
	
	public Book() {
		super();
		
	}

	public Book(String name, String auther, String publishingHouse, float price) {
		super();
		if(price<=10){
			System.out.println("您记录的价格无效，已设置为默认价格：10");
			price  = 10;
		}
		this.name = name;
		this.auther = auther;
		this.publishingHouse = publishingHouse;
		this.price = price;
	}
	public void imformationIntroduce(){
		System.out.println("书名："+this.name+"\n"+"作者："+this.auther+"\n"+"出版社："+this.publishingHouse+
				"\n价格："+this.price);
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
	 * @return the auther
	 */
	public String getAuther() {
		return auther;
	}

	/**
	 * @param auther the auther to set
	 */
	public void setAuther(String auther) {
		this.auther = auther;
	}

	/**
	 * @return the publishingHouse
	 */
	public String getPublishingHouse() {
		return publishingHouse;
	}

	/**
	 * @param publishingHouse the publishingHouse to set
	 */
	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	
}