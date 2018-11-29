package com.gao.service;

import java.util.List;
import java.util.Map;

import com.gao.entity.Area;
import com.gao.entity.School;
import com.gao.entity.Student;

public interface StuService {
	public List<Student>findStuByPageList(Integer pageIndex,Integer pageSize)throws Exception;
	public Integer findStuByPageListCount()throws Exception;
	public Student findStuByID(Integer id)throws Exception;
	
	public List<Area> findAllAreas() throws Exception;
	public List<School> findSchoolsByAid(Integer aid) throws Exception;
	public Map<String,Object> chart1()throws Exception;
	public List chart2()throws Exception;
	public List chart3()throws Exception;
	public List chart4()throws Exception;
	
	public int insert(Student stu)throws Exception;
	public int delete(Student stu)throws Exception;
	public int update(Student stu)throws Exception;
}
