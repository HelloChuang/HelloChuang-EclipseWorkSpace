package com.gao.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gao.entity.Area;
import com.gao.entity.School;
import com.gao.entity.Student;
import com.gao.service.StuService;

@Controller
@Scope("prototype")
public class StuViewAction {
	@Autowired
	private StuService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// Date.class 时间类型 CustomDateEditor(创建自己时间的格式)
		// 时间转换类 是全局配置
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true)); // true:允许输入空值，false:不能为空值
	}
	@RequestMapping("/findUserByID")
	public ModelAndView findUserByID(Integer id)throws Exception{
		ModelAndView mv = new ModelAndView();
		Student s = service.findStuByID(id);
		List<Area> a = service.findAllAreas();
		List<School> sc = service.findSchoolsByAid(s.getAid());
		mv.addObject("s",s);
		mv.addObject("a",a);
		mv.addObject("sc",sc);
		mv.setViewName("forward:/stu_update.jsp");
		return mv;
	}
	
	@RequestMapping("/findStudentsByPage")
	public ModelAndView findStudentsByPage(
			@RequestParam(value="pageIndex",required=false,defaultValue="1") Integer pageIndex)throws Exception{
		ModelAndView mv = new ModelAndView();
		int totalCount = service.findStuByPageListCount();
		int pageSize = 10;
		int totalPage = totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
		List<Student> list = service.findStuByPageList(pageIndex, pageSize);
		mv.addObject("list", list);
		mv.addObject("totalCount", totalCount);
		mv.addObject("totalPage", totalPage);
		mv.addObject("pageSize", pageSize);
		mv.addObject("pageIndex", pageIndex);
		mv.setViewName("forward:/showList.jsp");
				
		return mv;
	}
	@RequestMapping("/findAllAreas")
	public @ResponseBody List<Area> findAllAreas()throws Exception{
		return service.findAllAreas();
	}
	@RequestMapping("/findSchoolsByAid")
	public @ResponseBody List<School> findSchoolsByAid(Integer aid)throws Exception{
		return service.findSchoolsByAid(aid);
	}
	@RequestMapping("/studentTongJiIndex")
	public ModelAndView studentTongJiIndex()throws Exception{
		ModelAndView mv = new ModelAndView();
		Map<String, Object> maps = service.chart1();
		mv.addObject("maps", maps);
		mv.setViewName("forward:/stu_chart.jsp");
		return mv;
	}
	@RequestMapping("/stuChart1")
	public @ResponseBody List stuChart1()throws Exception{
		List list = service.chart2();
		System.out.println(list);
		return list;
	}
	@RequestMapping("/stuChart2")
	public @ResponseBody List stuChart2()throws Exception{
		List list = service.chart3();
		System.out.println(list);
		return list;
	}
	@RequestMapping("/stuChart3")
	public @ResponseBody List stuChart3()throws Exception{
		List list = service.chart4();
		System.out.println(list);
		return list;
	}

		
	
}
