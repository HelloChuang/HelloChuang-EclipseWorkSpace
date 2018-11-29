package com.gao.dao;

import java.util.List;

import com.gao.entity.UserInfo;

public interface UserDAO {
	public int insert(UserInfo user)throws Exception;
	public int update(UserInfo user)throws Exception;
	
	public List<UserInfo> findAllUsers()throws Exception;
	public UserInfo findUserByName(String uname)throws Exception;
	
	
}
