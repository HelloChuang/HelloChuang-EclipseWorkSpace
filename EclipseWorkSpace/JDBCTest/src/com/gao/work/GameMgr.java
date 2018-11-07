package com.gao.work;

import java.util.Scanner;

/**
 *  JDK 8.0、Eclipse、MySQL5.5
 * 
 *1.创建表  略
 *2.创建实体类ApplyInfo，根据业务提供需要的构造方法和setter/getter方法。      

3．创建JdbcUtil类，添加连接池技术,实现数据库连接和关闭功能。

4．创建DAO接口ApplyInfoDao，定义学生报名，按班级查询，按比赛项目，取消报名的方法。

5．创建DAO实现类ApplyInfoDaoImpl，继承BaseDao类，实现ApplyInfoDao接口，使用JDBC完成相应数据库操作。

6．创建ApplyMgr类，完成在控制台的报名信息操作，启动和运行系统。


采用DAO模式开发此系统，需要定义如下类：

1．报名信息实体类（ApplyInfo）

1)编号(applyId)

2)姓名(name)

3)年龄(age)

4)班级(class)

5)比赛项目(game)

2．数据库连接和关闭类（BaseDao）

3．报名信息DAO接口（ApplyInfoDao）

4．报名信息DAO实现类（ApplyInfoDaoImpl）

5．测试类（GameMgr）用于实现整体流程
 */
public class GameMgr {
	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		menu();
	}
	
	//菜单
	public static void menu(){
		while(true){
			System.out.println("******欢迎使用运动会报名系统******");
			System.out.println("1.学生报名  2.按比赛项目查询   3.按班级查询  4.取消报名  5.退出系统");
			System.out.println("请选择(1-5):");
			
			int choosed = sc.nextInt();
			switch (choosed) {
			case 1:
				apply();
				
				break;
			case 2:
				queryByGame();
				break;
			case 3:
				queryByClass();
				break;
			case 4:
				cancleApply();
				break;
			case 5:
				System.out.println("\n\n\n"+"已退出系统!!");
				return;

			default:System.out.println("请输入正确的数字!!");
				break;
			}
		}
		
	}
	//取消报名
	public static void cancleApply(){
		System.out.println("请输入取消报名的学生姓名:");
		String name = sc.next();
		ApplyInfoDaoImpl aiai = new ApplyInfoDaoImpl();
		aiai.concelApply(name);
	}
	//按班级查找
	public static void queryByClass(){
		System.out.println("请选择班级(1.一班 2.二班  3.三班):");
		int i = sc.nextInt();
		String classs="";
		switch (i) {
		case 1:
			classs = "一班";
			break;
		case 2:
			classs = "二班";
			break;
		case 3:
			classs = "三班";
			break;

		default:System.out.println("请输入正确的数字!!");
			break;
		}
		ApplyInfoDaoImpl aiai = new ApplyInfoDaoImpl();
		aiai.selectByClass(classs);
	}
	//按运动项目查找
	public static void queryByGame(){
		System.out.println("请选择要查询的比赛项目:(1.跳远 2.接力跑  3.跳绳):");
		int i = sc.nextInt();
		String game = "";
		switch (i) {
		case 1:
			game = "跳远";
			break;
		case 2:
			game = "接力跑";
			break;
		case 3:
			game = "跳绳";
			break;

		default:System.out.println("请输入正确的数组");
			break;
		}
		ApplyInfoDaoImpl aiai = new ApplyInfoDaoImpl();
		aiai.selectByGame(game);
		
	}
	
	//报名
	public static void apply(){
		ApplyInfoDaoImpl aidi = new ApplyInfoDaoImpl();
		System.out.println("请输入姓名:");
		String name = sc.next();
		System.out.println("请输入年龄:");
		int age = sc.nextInt();
		System.out.println("请选择班级(1.一班 2.二班  3.三班):");
		int i = sc.nextInt();
		String classs="";
		switch (i) {
		case 1:
			classs = "一班";
			break;
		case 2:
			classs = "二班";
			break;
		case 3:
			classs = "三班";
			break;

		default:System.out.println("请输入正确的数字!!");
			break;
		}
		System.out.println("请选择报名项目(1.跳远  2.接力跑  3.跳绳):");
		int j = sc.nextInt();
		String game = "";
		switch (j) {
		case 1:
			game = "跳远";
			break;
		case 2:
			game = "接力跑";
			break;
		case 3:
			game = "跳绳";
			break;

		default:
			break;
		}
		aidi.apply(name, age, classs, game);
	}
	
}
