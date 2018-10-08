package com.gao.test3;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Shop s = new Shop();
		s.choose();
		}
}
class Shop{
	Scanner sc = new Scanner(System.in);
	public void choose(){
		System.out.println("请选择饮料：(1.咖啡  2.矿泉水   3.可乐)");
		int choosed = sc.nextInt();
		switch (choosed) {
		case 1:
			Coffee c = new Coffee();
			c.show();
			break;
		case 2:
			Water w = new Water();
			w.show();
			break;
		case 3:
			Cola cola = new Cola();
			cola.show();
			break;

		default:System.out.println("请输入正确的内容");
			break;
		}
	}
}
abstract class Drink{
	private String name;
	private int capacity;
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
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
class Coffee extends Drink{
	Scanner sc = new Scanner(System.in);
	
	public Coffee(){
		super.setName("咖啡");
	}
	
	@Override
	public void show() {
		System.out.println("请输入购买容量：");
		setCapacity(sc.nextInt());
		System.out.println("请问是否要配料：（1.加糖     2.加奶   3.什么都不加）");
		int choosed = sc.nextInt();
		String dosing = "";
		switch (choosed) {
		case 1:
			dosing += "加糖";
			break;
		case 2:
			dosing += "加奶";
			break;
		case 3:
			dosing += "什么都不加";
			break;

		default: System.out.println("请输入正确的内容");
			break;
		}
		System.out.println("您购买饮料信息如下："+"\n名称："+getName()+"\n添加配料:"+dosing+"\n容量："+getCapacity());
	}
	
}
class Water extends Drink{

	@Override
	public void show() {
		System.out.println("给你的矿泉水！");
		
	}
	
}
class Cola extends Drink{
	public Cola(){
		super.setName("可乐");
		}
	Scanner sc = new Scanner(System.in);
	@Override
	public void show() {
		System.out.println("请输入购买容量：");
		setCapacity(sc.nextInt());
		System.out.println("您要买什么可乐：（1.可口可乐   2.百事可乐）");
		int choosed = sc.nextInt();
		
		String type = "";
		switch (choosed) {
		case 1:
			type+="可口可乐";
			break;
		case 2:
			type+="百事可乐";
			break;

		default:System.out.println("请输入正确的内容");
			break;
		}
		System.out.println();System.out.println("您购买饮料信息如下："+"\n名称："+getName()+"\n类型:"+type+"\n容量："+getCapacity());
	}
	
}