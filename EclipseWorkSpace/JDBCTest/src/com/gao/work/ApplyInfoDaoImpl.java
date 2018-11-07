package com.gao.work;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class ApplyInfoDaoImpl extends JdbcUtil implements ApplyInfoDao{

	@Override//报名(插入表)
	public void apply(String name,int age,String classs,String game) {
		Connection conn = getConnection();
		String sql = "insert into apply_info(`name`,`age`,`classs`,`game`)values(?,?,?,?)";
		QueryRunner qr = new QueryRunner();
		Object [] params = {name,age,classs,game};
		try {
			int count = qr.update(conn, sql,params);
			String msg = count>0?"报名成功":"报名失败";
			System.out.println(msg);
			closeAll(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override//按班级查找
	public void selectByClass(String classs) {
		Connection conn = getConnection();
		String sql = "select * from apply_info where classs = ?";
		QueryRunner qr = new QueryRunner();
		Object param = classs;
		try {
			List<ApplyInfo> list = qr.query(conn, sql,new BeanListHandler<>(ApplyInfo.class),param);
			System.err.println("\n\n\n项目\t姓名\t班级\t年龄");
			for (ApplyInfo applyInfo : list) {
				System.out.println(applyInfo);
			}
			closeAll(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override//按比赛项目查找
	public void selectByGame(String game) {
		Connection conn = getConnection();
		String sql = "select * from apply_info where game = ?";
		QueryRunner qr = new QueryRunner();
		Object param = game;
		try {
			List<ApplyInfo> list = qr.query(conn, sql,new BeanListHandler<>(ApplyInfo.class),param);
			System.err.println("\n\n\n项目\t姓名\t班级\t年龄");
			for (ApplyInfo applyInfo : list) {
				System.out.println(applyInfo);
			}
			closeAll(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override//取消报名(删除表中的项)
	public void concelApply(String name) {
		ApplyInfo info = findPersonByName(name);  //首先判断表中有没有此人
		if(null!=info){
			Connection conn = getConnection();
			String sql = "delete from apply_info where `name`= ?";
			Object param = name;
			QueryRunner qr = new QueryRunner();
			try {
				int count = qr.update(conn,sql,param);
				String msg = count>0?"取消报名成功":"取消报名失败";
				System.out.println("\n\n\n"+msg);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else{
			System.out.println("查无此人!");
		}
		
		
	}//找到此人  并返回对象
	public ApplyInfo findPersonByName(String name){
		Connection conn = getConnection();
		ApplyInfo info = null;
		String sql = "select * from apply_info where `name` = ?";
		QueryRunner qr = new QueryRunner();
		Object param = name;
		try {
			info = qr.query(conn, sql,new BeanHandler<>(ApplyInfo.class),param);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return info;
		}
}
