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
 * Servlet implementation class AddUserAction
 */
@WebServlet("/AddUserAction")
public class AddUserAction extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserServiceImpl service = new UserServiceImpl();
		String uname = request.getParameter("uname");
		String dateStr = request.getParameter("udate");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date udate = format.parse(dateStr);
			double umoney = Double.parseDouble(request.getParameter("umoney"));
			UserInfo user = new UserInfo();
			user.setUname(uname);
			user.setUdate(udate);
			user.setUmoney(umoney);
			service.insert(user);
			response.sendRedirect("FindUserByPageList?pageIndex=1");
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
