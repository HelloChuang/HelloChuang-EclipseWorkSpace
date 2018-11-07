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
Connection conn = JdbcUtil.getConnection();
String sql = "select * from person where `name` = ?";
QueryRunner qr = new QueryRunner();
Person p = qr.query(conn, sql,new BeanHandler<>(Person.class),request.getParameter("name") );

request.setAttribute("sname", p.getName());
request.setAttribute("sex", p.getSex());
request.setAttribute("age", p.getAge());
request.setAttribute("from", p.getFrom());

request.getRequestDispatcher("showUpdateStudent.jsp").forward(request, response);
JdbcUtil.closeAll(conn);
%>