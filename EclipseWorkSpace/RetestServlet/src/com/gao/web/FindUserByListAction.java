package com.gao.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gao.entity.UserInfo;
import com.gao.service.impl.UserInfoServiceImpl;


@WebServlet("/FindUserByListAction")
public class FindUserByListAction extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.doPost(request, response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserInfoServiceImpl service = new UserInfoServiceImpl();
		String page = request.getParameter("pageIndex");
		int pageIndex = 0;
		int totalCount;
		try {
			totalCount = service.findUserCount();
			int pageSize = 10;
			int totalPage = totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
			if(page!=null&&!"".equals(page)){
				pageIndex = Integer.parseInt(page);
			}
			if(pageIndex<1){
				pageIndex = 1;
			}
			if(pageIndex>totalPage){
				pageIndex = totalPage;
			}
			List<UserInfo> list = service.findUserBypageList(pageIndex, pageSize);
			
			request.setAttribute("pageIndex", pageIndex);
			request.setAttribute("pageSize", pageSize);
			request.setAttribute("totalCount", totalCount);
			request.setAttribute("totalPage", totalPage);
			request.setAttribute("list", list);
			
			request.getRequestDispatcher("showList.jsp").forward(request, response);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
