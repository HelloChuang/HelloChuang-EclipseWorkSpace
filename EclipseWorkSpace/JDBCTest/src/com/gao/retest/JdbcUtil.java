package com.gao.retest;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtil {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/jdbcdb?characterEncoding=UTF-8";
	private static final String USER = "root";
	private static final String PSWD = "root";
	
	private static ComboPooledDataSource dataSource = null;
	static{
		dataSource = new ComboPooledDataSource();
		
		try {
			dataSource.setDriverClass(DRIVER);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dataSource.setJdbcUrl(URL);
		dataSource.setUser(USER);
		dataSource.setPassword(PSWD);
		
	}
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn = dataSource.getConnection();  //这句话没记住  加强记忆
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void closeAll(ResultSet set,Statement stat,Connection conn){
		
			try {
				if(null!=set){
				set.close();
				}
				if(null!=stat){
					stat.close();
				}
				if(null!=conn){
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	
}
