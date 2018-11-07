package com.gao.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gao.entity.UserInfo;
import com.gao.service.UserService;

@Controller
@Scope("prototype")
public class UserViewAction {
	@Autowired
	private UserService service;
	@RequestMapping("/findStudentsByPage")
	public ModelAndView findStudentsByPage(Integer pageIndex)throws Exception{
		ModelAndView mv = new ModelAndView();
		int totalCount = service.findCount();
		int pageSize = 10;
		int totalPage = totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
		List<UserInfo> list = service.findUserByPageList(pageIndex, pageSize);
		mv.addObject("list", list);
		mv.addObject("totalCount", totalCount);
		mv.addObject("pageSize", pageSize);
		mv.addObject("totalPage", totalPage);
		mv.addObject("pageIndex", pageIndex);
		
		mv.setViewName("forward:/showList.jsp");
		
		return mv;
		
	}
	@RequestMapping("/findUserByID")
	public ModelAndView findUserByID(Integer id)throws Exception{
		ModelAndView mv = new ModelAndView();
		UserInfo user = service.findUserByID(id);
		mv.addObject("user", user);
		mv.setViewName("forward:/user_update.jsp");
		
		return mv;
		
	}
}