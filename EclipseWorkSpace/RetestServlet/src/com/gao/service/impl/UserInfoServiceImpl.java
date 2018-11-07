package com.gao.service.impl;

import java.util.List;

import com.gao.dao.impl.UserInfoDAOImpl;
import com.gao.entity.UserInfo;
import com.gao.service.UserInfoService;

public class UserInfoServiceImpl implements UserInfoService {
	private UserInfoDAOImpl uidi =new UserInfoDAOImpl();
	@Override
	public int insert(UserInfo user) throws Exception {
		return uidi.insert(user);
	}

	@Override
	public int delete(UserInfo user) throws Exception {
		return uidi.delete(user);
	}

	@Override
	public int update(UserInfo user) throws Exception {
		return uidi.update(user);
	}

	@Override
	public List<UserInfo> findUserBypageList(Integer pageIndex, Integer pageSize) throws Exception {
		List<UserInfo> list = null;
		if(null!=pageIndex&&null!=pageSize){
			if(pageIndex>0&&pageSize>0){
				list = uidi.findUserBypageList((pageIndex-1)*pageSize, pageSize);
			}
		}
		return list;
	}

	@Override
	public UserInfo findUserByID(Integer id) throws Exception {
		return uidi.findUserByID(id);
	}

	@Override
	public int findUserCount() throws Exception {
		return uidi.findUserCount();
	}

}
