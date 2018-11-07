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

import com.gao.entity.UserInfo;
import com.gao.service.UserService;

@Controller
@Scope("prototype")
public class UserOperateAction {
	@Autowired
	private UserService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// Date.class 时间类型 CustomDateEditor(创建自己时间的格式)
		// 时间转换类 是全局配置
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true)); // true:允许输入空值，false:不能为空值
	}
	
	@RequestMapping("/userAdd")
	public ModelAndView userAdd(UserInfo user)throws Exception{
		ModelAndView mv = new ModelAndView();
		int count = service.insert(user);
		if(count>0){
			mv.setViewName("redirect:/findStudentsByPage?pageIndex=1");
		}else{
			mv.addObject("msg", "添加失败");
		}
		return mv;
		
	}
	@RequestMapping("/deleteStu")
	public ModelAndView deleteStu(Integer id)throws Exception{
		ModelAndView mv = new ModelAndView();
		UserInfo user = service.findUserByID(id);
		if(user!=null){
			int count = service.delete(user);
			if(count>0){
				mv.setViewName("redirect:/findStudentsByPage?pageIndex=1");
			}else{
				mv.addObject("msg", "删除失败");
			}
		}
		
		return mv;
		
	}
	@RequestMapping("/userUpdete")
	public ModelAndView userUpdete(UserInfo user)throws Exception{
		ModelAndView mv = new ModelAndView();
		int count = service.update(user);
			if(count>0){
				mv.setViewName("redirect:/findStudentsByPage?pageIndex=1");
			}else{
				mv.addObject("msg", "更新失败");
			}
		
		return mv;
		
	}
}
