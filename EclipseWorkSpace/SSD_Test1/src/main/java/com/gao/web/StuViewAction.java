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
public class StuViewAction {
	@Autowired
	StuService service ;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// Date.class 时间类型 CustomDateEditor(创建自己时间的格式)
		// 时间转换类 是全局配置
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
		// true:允许输入空值，false:不能为空值
	}
	@RequestMapping("/findStuByID")
	public ModelAndView findStuByID(Integer id)throws Exception{
		ModelAndView mv = new ModelAndView();
		Student stu = service.findStuByID(id);
		mv.addObject("stu", stu);
		mv.setViewName("forward:/stu_update.jsp");
		return mv;
	}
	
	
	@RequestMapping("/findStudentsByPage")
	public ModelAndView findStudentsByPage(Integer pageIndex) throws Exception{
		ModelAndView mv = new ModelAndView();
		Integer pageSize = 10;
		Integer totalCount = 0;
		Integer totalPage = 0;
		totalCount = service.findStuByPageCount();
		totalPage = totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
		List<Student> list = service.findStuByPageList(pageIndex, pageSize );
		mv.addObject("list",list);
		mv.addObject("pageSize",pageSize);
		mv.addObject("totalCount",totalCount);
		mv.addObject("totalPage",totalPage);
		mv.addObject("pageIndex",pageIndex);
		mv.setViewName("forward:/showList.jsp");
		return mv;
	}
	
}
