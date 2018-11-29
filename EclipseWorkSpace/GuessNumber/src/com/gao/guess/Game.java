package com.gao.guess;

import java.util.Random;
import java.util.Scanner;

import com.gao.dao.impl.UserDAOImpl;
import com.gao.entity.UserInfo;

public class Game {
	static Scanner sc = new Scanner(System.in);
	static Random r = new Random();
	private UserDAOImpl dao = new UserDAOImpl();
	public static void main(String[] args) throws Exception {
		
		Game g  =new Game();
		g.menu();
	}

	public UserInfo login() throws Exception{
		UserInfo user = null;
		System.out.println("请输入您的昵称");
		String name = sc.next();
		user = dao.findUserByName(name);
		if(user!=null){
			System.out.println("您已注册!直接登录");
			
			return user;
		}else{
			user = new UserInfo();
			user.setUname(name);
			int count = dao.insert(user);
			if(count>0){
				System.out.println("添加了新的游戏账户");
				history(user);
			}else{
				System.out.println("添加游戏账户失败");
			}
		}
		
		return user;
	}
	public void menu() throws Exception{
		UserInfo user = login();
		while(true){
			System.out.println("*****欢迎进入猜大猜小游戏主界面*****");
			System.out.println("玩家昵称:"+user.getUname());
			System.out.println("1.玩游戏");
			System.out.println("2.历史数据信息");
			System.out.println("3.退出游戏");
			System.out.println("************************************");
			System.out.println("请输入您的操作:");
			int choosed = sc.nextInt();
			switch (choosed) {
			case 1:
				game(user);
				break;
			case 2:
				history(user);
				break;
			case 3:
				
				return;

			default:System.out.println("请输入正确的数字");
				 break;
			}
		}
		
	}
	
	public void ifWin(){
		
	}
	public void ifLose(){
		
	}
	//制定 规则  随机生成两张牌   猜大小,我猜大,假如玩家牌比系统牌大,赢
	public void game(UserInfo user){
	
		Integer winning_temp = 0;  //连胜
		Integer winning_top = 0;   //最高连胜
		
		
		String flag = "";
		
		
			
		do{
			
		
		System.out.println("***进入玩游戏界面***");
		System.out.println("玩家昵称:"+user.getUname());
		System.out.println("两张牌已经生成         【说明：随机生成1-9之间的数，当做系统出的牌】\n1 猜大\n2 猜小\n请玩家输入1-2之间的数：");
		//生成两个随机数 当做两张牌的点数
		int snu = r.nextInt(8)+1;
		int unu = r.nextInt(8)+1;
		//选择 1 or 2
		int choosed = sc.nextInt();
		System.out.println(choosed);
		String str = "";
		String res = "";
		if(choosed==1){
			str = "大";
			if(unu>snu){ //如果赢了
				res="赢";
				winning_temp++;
				winning_top = winning_temp>winning_top?winning_temp:winning_top;
				user.setWc(user.getWc()+1);  //总胜场数 +1
			}else{      //如果输了
				res="输";
				winning_temp = 0;
			}
		}else if(choosed==2){
			str = "小";
			if(unu<snu){  //如果赢了
				res="赢";
				winning_temp++;
				winning_top = winning_temp>winning_top?winning_temp:winning_top;
				user.setWc(user.getWc()+1);  //总胜场数 +1
			}else{      //如果输了
				res="输";
				winning_temp = 0;
			}
		}else{
			System.out.println("系统错误!请输入正确的数字!!");
			continue;
		}
		System.out.println("结果: 系统出 "+snu+"   玩家出: "+unu+"玩家猜  "+str+"玩家"+res);
		
		//记录游戏
		user.setTg(user.getTg()+1);   //不管是赢了还是输了   总对局都   +1
		
		user.setWr(((double)user.getWc() / (double)user.getTg()));  // 记录胜率  胜场/总胜场
		
		if(user.getWs()<winning_top){    //如果本场比赛的最高连胜场数比历史最高连胜还高  那么更新
			user.setWs(winning_top);
		}
		
		try {
			int count = dao.update(user);
			if(count>0){
				System.out.println("游戏信息更新成功");
				history(user);
			}else{
				System.out.println("游戏信息更新失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		//判断是否继续游戏
		while(true){
			System.out.println("是否继续玩（y/n）【说明：输入n，说明退出到主界面】:");
			flag = sc.next();
		
			if(flag.equals("n")||flag.equals("N")){
				return ;
			}else if(flag.equals("y")||flag.equals("Y")){
				break;
			}else{
				System.out.println("请输入正确的符号!");
			}
		}
		
		
		}while(flag.equals("y")||flag.equals("Y"));
		
		
	}
	public void history(UserInfo user){
		System.out.println("***查看玩家历史数据信息界面***");
		System.out.println("玩家昵称:"+user.getUname());
		System.out.println("总对局:"+user.getTg());
		System.out.println("胜率:"+user.getWr()*100.0+"%");
		System.out.println("最高连胜局:"+user.getWs());
	}
}
