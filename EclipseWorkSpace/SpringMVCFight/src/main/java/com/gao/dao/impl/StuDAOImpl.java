package com.gao.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.gao.dao.StuDAO;
import com.gao.entity.Area;
import com.gao.entity.School;
import com.gao.entity.Score;
import com.gao.entity.Student;
@Repository
@Scope("prototype")
public class StuDAOImpl implements StuDAO {
	@Autowired
	private QueryRunner qr;
	
	public List<Student> findStuByPageList(Integer start, Integer size) throws Exception {
		String sql = "select * from v1 limit ?,?";
		Object [] params = {start,size};
		List<Student> students = qr.query(sql, new BeanListHandler<Student>(Student.class),params);
		
		for (Student student : students) {
			sql = "SELECT su.su_name suname,r.r_score score FROM result r INNER JOIN `subject` su on su.su_id = r.su_id WHERE r.s_id = ?";
			Object [] params2 = {student.getSid()};
			List<Score> scores = qr.query(sql, new BeanListHandler<Score>(Score.class),params2);
			for (Score score : scores) {
				student.getScores().put(score.getSuname(), score.getScore());
			}
		}
		
		return students;
	}

	public Integer findStuByPageListCount() throws Exception {
		String sql = "select count(*) from v1";
		Number number = qr.query(sql, new ScalarHandler<Number>(1));
		int value = number.intValue();
		return value;
	}

	public Student findStuByID(Integer id) throws Exception {
		String sql = "select * from v1 where sid = ?";
		Object[] params = {id};
		Student s = qr.query(sql, new BeanHandler<Student>(Student.class),params);
		
		sql = "select su.su_name suname,r.r_score score from result r inner join `subject` su on r.su_id = su.su_id where r.s_id = ?";
		List<Score> sc = qr.query(sql, new BeanListHandler<Score>(Score.class),s.getSid());
		for (Score ss : sc) {
			s.getScores().put(ss.getSuname(), ss.getScore());
		}
		
		return s;
	}
	

	public int insert(Student stu) throws Exception {
		System.out.println(stu);
		String sql = "insert into student values(null,?,?,?,?,?)";
		Object[] params = {stu.getSname(),stu.getSex(),stu.getBirthday(),stu.getExamnum(),stu.getScid()};
		qr.update(sql,params);
		
		sql="SELECT * FROM student ORDER BY s_id desc LIMIT 0,1";
		Number id = qr.query(sql, new ScalarHandler<Number>(1));
		sql = "insert into result values (null,1,?,?),(null,2,?,?),(null,3,?,?),(null,4,?,?)";
		Object[] params2 = {id,stu.getScores().get("语文"),id,stu.getScores().get("数学"),id,stu.getScores().get("英语"),id,stu.getScores().get("综合")};
		int count = qr.update(sql,params2);
		return count;
	}

	public int delete(Student stu) throws Exception {
		String sql = "delete from student where `s_id`=?";
		Object[] params = {stu.getSid()};
		int count = qr.update(sql,params);
		return count;
	}

	public int update(Student stu) throws Exception {
		String sql = "update student set s_name=?,s_sex=?,s_birthday=?,s_examnum=?,sc_id=? where s_id=?";
		Object [] params = {stu.getSname(),stu.getSex(),stu.getBirthday(),stu.getExamnum(),stu.getScid(),stu.getSid()};
		int count = qr.update(sql,params);
		
		sql="update result set r_score=? where s_id=? and su_id=?";
		Object[] params2 = {stu.getScores().get("语文"),stu.getSid(),1};
		count= qr.update(sql,params2);
		Object[] params3 = {stu.getScores().get("数学"),stu.getSid(),2};
		count=qr.update(sql,params3);
		Object[] params4 = {stu.getScores().get("英语"),stu.getSid(),3};
		count=qr.update(sql,params4);
		Object[] params5 = {stu.getScores().get("综合"),stu.getSid(),4};
		count = qr.update(sql,params5);
		return count;
	}

	public List<Area> findAllAreas() throws Exception {
		String sql = "select a_id aid,a_name aname from area";
		List<Area> areas = qr.query(sql, new BeanListHandler<Area>(Area.class));
		return areas;
	}

	public List<School> findSchoolsByAid(Integer aid) throws Exception {
		String sql = "select sc_id scid,sc_name scname from school where a_id = ?";
		Object[] params = {aid};
		List<School> schools = qr.query(sql, new BeanListHandler<School>(School.class),params);
		return schools;
	}

	public Map<String, Object> chart1() throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		String sql = "select * from v3";
		map = qr.query(sql, new MapHandler());
		return map;
	}

	
	public List chart2() throws Exception {
		List list = new ArrayList<>();
		String sql = "select * from v4";
		List<String> l1 = qr.query(sql, new ColumnListHandler<String>(1));				
		List<Long> l2 = qr.query(sql, new ColumnListHandler<Long>(2));	
		list.add(l1);
		list.add(l2);
		return list;
	}
	@Override
	public List chart3() throws Exception {
		List list = new ArrayList<>();
		String sql = "select * from v5";
		List<String> l1 = qr.query(sql, new ColumnListHandler<String>(1));	
		List<Long> l2 = qr.query(sql, new ColumnListHandler<Long>(2));	
		List<Long> l3 = qr.query(sql, new ColumnListHandler<Long>(3));	
		List<Long> l4 = qr.query(sql, new ColumnListHandler<Long>(4));	
		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		
		return list;
	}
	@Override
	public List chart4() throws Exception {
		List list = new ArrayList<>();
		String sql = "select f,s,t,o from v3";
		Object[] objects = qr.query(sql, new ArrayHandler());
		for (Object o : objects) {
			list.add(o);
		}
		

		return list;
	}
}
