package com.gao.service;

import java.util.List;

import com.gao.entity.UserInfo;

public interface UserService {
	public int insert(UserInfo user) throws Exception;

	public int update(UserInfo user) throws Exception;

	public int delete(UserInfo user) throws Exception;

	public UserInfo findUserByID(Integer id) throws Exception;

	public List<UserInfo> findUserByPageList(Integer pageIndex, Integer pageSize) throws Exception;

	public int findUserByPageListCount() throws Exception;
}
