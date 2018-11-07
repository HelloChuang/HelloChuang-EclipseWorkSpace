
<%@page import="org.apache.commons.dbutils.QueryRunner"%>
<%@page import="com.gao.jsp.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Connection conn = JdbcUtil.getConnection();
String sql = "delete from person where `name`=?";
QueryRunner qr = new QueryRunner();
int count = qr.update(conn, sql,request.getParameter("name"));
String msg = count>0?"删除成功":"删除失败";
out.print(msg);
JdbcUtil.closeAll(conn);
%>