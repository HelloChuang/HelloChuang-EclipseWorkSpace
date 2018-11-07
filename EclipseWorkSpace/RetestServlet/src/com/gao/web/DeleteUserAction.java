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
 * Servlet implementation class DeleteUserAction
 */
@WebServlet("/DeleteUserAction")
public class DeleteUserAction extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserInfoServiceImpl service = new UserInfoServiceImpl();
		int id = Integer.parseInt(request.getParameter("id"));
		UserInfo user = null;
		try {
			user = service.findUserByID(id);
			if (null != user) {
				service.delete(user);
				request.getRequestDispatcher("FindUserByListAction").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
