package com.gao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.gao.dao.StuDAO;
import com.gao.entity.Area;
import com.gao.entity.School;
import com.gao.entity.Student;
import com.gao.service.StuService;
@Service
@Scope("prototype")
public class StuServiceImpl implements StuService {
	@Autowired
	private StuDAO st;
	
	public List<Student> findStuByPageList(Integer pageIndex, Integer pageSize) throws Exception {
		List<Student> list = null;
		if(pageIndex!=null&&pageSize!=null){
			if(pageIndex>0&&pageSize>0){
				list = st.findStuByPageList((pageIndex-1)*pageSize, pageSize);
			}
		}
		return list;
	}

	public Integer findStuByPageListCount() throws Exception {
		return st.findStuByPageListCount();
	}

	public Student findStuByID(Integer id) throws Exception {
		return st.findStuByID(id);
	}

	public List<Area> findAllAreas() throws Exception {
		return st.findAllAreas();
	}

	public List<School> findSchoolsByAid(Integer aid) throws Exception {
		return st.findSchoolsByAid(aid);
	}

	public int insert(Student stu) throws Exception {
		return st.insert(stu);
	}

	public int delete(Student stu) throws Exception {
		return st.delete(stu);
	}

	public int update(Student stu) throws Exception {
		return st.update(stu);
	}

}
