<%@page import="org.apache.commons.dbutils.QueryRunner"%>
<%@page import="com.gao.jsp.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

Connection conn = JdbcUtil.getConnection();
String sql = "insert into person(`name`,`sex`,`age`,`from`)values(?,?,?,?)";
String name = request.getParameter("name");
String sex = request.getParameter("sex");
String age = request.getParameter("age");
String from = request.getParameter("from");
Object [] params = {name,sex,age,from};
QueryRunner qr = new QueryRunner();
int count = qr.update(conn, sql,params);
JdbcUtil.closeAll(conn);
if(count>0){
	response.sendRedirect("showList.jsp");
}else{
	String msg = "<script type=`text/javascript`>history.go(-1);alert('添加失败!');</script>";
	response.setContentType("text/html; charset=UTF-8");
	out.print(msg);
}


%>