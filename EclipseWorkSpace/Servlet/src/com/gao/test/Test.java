package com.gao.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.gao.dao.impl.UserDAOImpl;
import com.gao.entity.UserInfo;

public class Test {
	private static UserDAOImpl udi = new UserDAOImpl();
	public static void main(String[] args) {
		//insert();
		//update();
		//delete();
		//find();
	}
	
	public static void insert(){
		Random random = new Random();
		for (int i = 1; i <= 100; i++) {
			UserInfo info = new UserInfo();
			info.setUid(i);
			info.setUname(i+"代目");
			info.setUmoney(random.nextInt(100000)+0.00); //转化为double
			info.setUdate(new Date());
		
			try {
				udi.insert(info);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void update(){
		UserInfo info = new UserInfo();
		info.setUid(1);
		info.setUname("叶良辰");
		info.setUdate(new Date());
		info.setUmoney(3213.1);
		try {
			udi.update(info);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void delete(){
		UserInfo info = new UserInfo();
		info.setUid(2);
		try {
			udi.delete(info);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void find(){
		int totalCount = 0; //总条数
		int totalPage = 0;//总页数
		int pageSize = 10;//页码
		int pageIndex = 4;//页数
		try {
			totalCount = udi.findUserByPageListCount();
			totalPage = totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
			System.out.println(totalCount+" "+totalPage+" "+pageSize+" "+pageIndex);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			List<UserInfo> list = udi.findUserByPageList(0, 10);
			for (UserInfo userInfo : list) {
				System.out.println(userInfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
