package com.gao.web;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gao.entity.UserInfo;
import com.gao.service.impl.UserInfoServiceImpl;

/**
 * Servlet implementation class UpdateUserAction
 */
@WebServlet("/UpdateUserAction")
public class UpdateUserAction extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserInfoServiceImpl service = new UserInfoServiceImpl();
		int id = Integer.parseInt(request.getParameter("uuid"));
		try {
			UserInfo user = service.findUserByID(id);
			String uname = request.getParameter("uuname");
			String udateStr = request.getParameter("uudate");
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date udate = format.parse(udateStr);
			double umoney = Double.parseDouble(request.getParameter("uumoney"));
			user.setUname(uname);
			user.setUdate(udate);
			user.setUmoney(umoney);
			service.update(user);
			request.getRequestDispatcher("FindUserByListAction").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
