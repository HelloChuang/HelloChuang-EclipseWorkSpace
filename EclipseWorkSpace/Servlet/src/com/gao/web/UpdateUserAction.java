package com.gao.web;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gao.entity.UserInfo;
import com.gao.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UpdateUserAction
 */
@WebServlet("/UpdateUserAction")
public class UpdateUserAction extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int uid = Integer.parseInt(request.getParameter("uuid"));
		UserServiceImpl service = new UserServiceImpl();
		String uname = request.getParameter("uuname");
		String udateStr = request.getParameter("uudate");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		Date udate = null;
		try {
			udate = format.parse(udateStr);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		UserInfo user = null;
		try {
			user = service.findUserByID(uid);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		if (user != null) {
			double umoney = Double.parseDouble(request.getParameter("uumoney"));

			user.setUname(uname);
			user.setUdate(udate);
			user.setUmoney(umoney);

			int count = 0;
			try {
				count = service.update(user);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (count > 0) {
				response.sendRedirect("FindUserByPageAction?pageIndex=1");
			} else {
				response.sendRedirect("error.jsp");
			}

		} else {
			response.sendRedirect("error.jsp");
		}

	}
}
