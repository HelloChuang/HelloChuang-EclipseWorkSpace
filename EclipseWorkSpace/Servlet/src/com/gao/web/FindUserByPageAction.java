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
 * 处理分页展示操作 知识点:只留doGet和doPost两个方法,并将doGet也交给doPost处理 页面的边界判断与处理 找到页面并传出
 */
@WebServlet("/FindUserByPageAction")
public class FindUserByPageAction extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserServiceImpl service = new UserServiceImpl();
		int totalCount = 0;
		try {
			totalCount = service.findUserByPageListCount();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		int pageSize = 10;
		int pageIndex = 1;
		int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
		String pi = request.getParameter("pageIndex");
		if (null != pi && !"".equals(pi)) {
			pageIndex = Integer.parseInt(pi);
		}
		if (pageIndex < 1) {
			pageIndex = 1;
		}
		if (pageIndex > totalPage) {
			pageIndex = totalPage;
		}

		try {
			List<UserInfo> list = service.findUserByPageList(pageIndex, pageSize);
			request.setAttribute("list", list);
			request.setAttribute("totalCount", totalCount);
			request.setAttribute("pageSize", pageSize);
			request.setAttribute("pageIndex", pageIndex);
			request.setAttribute("totalPage", totalPage);
			request.getRequestDispatcher("showList.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
