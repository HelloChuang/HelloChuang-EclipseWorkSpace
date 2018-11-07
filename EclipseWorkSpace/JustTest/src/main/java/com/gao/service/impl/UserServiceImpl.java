package com.gao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.gao.dao.UserDAO;
import com.gao.entity.UserInfo;
import com.gao.service.UserService;
@Service
@Scope("prototype")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO ud;

	public int insert(UserInfo user) throws Exception {
		return ud.insert(user);
	}

	public int update(UserInfo user) throws Exception {
		return ud.update(user);
	}

	public int delete(UserInfo user) throws Exception {
		return ud.delete(user);
	}

	public int findCount() throws Exception {
		return ud.findCount();
	}

	public UserInfo findUserByID(Integer id) throws Exception {
		return ud.findUserByID(id);
	}

	public List<UserInfo> findUserByPageList(Integer pageIndex, Integer pageSize) throws Exception {
		List<UserInfo> list = null;
		if(pageIndex!=null&&pageSize!=null){
			if(pageIndex>0&&pageIndex>0){
				list = ud.findUserByPageList((pageIndex-1)*pageSize, pageSize);
			}
		}
		return list;
	}

}
