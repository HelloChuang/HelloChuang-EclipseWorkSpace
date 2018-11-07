package com.gao.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
	StuService service ;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// Date.class 时间类型 CustomDateEditor(创建自己时间的格式)
		// 时间转换类 是全局配置
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true)); // true:允许输入空值，false:不能为空值
	}
	
	
	
	@RequestMapping("/addStu")
	public ModelAndView addStu(Student s)throws Exception{
		ModelAndView mv = new ModelAndView();
		service.insert(s);
		mv.setViewName("redirect:/findStudentsByPage?pageIndex=1");
		return mv;
	}
	@RequestMapping("/updateStu")
	public ModelAndView updateStu(Student s)throws Exception{
		ModelAndView mv = new ModelAndView();
		Student stu = service.findStuByID(s.getSid());
		stu.setSname(s.getSname());
		stu.setSex(s.getSex());
		stu.setBirth(s.getBirth());
		service.update(stu);
		mv.setViewName("redirect:/findStudentsByPage?pageIndex=1");
		return mv;
	}

	
	@RequestMapping("/deleteStu")
	public ModelAndView deleteStu(Integer id)throws Exception{
		Student s = service.findStuByID(id);
		ModelAndView mv = new ModelAndView();
		//if(s!=null){
			int count = service.delete(s);
			System.out.println(count);
//			if(count>0){
//				mv.setViewName("redirect:/findStudentsByPage?pageIndex=1");
//			}else{
//				mv.addObject("msg", "删除时发生错误");
//				mv.setViewName("redirect:/error.jsp");
//			}
//			}else{
//				mv.addObject("msg", "没有您要删除的ID");
//				mv.setViewName("redirect:/error.jsp");
//			}
			
			mv.setViewName("redirect:/findStudentsByPage?pageIndex=1");
		return mv;
	}
}