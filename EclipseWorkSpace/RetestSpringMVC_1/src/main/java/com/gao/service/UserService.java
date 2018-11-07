package com.gao.service;

import java.util.List;

import com.gao.entity.UserInfo;

public interface UserService {
	public int insert(UserInfo user)throws Exception;
	public int update(UserInfo user)throws Exception;
	public int delete(UserInfo user)throws Exception;
	public int findUserPageCount()throws Exception;
	public List<UserInfo> findUserPageList(Integer pageIndex,Integer pageSize)throws Exception;
	public UserInfo findUserByID(Integer id)throws Exception;
}
