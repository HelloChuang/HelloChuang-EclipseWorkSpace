package com.gao.retest;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Test01 {
	public static void main(String[] args) throws Exception {
		//delete();
		//update();
		//query();
		paging();
	}
	@Test
	public void insert() throws Exception{
		Connection conn = JdbcUtil.getConnection();
		String sql = "insert into person(`name`,`sex`,`age`,`from`)values(?,?,?,?)";
		QueryRunner qr = new QueryRunner();
		Object[] params = {"成是非","男",24,"无锡"};
		int count = qr.update(conn,sql,params);
		String msg = count>0?"插入成功":"插入失败";
		System.out.println(msg);
		JdbcUtil.closeAll(null, null, conn);
	}
	
	@Test
	public static Person findPersonByID(int id) throws Exception{
		
		Person p = null;
		Connection conn = JdbcUtil.getConnection();
		String sql = "select * from person where id = ?";
		QueryRunner qr = new QueryRunner();
		Object params = id;
		p = qr.query(conn, sql,new BeanHandler<>(Person.class),params);
		
		JdbcUtil.closeAll(null, null, conn);
		return p;
	}
	
	@Test
	public static  void delete() throws Exception{
		System.out.println("请输入您要删除的ID:");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		Person p = findPersonByID(id);
		if(null!=p){
			Connection conn = JdbcUtil.getConnection();
			String sql = "delete from person where id=?";
			QueryRunner qr = new QueryRunner();
			Object params = id;
			int count = qr.update(conn,sql,params);
			String msg = count>0?"删除成功":"删除失败";
			System.out.println(msg);
			JdbcUtil.closeAll(null, null, conn);
		}else{
			System.out.println("不存在您要删除的ID");
		}
	}
	
	@Test
	public static void update() throws Exception{
		System.out.println("请输入您要更新的ID:");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		Person p = findPersonByID(id);
		if(null!=p){
			Connection conn = JdbcUtil.getConnection();
			String sql = "update person set `name` = ? ,age = ? where id = ?";
			QueryRunner qr = new QueryRunner();
			Object [] params = {"张无忌",21,id};
			int count = qr.update(conn,sql,params);
			String msg = count>0?"更新成功":"更新失败";
			System.out.println(msg);
			JdbcUtil.closeAll(null, null, conn);
		}else{
			System.out.println("不存在您要更新的ID");
		}
	}
	@Test
	public static void query() throws Exception{
		Connection conn = JdbcUtil.getConnection();
		String sql = "select  * from person ";
		QueryRunner qr = new QueryRunner();
		List<Person> list = qr.query(conn, sql,new BeanListHandler<>(Person.class));
		for (Person person : list) {
			System.out.println(person);
		}
		JdbcUtil.closeAll(null, null, conn);
	}
	@SuppressWarnings("rawtypes")
	@Test
	public static void paging() throws Exception{
		System.out.println("请输入您要展示第几页");
		Scanner sc = new Scanner(System.in);
		int page = sc.nextInt();
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/examdb?characterEncoding=UTF-8");
		dataSource.setUser("root");
		dataSource.setPassword("root");
		Connection conn = dataSource.getConnection();
		String sql = "select count(*) from student";
		QueryRunner qr = new QueryRunner();
		Number num = (Number)qr.query(conn, sql,new ScalarHandler<Object>(1));
		int totalCount = num.intValue();
		int pageSize = 10;
		int totalPage = totalCount%pageSize==0?totalCount/pageSize :totalCount/pageSize+1;
		sql = "select * from student limit ?,?";
		Object [] params = {(page-1)*pageSize,pageSize};
		List<Object[]> list = qr.query(conn, sql,new ArrayListHandler(),params);
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
		JdbcUtil.closeAll(null, null, conn);
	}
	
}
