package com.gao.dao;

import java.util.List;

import com.gao.entity.Teacher;

public interface TeacherDAO {
	public List<Teacher> parseFileToList(String path)throws Exception;
	public boolean insertTeachers(List<Teacher> list)throws Exception;
}
