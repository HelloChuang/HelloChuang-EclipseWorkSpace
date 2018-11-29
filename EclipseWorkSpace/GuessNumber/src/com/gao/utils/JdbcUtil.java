package com.gao.utils;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtil {
	private static String CONN_DRIVER = "com.mysql.jdbc.Driver";
	private static String CONN_URL = "jdbc:mysql://127.0.0.1:3306/guessdb?characterEncoding=UTF-8";
	private static String CONN_USER = "root";
	private static String CONN_PSWD = "root";
	
	private static ComboPooledDataSource dataSource;
	
	static {
		dataSource = new ComboPooledDataSource();
		try {
			dataSource.setDriverClass(CONN_DRIVER);
			dataSource.setJdbcUrl(CONN_URL);
			dataSource.setUser(CONN_USER);
			dataSource.setPassword(CONN_PSWD);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConn(){
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void closeConn(Connection conn){
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
