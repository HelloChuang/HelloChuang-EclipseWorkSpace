package com.gao.dao;

import java.util.List;

import com.gao.entity.Student;

public interface StuDAO {
	public int insert(Student stu)throws Exception;
	public int update(Student stu)throws Exception;
	public int delete(Student stu)throws Exception;
	public int findStuByPageCount()throws Exception;
	public List<Student> findStuByPageList(Integer start,Integer size)throws Exception;
	public Student findStuByID(Integer id)throws Exception;
}