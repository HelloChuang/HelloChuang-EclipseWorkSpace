package com.gao.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gao.entity.MyList;
import com.gao.entity.UserInfo;

@Controller
public class ServalAction {
	@RequestMapping("method1")
	public String method1(Integer uid,String uname){
		System.out.println(uid+uname);
		return "forward:/show.jsp";
	}
	@RequestMapping("method2")
	public String method1(UserInfo user){
		System.out.println(user);
		return "forward:/show.jsp";
	}
	@RequestMapping("method3")
	public String method3(MyList list){
		for (UserInfo user : list.getList()) {
			System.out.println(user);
		}
		return "forward:/show.jsp";
	}
	@RequestMapping("method4")
	public String method4(Date sdate){
		System.out.println(sdate);
		return "forward:/show.jsp";
	}
	//解决请求参数名与方法参数名不一致问题
	@RequestMapping("method5")
	public String method5(@RequestParam(value="sd") Date date){
		System.out.println(date);
		return "forward:/show.jsp";
	}
}
