package com.gao;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleApp {
	static Scanner sc = new Scanner(System.in);
	static int userLogin;
	static int pswdLogin;
	static int [] user = new int[2];
	static int [] pswd = new int[2];
	static int count = 0;
	static boolean isLogin;
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
		if(count == user.length){
			Arrays.copyOf(user, count+(count>>1));
			Arrays.copyOf(pswd, count+(count>>1));
		}
		
		user[count] = sc.nextInt();
		
		System.out.println("请输入密码：");
		pswd[count] = sc.nextInt();
		count++;
		
		
	}
	public static void login(){
		System.out.println("欢迎来到登陆界面");
		System.out.println("请输入用户名：");
		userLogin = sc.nextInt();
		System.out.println("请输入密码：");
		pswdLogin = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			if(userLogin == user[i]&&pswdLogin==pswd[i]){
				System.out.println("登陆成功");
				isLogin = true;
			}else{
				System.out.println("登陆失败");
			}
		}
		
	}
	public static void resetPassword(){
		if(!isLogin){
			System.out.println("请登陆后再尝试修改密码");
			return;
		}
		System.out.println("欢迎来到改密界面");
		
		
		for (int i = 0; i < user.length; i++) {
			
			if(userLogin==user[i]){
				System.out.println("请输入新的密码");
				pswd[i] = sc.nextInt();
				System.out.println("重置密码成功");
				return;
			}else{
				System.out.println("重置密码失败，您是不合法的用户");
			}
		}
	
	
		
	}
}
