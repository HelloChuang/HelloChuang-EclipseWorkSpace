package com.gao.utils;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtil {
	private static final String CONN_DRIVE = "com.mysql.jdbc.Driver";
	private static final String CONN_URL = "jdbc:mysql://127.0.0.1:3306/userdb3?characterEncoding=UTF-8";
	private static final String CONN_USER = "root";
	private static final String CONN_PSWD = "root";
	
	private static ComboPooledDataSource dateSource;
	
	static{
		dateSource = new ComboPooledDataSource();
		try {
			dateSource.setDriverClass(CONN_DRIVE);
			dateSource.setJdbcUrl(CONN_URL);
			dateSource.setUser(CONN_USER);
			dateSource.setPassword(CONN_PSWD);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConn(){
		Connection conn = null;
		try {
			conn = dateSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void closeConn(Connection conn){
		if(null!=conn){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
