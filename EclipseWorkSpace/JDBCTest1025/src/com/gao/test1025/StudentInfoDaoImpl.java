package com.gao.test1025;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.junit.Test;





@SuppressWarnings("all")
public class StudentInfoDaoImpl extends JdbcUtil implements StudentInfoDao{
	
	public static void main(String[] args) throws Exception {
		StudentInfoDaoImpl sid = new StudentInfoDaoImpl();
		//sid.initTable(); //初始化学生表/班级表
		//sid.insertStu(); //插入一条学生数据
		//sid.updateStu();	//更改学生数据
		//sid.deleteStuUnrecoverable();	//完全删除
		//sid.deleteSturestorability();   //可恢复删除
		//sid.queryStudentOrderByMoney(); //TODO  
		//sid.groupByClass();	//按班级存储
		//sid.queryStudentById();	//按学生ID查找
		//sid.queryStudentByName();	//按学生姓名查找
		//sid.queryStudentByMoney();	//按学费范围查找
		sid.queryStudentByDate();
	}
	static HashMap<String,Student> deletedMap = new HashMap<String,Student>();
	static HashMap<String,List<Student>> studentMap = new HashMap<String,List<Student>>();
	
	
	
	
	
	
	public void groupByClass() throws Exception{
		Connection conn = JdbcUtil.getConnection();
		//s.s_sname,s.s_intodate,s.s_money,g.g_name
		String sql = "SELECT * FROM student s INNER JOIN grade g ON s.g_id=g.g_id WHERE g.g_name = ? limit 0,5";//问号周围不加单双引号
		QueryRunner qr = new QueryRunner();
		String sql2 = "select g_name from grade";
		List<String> gnames = (List<String>)qr.query(conn, sql2,new ColumnListHandler());
	
		for (String gname : gnames) {
			List<Student> students = qr.query(conn, sql,new BeanListHandler<>(Student.class),gname);
			studentMap.put(gname, students);
		}
		Set<Entry<String,List<Student>>> set = studentMap.entrySet();
		Iterator<Entry<String, List<Student>>> it = set.iterator();
		while(it.hasNext()){
			Entry<String, List<Student>> next = it.next();
			System.out.println(next.getKey());
			List<Student> list = next.getValue();
			for (Student student : list) {
				System.out.println(student);
			}
			
		}
	}
	
	
	
	
	
	public void queryStudentById() throws Exception{
		Connection conn = JdbcUtil.getConnection();
		String sql = "select * from student where s_id=1";
		QueryRunner qr = new QueryRunner();
		Student student = qr.query(conn, sql,new BeanHandler<>(Student.class));
		System.out.println(student);
	}
	public void queryStudentByName() throws Exception{
		Connection conn = JdbcUtil.getConnection();
		String sql = "select * from student where s_name = '82代目'";
		QueryRunner qr = new QueryRunner();
		Student student = qr.query(conn, sql,new BeanHandler<>(Student.class));
		System.out.println(student);
	}
	public void queryStudentByMoney() throws Exception{
		Connection conn = JdbcUtil.getConnection();
		String sql = "select * from student where s_money>25000 and s_money<28000";
		QueryRunner qr = new QueryRunner();
		List<Student> query = qr.query(conn, sql,new BeanListHandler<>(Student.class));
		for (Student student : query) {
			System.out.println(student);
		}
	}
	public void queryStudentByDate() throws Exception{
		Connection conn = JdbcUtil.getConnection();
		String sql = "select * from student where s_intodate>? and s_intodate< ?";
		QueryRunner qr = new QueryRunner();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date1 = sdf.parse("2018-11-10 19:40:00");
		Date date2 = sdf.parse("2018-11-12 19:40:00");

		Object [] params = {date1,date2};
		List<Student> list = qr.query(conn, sql,new BeanListHandler<>(Student.class),params);
		for (Student student : list) {
			System.out.println(student);
		}
		
	}
	
	
	
	
	/**
	 * 
	 */
	public void queryStudentOrderByMoney(){
		Connection conn = JdbcUtil.getConnection();
		String sql = "SELECT * FROM grade g INNER JOIN student s ON s.g_id=g.g_id ORDER BY s_money DESC limit 0,10";
		QueryRunner qr = new QueryRunner();
		try {
			List<Student> list = qr.query(conn, sql,new BeanListHandler<>(Student.class));
			for (Student student : list) {
				System.out.println(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	//初始化
	@Override
	@Test
	public void initTable() throws Exception{
		Connection conn = JdbcUtil.getConnection();
		String sql = "insert into grade(`g_name`)values(?)";
		QueryRunner qr = new QueryRunner();
		//初始化班级表
		for (int i = 1; i <= 10; i++) {
				try {
					qr.update(conn,sql,i+"班");
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		System.out.println("初始化班级表成功");
		String sql2 = "insert into student(`s_name`,`s_intodate`,`s_money`,`g_id`)values(?,?,?,?)";
		String sql3 = "select g_id from grade";
		List<Integer> gids = (List<Integer>)qr.query(conn, sql3,new ColumnListHandler());
		//初始化学生表
		Random r = new Random();
		for (Integer gid : gids) {
			for (int j = 1; j <= 100; j++) {
				int money = (int)(Math.random()*20000+10001);//学费随机产生
				Object [] params = {gid+""+j+"代目",new Date(System.currentTimeMillis()+j*1000*60*60*24),r.nextInt(20000)+10000,gid};
				try {
					qr.update(conn,sql2,params);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("初始化学生表成功");
	}
	//插入学生
	@Override
	public void insertStu() {
		Connection conn = JdbcUtil.getConnection();
		String sql = "insert into student(`s_name`,`s_intodate`,`s_money`,`g_id`)values(?,?,?,?)";
		QueryRunner qr = new QueryRunner();
		Object [] params = {"郜创",new Date(System.currentTimeMillis()),25555,10};
		try {
			qr.update(conn,sql,params);
			System.out.println("插入成功!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//更新学生
	@Override
	public void updateStu() {
		Connection conn = JdbcUtil.getConnection();
		String sql = "update student set `s_name`=? where `s_id`= ?";
		QueryRunner qr = new QueryRunner();
		Object [] params = {"叶孤城",1};
		try {
			qr.update(conn,sql,params);
			System.out.println("更新成功!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//删除数据 不可恢复
	@Override
	public void deleteStuUnrecoverable() {
		System.out.println("请输入您的名字,将删除,不可索回");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Student s = findStudentByName(name);
		if(null!=s){
			Connection conn = JdbcUtil.getConnection();
			String sql ="delete from student where s_name=?";
			QueryRunner qr = new QueryRunner();
			try {
				qr.update(conn,sql,name);
				System.out.println("已永久删除!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			 closeAll(conn);
		}else{
			System.out.println("不好意思,您要删除的姓名不存在!");
		}
	}
	//删除数据 可恢复
	@Override
	public void deleteSturestorability() {
		Connection conn = JdbcUtil.getConnection();
		QueryRunner qr = new QueryRunner();
		System.out.println("请输入您的名字,将删除,可回滚");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Student s = findStudentByName(name);
		if(null!=s){
			deletedMap.put(name, s);
			
			String sql ="delete from student where s_name=?";
			
			try {
				qr.update(conn,sql,name);
				System.out.println("删除成功!您可以随时恢复");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}else{
			System.out.println("不好意思,您要删除的姓名不存在!");
		}
		System.out.println("请问现在要恢复吗? (1.恢复 2.不恢复)");
		int i = sc.nextInt();
		switch (i) {
		case 1:
			System.out.println("请输入您要恢复的姓名:");
			String next = sc.next();
			Student student = deletedMap.get(next);
			String sql2 = "insert into student(`s_name`,`s_intodate`,`s_money`,`g_id`)values(?,?,?,?)";
			Object [] params = {student.getS_name(),student.getS_intodate(),student.getS_money(),student.getG_id()};
			
			try {
				System.out.println(student);
				qr.update(conn,sql2,params);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			System.out.println("退出,您仍可随时恢复!");
			return;
			

		default:System.out.println("请输入正确的数字!!");
			break;
		}
		
		 closeAll(conn);
	}
	public Student findStudentByName(String name){
		Student s = null;
	    Connection conn = JdbcUtil.getConnection();
	    String sql = "select * from student where s_name=?";
	    QueryRunner qr = new QueryRunner();
	    try {
			s = qr.query(conn, sql,new BeanHandler<>(Student.class),name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    closeAll(conn);
		return s;
		
	}
	
}
