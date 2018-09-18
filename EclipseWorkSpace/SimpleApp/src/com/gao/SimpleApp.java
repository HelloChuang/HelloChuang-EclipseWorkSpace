package com.gao;

import java.util.Scanner;

public class SimpleApp {
	static Scanner sc = new Scanner(System.in);
	static int [] user = new int[2];
	static int [] pswd = new int[2];
	static int count;
	
	public static void main(String[] args) {
		while(true){
			printMenu();
			int x = sc.nextInt();
			switch(x){
			case 1 :regist();break;
			case 2 :login();break;
			case 3 :resetPassword();break;
			case 4 :return ;
			default : System.out.println("不合法的输入");
			}
		}
		
	}
	
	public static void printMenu(){
		System.out.println("=============================================");
		System.out.println("================主菜单===============");
		System.out.println("-----用户注册-----1");
		System.out.println("-----用户登陆-----2");
		System.out.println("-----修改密码-----3");
		System.out.println("-----退出--------4");
		
	}
	public static void regist(){
		System.out.println("欢迎来到注册界面");
		System.out.println("请输入用户名：");
		System.out.println("请输入密码：");
		
		
	}
	public static void login(){
		System.out.println("欢迎来到登陆界面");
	}
	public static void resetPassword(){
		System.out.println("欢迎来到改密界面");
	}
}
