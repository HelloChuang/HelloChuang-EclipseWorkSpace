package com.gao.service;

import java.util.List;

import com.gao.entity.UserInfo;

public interface UserInfoService {
	public int insert(UserInfo user) throws Exception;
	public int delete(UserInfo user) throws Exception;
	public int update(UserInfo user) throws Exception;
	public List<UserInfo>findUserBypageList(Integer pageIndex,Integer pageSize) throws Exception;
	public UserInfo findUserByID(Integer id) throws Exception;
	public int findUserCount() throws Exception;
}
