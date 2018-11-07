package com.gao.service.impl;

import java.rmi.server.UID;
import java.util.List;

import com.gao.dao.impl.UserDAOImpl;
import com.gao.entity.UserInfo;
import com.gao.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDAOImpl udi = new UserDAOImpl();
	@Override
	public int insert(UserInfo user) throws Exception {
		return udi.insert(user);
	}

	@Override
	public int update(UserInfo user) throws Exception {
		return udi.update(user);
	}

	@Override
	public int delete(UserInfo user) throws Exception { // 为啥不再判断一下有没有此人,因为判断的操作在servlet中执行
		return udi.delete(user);
	}

	@Override
	public UserInfo findUserByID(Integer id) throws Exception {
		return udi.findUserByID(id);
	}

	@Override
	public List<UserInfo> findUserByPageList(Integer pageIndex,Integer pageSize) throws Exception {
		List<UserInfo> list = null;
		if(pageIndex!=null&&pageSize!=null){  //主要是判断输入是否合法
			if(pageIndex>0&&pageSize>0){
				list = udi.findUserByPageList((pageIndex-1)*pageSize, pageSize);
			}
		}
		return list;
	}

	@Override
	public int findUserByPageListCount() throws Exception {
		return udi.findUserByPageListCount();
	}

}
