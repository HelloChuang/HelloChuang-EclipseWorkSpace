package com.gao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gao.dao.impl.UserDAOImpl;
import com.gao.entity.UserInfo;
import com.gao.service.UserService;
@Repository
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAOImpl udi;
	
	@Override
	public int insert(UserInfo user) throws Exception {
		return udi.insert(user);
	}

	@Override
	public int update(UserInfo user) throws Exception {
		return udi.update(user);
	}

	@Override
	public int delete(UserInfo user) throws Exception {
		return udi.delete(user);
	}

	@Override
	public int findUserCount() throws Exception {
		return udi.findUserCount();
	}

	@Override
	public List<UserInfo> findUserByPageList(Integer pageIndex, Integer pageSize) throws Exception {
		List<UserInfo> list = null;
		if(pageIndex!=null&&pageSize!=null){
			if(pageIndex>0&&pageSize>0){
				list = udi.findUserByPageList((pageIndex-1)*pageSize, pageSize);
			}
		}
		return list;
	}

	@Override
	public UserInfo findUserByID(Integer id) throws Exception {
		return udi.findUserByID(id);
	}

	

}
