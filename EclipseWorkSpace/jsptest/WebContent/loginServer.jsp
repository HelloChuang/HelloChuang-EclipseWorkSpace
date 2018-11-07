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
String sql = "select * from person";
QueryRunner qr = new QueryRunner();
List<Person> p = (List<Person>)qr.query(conn, sql,new BeanListHandler<>(Person.class) );
request.setAttribute("persons", p);
request.getRequestDispatcher("showList.jsp").forward(request, response);
JdbcUtil.closeAll(conn);
%>