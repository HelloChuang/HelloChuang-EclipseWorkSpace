package com.gao.web;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.gao.entity.Student;
import com.gao.service.StuService;

@Controller
@Scope("prototype")
public class StuOperateAction {
	@Autowired
	private StuService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// Date.class 时间类型 CustomDateEditor(创建自己时间的格式)
		// 时间转换类 是全局配置
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true)); // true:允许输入空值，false:不能为空值
	}
	
	
	@RequestMapping("/stuAdd")
	public ModelAndView stuAdd(Student stu)throws Exception{
		ModelAndView mv = new ModelAndView();
		int count = service.insert(stu);
		if(count>0){
			mv.setViewName("redirect:/findStudentsByPage?pageIndex=1");
		}else{
			mv.addObject("msg", "添加错误");
			mv.setViewName("redirect:/error.jsp");
		}
		
		return mv;
	}
	@RequestMapping("/stuUpdate")
	public ModelAndView stuUpdate(Student stu)throws Exception{
		System.out.println(stu);
		ModelAndView mv = new ModelAndView();
		int count = service.update(stu);
		if(count>0){
			mv.setViewName("redirect:/findStudentsByPage?pageIndex=1");
		}else{
			mv.addObject("msg", "更新错误");
			mv.setViewName("redirect:/error.jsp");
		}
		
		return mv;
	}
	
	@RequestMapping("/deleteStu")
	public ModelAndView deleteStu(Integer id)throws Exception{
		ModelAndView mv = new ModelAndView();
		Student stu = service.findStuByID(id);
		if(stu!=null){
			int count = service.delete(stu);
			if(count>0){
				mv.setViewName("redirect:/findStudentsByPage?pageIndex=1");
			}else{
				mv.addObject("msg", "添加错误");
				mv.setViewName("redirect:/error.jsp");
			}
			
		}
	
		return mv; 
	}
}
