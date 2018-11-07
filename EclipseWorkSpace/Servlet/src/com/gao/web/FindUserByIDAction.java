package com.gao.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gao.entity.UserInfo;
import com.gao.service.impl.UserServiceImpl;

@WebServlet("/FindUserByIDAction")
public class FindUserByIDAction extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserServiceImpl service = new UserServiceImpl();
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			UserInfo user = service.findUserByID(id);
			request.setAttribute("uid", user.getUid());
			request.setAttribute("uname", user.getUname());
			request.setAttribute("udate", user.getUdate());
			request.setAttribute("umoney", user.getUmoney());
			request.getRequestDispatcher("user_update.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}