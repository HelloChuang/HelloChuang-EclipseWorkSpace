package com.gao;



	import java.util.HashMap;
	import java.util.Scanner;
	import java.util.Set;

	public class HaiNiuAPP {
		private static Scanner sc = new Scanner(System.in);
		private static HashMap<String,String> users = new HashMap<>();
		public static void main(String[] args) {
			while (true) {
				show();
				System.out.println("请输入操作选项:");
				int choose = sc.nextInt();
				switch (choose) {
				case 1:regist();break;
				}
			}
		}

		// 注册账号
		private static void regist() {
			System.out.println("欢迎注册海牛APP,请输入用户名");
			String user = sc.next();
			if (checkUser(user)) {
				System.out.println("用户名已经存在");
			} else {
				System.out.println("请输入密码");
				String passwd = sc.next();
				System.out.println("请再次输入");
				String passwd2 = sc.next();
				if (passwd.equals(passwd2)) {
					users.put(user, passwd);
					System.out.println("恭喜！！注册成功");
				} else {
					System.out.println("两次密码不同");
				}
			}
		}

		// 遍历集合，查看用户是否存在
		private static boolean checkUser(String user) {
			Set<String> keys = users.keySet();
			for (String key : keys) {
				if (user.equals(key))
					return true;
			}
			return false;
		}

		// 功能首页
		public static void show() {
			System.out.println("=========欢迎来到海牛部落===========");
			System.out.println("1.注册账号");
			System.out.println("2.用户登录");
			System.out.println("3.修改密码");
			System.out.println("4.退出系统");
		}
	}


