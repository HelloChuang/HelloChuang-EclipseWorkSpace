package com.gao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gao.dao.StuDAO;
import com.gao.entity.Student;
import com.gao.service.StuService;
@Service
@Scope("prototype")
public class StuServiceImpl implements StuService {
	@Autowired
	private StuDAO sd;
	
	public int insert(Student stu) throws Exception {
		return sd.insert(stu);
	}

	public int update(Student stu) throws Exception {
		return sd.update(stu);
	}

	public int delete(Student stu) throws Exception {
		return sd.delete(stu);
	}

	public int findStuByPageCount() throws Exception {
		return sd.findStuByPageCount();
	}

	public List<Student> findStuByPageList(Integer pageIndex, Integer pageSize) throws Exception {
		List<Student> list = null;
		if(pageIndex!=null&&pageSize!=null){
			if(pageIndex>0&&pageSize>0){
				list = sd.findStuByPageList((pageIndex-1)*pageSize, pageSize);
			}
		}
		return list;
	}

	public Student findStuByID(Integer id) throws Exception {
		return sd.findStuByID(id);
	}

}
