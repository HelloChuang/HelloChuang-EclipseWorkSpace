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

import com.gao.entity.BookInfo;
import com.gao.service.BookService;

@Controller
@Scope("prototype")
public class BookViewAction {
	@Autowired
	private BookService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// Date.class 时间类型 CustomDateEditor(创建自己时间的格式)
		// 时间转换类 是全局配置
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true)); // true:允许输入空值，false:不能为空值
	}
	@RequestMapping("/findBooksByPage")
	public ModelAndView findBooksByPage(Integer pageIndex)throws Exception{
		ModelAndView mv = new ModelAndView();
		int totalCount = service.findCount();
		int pageSize = 10;
		int totalPage = totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
		List<BookInfo> list = service.findBookByPageList(pageIndex, pageSize);
		mv.addObject("list", list);
		mv.addObject("totalCount", totalCount);
		mv.addObject("pageSize", pageSize);
		mv.addObject("totalPage", totalPage);
		mv.addObject("pageIndex", pageIndex);
		
		mv.setViewName("forward:/showList.jsp");
		
		return mv;
		
	}
	@RequestMapping("/findBookByID")
	public ModelAndView findBookByID(Integer id)throws Exception{
		ModelAndView mv = new ModelAndView();
		BookInfo book = service.findBookByID(id);
		mv.addObject("book", book);
		mv.setViewName("forward:/book_update.jsp");
		
		return mv;
		
	}
}
