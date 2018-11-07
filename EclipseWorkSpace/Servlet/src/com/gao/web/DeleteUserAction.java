package com.gao.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gao.entity.UserInfo;
import com.gao.service.impl.UserServiceImpl;

/**
 * Servlet implementation class DeleteUserAction
 */
@WebServlet("/DeleteUserAction")
public class DeleteUserAction extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserServiceImpl service = new UserServiceImpl();
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			UserInfo user = service.findUserByID(id);
			if (null != user) {
				int count = service.delete(user);
				response.sendRedirect("FindUserByPageAction?pageIndex=1");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
