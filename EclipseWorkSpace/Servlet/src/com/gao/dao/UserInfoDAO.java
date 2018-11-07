package com.gao.dao;

import java.util.List;

import com.gao.entity.UserInfo;

public interface UserInfoDAO {
	//每次都是这六个方法
	public int insert(UserInfo user) throws Exception;
	public int update(UserInfo user) throws Exception;
	public int delete(UserInfo user) throws Exception;
	public UserInfo findUserByID(Integer id) throws Exception;
	public List<UserInfo> findUserByPageList(Integer start,Integer size) throws Exception;
	public int findUserByPageListCount() throws Exception;
}
