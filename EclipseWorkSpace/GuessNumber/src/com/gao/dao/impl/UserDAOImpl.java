package com.gao.dao.impl;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.gao.dao.UserDAO;
import com.gao.entity.UserInfo;
import com.gao.utils.JdbcUtil;

public class UserDAOImpl implements UserDAO {
	
	@Override
	public int insert(UserInfo user) throws Exception {
		Connection conn = JdbcUtil.getConn();
		String sql = "insert into user_info values(null,?,?,?,?,null,?)";
		Object[] params = {user.getUname(),user.getTg(),user.getWr(),user.getWs(),user.getWc()};
		QueryRunner qr= new QueryRunner();
		int count = qr.update(conn, sql,params);
		JdbcUtil.closeConn(conn);
 		return count;
	}

	@Override
	public int update(UserInfo user) throws Exception {
		Connection conn = JdbcUtil.getConn();
		String sql = "update user_info set total_game=?,win_rate=?,winning_streak=?,win_count=? where uname = ?";
		Object[] params = {user.getTg(),user.getWr(),user.getWs(),user.getWc(),user.getUname()};
		QueryRunner qr= new QueryRunner();
		int count = qr.update(conn, sql,params);
		JdbcUtil.closeConn(conn);
 		return count;
	}

	

	@Override
	public List<UserInfo> findAllUsers() throws Exception {
		return null;
	}

	@Override
	public UserInfo findUserByName(String uname) throws Exception {
		Connection conn = JdbcUtil.getConn();
		QueryRunner qr= new QueryRunner();
		String sql = "select * from v1 where uname=?";
		Object [] params = {uname};
		UserInfo user = qr.query(conn, sql,new BeanHandler<UserInfo>(UserInfo.class),params);
		JdbcUtil.closeConn(conn);
		return user;
	}

}
