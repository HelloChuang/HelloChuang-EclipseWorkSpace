<%@page import="org.apache.commons.dbutils.handlers.BeanHandler"%>
<%@page import="org.apache.commons.dbutils.handlers.BeanListHandler"%>
<%@page import="com.gao.jsp.Person"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.dbutils.QueryRunner"%>
<%@page import="com.gao.jsp.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>55555</title>
</head>
<body>
<% 
			request.setCharacterEncoding("UTF-8");
		
		
			String sql = "select * from person where id =1";
			Connection conn = JdbcUtil.getConnection();
			
			QueryRunner qr = new QueryRunner();
			Person p = qr.query(conn, sql, new BeanHandler<>(Person.class));
			JdbcUtil.closeAll(conn);
		
	%>
	<h1><%=p.toString() %>> </h1>
</body>
</html>