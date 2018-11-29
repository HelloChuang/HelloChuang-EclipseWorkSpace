package com.gao.test;

import com.gao.dao.impl.UserDAOImpl;
import com.gao.entity.UserInfo;

public class Test1 {
	private static UserDAOImpl dao = new UserDAOImpl();
	public static void main(String[] args) throws Exception {
		UserInfo user = dao.findUserByName("郜创");
		System.out.println(user);
	}
	
	
	public void find() throws Exception{
		UserInfo user = dao.findUserByName("郜创");
		System.out.println(user);
	}
}
