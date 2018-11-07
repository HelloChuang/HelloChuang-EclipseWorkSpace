package com.gao.dao.impl;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.gao.dao.UserInfoDAO;
import com.gao.entity.UserInfo;
import com.gao.utils.JdbcUtil;

public class UserDAOImpl implements UserInfoDAO {

	@Override
	public int insert(UserInfo user) throws Exception {
		Connection conn = JdbcUtil.getConn();
		String sql = "insert into user_info(`uname`,`udate`,`umoney`)values(?,?,?)";
		QueryRunner qr = new QueryRunner();
		Object[] params = { user.getUname(), user.getUdate(), user.getUmoney() };
		int count = qr.update(conn, sql, params);
		JdbcUtil.closeConn(conn);
		return count;
	}

	@Override
	public int update(UserInfo user) throws Exception {
		Connection conn = JdbcUtil.getConn();
		String sql = "update user_info set `uname`=?,`udate`=?,`umoney`=? where `uid`=?";// 注意要传id
		QueryRunner qr = new QueryRunner();
		Object[] params = { user.getUname(), user.getUdate(), user.getUmoney(), user.getUid() };
		int count = qr.update(conn, sql, params);
		JdbcUtil.closeConn(conn);
		return count;
	}

	@Override
	public int delete(UserInfo user) throws Exception {
		Connection conn = JdbcUtil.getConn();
		String sql = "delete from user_info where `uid`=?";
		QueryRunner qr = new QueryRunner();
		int count = qr.update(conn, sql, user.getUid());
		JdbcUtil.closeConn(conn);
		return count;
	}

	@Override
	public UserInfo findUserByID(Integer id) throws Exception {
		Connection conn = JdbcUtil.getConn();
		String sql = "select * from user_info where `uid`=?";
		QueryRunner qr = new QueryRunner();
		UserInfo userInfo = qr.query(conn, sql, new BeanHandler<UserInfo>(UserInfo.class), id);
		JdbcUtil.closeConn(conn);
		return userInfo;
	}

	@Override
	public List<UserInfo> findUserByPageList(Integer start, Integer size) throws Exception {
		Connection conn = JdbcUtil.getConn();
		String sql = "select * from user_info limit ?,?";
		QueryRunner qr = new QueryRunner();
		Object[] params = { start, size };
		List<UserInfo> list = qr.query(conn, sql, new BeanListHandler<UserInfo>(UserInfo.class), params);
		JdbcUtil.closeConn(conn);
		return list;
	}

	@Override
	public int findUserByPageListCount() throws Exception {
		int totalCount = 0;
		Connection conn = JdbcUtil.getConn();
		String sql = "select count(*) from user_info";
		QueryRunner qr = new QueryRunner();
		Number number = qr.query(conn, sql, new ScalarHandler<Number>(1));
		totalCount = number.intValue();
		JdbcUtil.closeConn(conn);
		return totalCount;
	}

}
