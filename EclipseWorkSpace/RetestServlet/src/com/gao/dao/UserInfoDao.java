package com.gao.dao;

import java.util.List;

import com.gao.entity.UserInfo;

public interface UserInfoDao {
	public int insert(UserInfo user) throws Exception;
	public int delete(UserInfo user) throws Exception;
	public int update(UserInfo user) throws Exception;
	public List<UserInfo>findUserBypageList(Integer start,Integer size) throws Exception;
	public UserInfo findUserByID(Integer id) throws Exception;
	public int findUserCount() throws Exception;
}
