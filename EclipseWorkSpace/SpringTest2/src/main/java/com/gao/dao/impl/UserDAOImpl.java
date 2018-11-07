package com.gao.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.gao.dao.UserDAO;
import com.gao.entity.UserInfo;

public class UserDAOImpl implements UserDAO {
	private QueryRunner qr;
	public void setQr(QueryRunner qr){
		this.qr = qr;
	}
	@Override
	public int insert(UserInfo user) throws Exception {
		String sql = "insert into user_info values(null,?,?,?)";
		Object [] params = {user.getUname(),user.getUdate(),user.getUmoney()};
		int count = qr.update(sql,params);
		return count;
	}

	@Override
	public int update(UserInfo user) throws Exception {
		String sql = "update user_info set `uname`=?,`udate`=?,`umoney`=? where `uid`=?";
		Object [] params = {user.getUname(),user.getUdate(),user.getUmoney(),user.getUid()};
		int count = qr.update(sql,params);
		return count;
	}

	@Override
	public int delete(UserInfo user) throws Exception {
		String sql = "delete from user_info where `uid`=?";
		Object [] params = {user.getUid()};
		int count = qr.update(sql,params);
		return count;
	}

	@Override
	public int findUserCount() throws Exception {
		String sql = "select count(*) from user_info";
		Number number = qr.query(sql, new ScalarHandler<Number>(1));
		int value = number.intValue();
		return value;
	}

	@Override
	public List<UserInfo> findUserByPageList(Integer start, Integer size) throws Exception {
		String sql = "select * from user_info limit ?,?";
		Object [] params = {start,size};
		 List<UserInfo> list = qr.query(sql, new BeanListHandler<UserInfo>(UserInfo.class),params);
		return list;
	}

	@Override
	public UserInfo findUserByID(Integer id) throws Exception {
		String sql = "select * from user_info where `uid`=?";
		UserInfo user = qr.query(sql, new BeanHandler<UserInfo>(UserInfo.class),id);
		return user;
	}
	/**   
	 * Title: toString   
	 * Description:   
	 * @return   
	 * @see java.lang.Object#toString()   
	 */  
	@Override
	public String toString() {
		return "UserDAOImpl [qr=" + qr + "]";
	}

}