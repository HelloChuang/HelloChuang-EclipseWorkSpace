package com.gao.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

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
public class BookOperateAction {
	@Autowired
	private BookService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// Date.class 时间类型 CustomDateEditor(创建自己时间的格式)
		// 时间转换类 是全局配置
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true)); // true:允许输入空值，false:不能为空值
	}
	
	
	@RequestMapping("/delEduList")
    public ModelAndView delEduList(String str)throws Exception{
		
		 ModelAndView mv = new ModelAndView();
        
        String[] strarr = str.split(",");
        Integer[] ids = new Integer[strarr.length];
        for(int i=0;i<strarr.length;i++){
        	ids[i]=Integer.parseInt(strarr[i]);
        	}
    
        List<BookInfo> books = service.getByIds(ids);
        System.out.println(books);
        for(BookInfo book:books){
        	service.delete(book);
        }
        
        
        mv.setViewName("redirect:/findBooksByPage?pageIndex=1");
        return mv;
    }  
	
	
	
	
	
	
	
	@RequestMapping("/bookAdd")
	public ModelAndView bookAdd(BookInfo book)throws Exception{
		ModelAndView mv = new ModelAndView();
		int count = service.insert(book);
		if(count>0){
			mv.setViewName("redirect:/findBooksByPage?pageIndex=1");
		}else{
			mv.addObject("msg", "添加失败");
		}
		return mv;
		
	}
	@RequestMapping("/deleteBook")
	public ModelAndView deleteBook(Integer id)throws Exception{
		ModelAndView mv = new ModelAndView();
		BookInfo book = service.findBookByID(id);
		if(book!=null){
			int count = service.delete(book);
			if(count>0){
				mv.setViewName("redirect:/findBooksByPage?pageIndex=1");
			}else{
				mv.addObject("msg", "删除失败");
			}
		}
		
		return mv;
		
	}
	@RequestMapping("/bookUpdete")
	public ModelAndView bookUpdete(BookInfo book)throws Exception{
		ModelAndView mv = new ModelAndView();
		int count = service.update(book);
			if(count>0){
				mv.setViewName("redirect:/findBooksByPage?pageIndex=1");
			}else{
				mv.addObject("msg", "更新失败");
			}
		
		return mv;
		
	}
}
