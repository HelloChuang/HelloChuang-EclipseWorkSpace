package com.gao.service;

import java.util.List;

import com.gao.dao.UserDAO;
import com.gao.entity.UserInfo;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO;
	public void setUserDAO(UserDAO userDAO){
		this.userDAO=userDAO;
	}
	@Override
	public int insert(UserInfo user) throws Exception {
		return userDAO.insert(user);
	}

	@Override
	public int update(UserInfo user) throws Exception {
		return userDAO.update(user);
	}

	@Override
	public int delete(UserInfo user) throws Exception {
		return userDAO.delete(user);
	}

	@Override
	public int findUserCount() throws Exception {
		return userDAO.findUserCount();
	}

	@Override
	public List<UserInfo> findUserByPageList(Integer pageIndex, Integer pageSize) throws Exception {
		return userDAO.findUserByPageList((pageIndex-1)*pageSize, pageSize);
	}

	@Override
	public UserInfo findUserByID(Integer id) throws Exception {
		return userDAO.findUserByID(id);
	}

}
