package com.gao.dao.impl;

import java.util.List;

import com.gao.entity.UserInfo;

public interface UserInfoDAO {
	public int insert(UserInfo user) throws Exception;
	public int update(UserInfo user) throws Exception;
	public int delete(UserInfo user) throws Exception;
	public int findUserCount() throws Exception;
	public List<UserInfo> findUserByPageList(Integer start,Integer size)  throws Exception;
	public UserInfo findUserByID(Integer id) throws Exception;
}
