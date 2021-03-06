package com.gao.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gao.entity.UserInfo;
import com.gao.service.impl.UserInfoServiceImpl;

/**
 * Servlet implementation class FindUserByID
 */
@WebServlet("/FindUserByID")
public class FindUserByID extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserInfoServiceImpl service = new UserInfoServiceImpl();
		int uid = Integer.parseInt(request.getParameter("id"));
		try {
			UserInfo user = service.findUserByID(uid);
			request.setAttribute("user", user);
			
			request.getRequestDispatcher("user_update.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
