package com.gao.test3;

import java.util.Scanner;

public class Test06_TestWork {
	
	public static void main(String[] args) {
		PizzaFactory pf = new PizzaFactory();
		pf.choose();
	}
}
class PizzaFactory{
	Scanner sc = new Scanner(System.in);
	public void choose(){
		System.out.println("请选择想要制作的披萨：（1.培根披萨	    2.海鲜披萨）：  ");
		int choosed = sc.nextInt();
		switch (choosed) {
		case 1:
			BaconPizza bp = new BaconPizza();
			makePizza(bp);
			break;
		case 2:
			SeaPizza sp = new SeaPizza();
			makePizza(sp);
			break;
		default:
			break;
		}
	}
	public void makePizza(Pizza p){
		p.show();
		}
}
abstract class Pizza{
	private String name;
	private int price;
	private int size;
	
	public abstract void show();

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
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	
}

class BaconPizza extends Pizza{
	
	public BaconPizza(){
		super.setName("培根披萨");
	}
	Scanner sc = new Scanner(System.in);
	@Override
	public void show() {
		System.out.println("请输入培根数：");
		int count = sc.nextInt();
		System.out.println("请输入披萨大小：");
		setSize(sc.nextInt());
		System.out.println("请输入披萨价格：");
		setPrice(sc.nextInt());
		System.out.println("名称："+getName()+"\n价格："+getPrice()+"\n大小："+getSize()+"\n培根克数："+count);
	}
	
}
class SeaPizza extends Pizza{

	public SeaPizza(){
		super.setName("海鲜披萨");
	}
	Scanner sc = new Scanner(System.in);
	@Override
	public void show() {
		System.out.println("请输入配料信息：");
		String information = sc.next();
		System.out.println("请输入披萨大小：");
		setSize(sc.nextInt());
		System.out.println("请输入披萨价格：");
		setPrice(sc.nextInt());
		System.out.println("名称："+getName()+"\n价格："+getPrice()+"\n大小："+getSize()+"\n配料："+information);
	}
	
}