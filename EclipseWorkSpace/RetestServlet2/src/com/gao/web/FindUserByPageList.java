package com.gao.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gao.entity.UserInfo;
import com.gao.service.impl.UserServiceImpl;

/**
 * Servlet implementation class FindUserByPageList
 */
@WebServlet("/FindUserByPageList")
public class FindUserByPageList extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserServiceImpl service = new UserServiceImpl();
		int pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
		try {
			int totalCount = service.findUserCount();
			int pageSize = 10;
			int totalPage = totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
			List<UserInfo> list = service.findUserByPageList(pageIndex, pageSize);
			request.setAttribute("list", list);
			request.setAttribute("pageIndex", pageIndex);
			request.setAttribute("totalCount", totalCount);
			request.setAttribute("pageSize", pageSize);
			request.setAttribute("totalPage", totalPage);
			request.getRequestDispatcher("showList.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
