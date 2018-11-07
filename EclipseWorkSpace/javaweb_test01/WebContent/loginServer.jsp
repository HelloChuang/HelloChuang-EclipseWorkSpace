<%@page import="org.apache.commons.dbutils.handlers.BeanHandler"%>
<%@page import="org.apache.commons.dbutils.handlers.BeanListHandler"%>
<%@page import="com.gao.jsp.Person"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.dbutils.QueryRunner"%>
<%@page import="com.gao.jsp.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<% 
		request.setCharacterEncoding("UTF-8");
		String user = request.getParameter("user");
		String pswd = request.getParameter("password");
		
		if(user.equals("admin")&&pswd.equals("admin")){
			
			Connection conn = JdbcUtil.getConnection();
			String sql = "select * from person ";
			QueryRunner qr = new QueryRunner();
			List<Person> list=(List<Person>)qr.query(conn, sql,new BeanListHandler(Person.class));
			request.setAttribute("persons", list);
			request.getRequestDispatcher("showList.jsp").forward(request, response);
			
			JdbcUtil.closeAll(conn);
		}else{
			
		}
		
	%>
