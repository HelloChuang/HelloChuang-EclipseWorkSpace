<%@page import="org.apache.commons.dbutils.handlers.BeanHandler"%>
<%@page import="com.gao.jsp.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.gao.jsp.Person"%>
<%@page import="org.apache.commons.dbutils.QueryRunner"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p" %>>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改</title>
</head>
<body>

		<div>
			<form action="updateStudentEnsure.jsp">
				<fieldset id="">
					<legend>请修改学生信息</legend>
					<table class="table table-hover">
					<tr><td>请输入姓名:	<input  type="text" name="name" required="required" value="${sname} " /></td></tr>
					<tr><td>请输入性别:	<input  type="text" name="sex" required="required" value="${sex} " /></td></tr>
					<tr><td>请输入年龄:	<input  type="number" name="age" required="required" value="${age} " /></td></tr>
					<tr><td>请输入籍贯:	<input  type="text" name="from" required="required" value="${from} " /></td></tr>
					<p><button type="submit">确定</button><button type="reset">取消</button></p>
				</table>
				</fieldset>
			</form>
		</div>
	
	
</body>
</html>