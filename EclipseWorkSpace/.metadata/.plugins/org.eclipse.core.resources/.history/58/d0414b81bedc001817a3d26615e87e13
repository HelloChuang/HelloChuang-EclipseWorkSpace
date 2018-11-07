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
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserServiceImpl service = new UserServiceImpl();
		String uname = request.getParameter("uuname");
		String dateStr = request.getParameter("uudate");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date udate = format.parse(dateStr);
			int id = Integer.parseInt(request.getParameter("uuid"));
			UserInfo user = service.findUserByID(id);
			double umoney = Double.parseDouble(request.getParameter("uumoney"));
			if(null!=user){
				user.setUname(uname);
				user.setUdate(udate);
				user.setUmoney(umoney);
				service.update(user);
				response.sendRedirect("FindUserByPageList?pageIndex=1");
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
