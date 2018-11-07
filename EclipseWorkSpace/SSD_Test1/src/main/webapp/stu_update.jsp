<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@  taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统首页</title>
<!-- 引入CSS与JS样式 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
</head>
<body>
	<form action="updateStu" method="post">
	<input type="hidden" name="sid" value="${stu.sid}"/>
		请输入姓名<input type="text" value="${stu.sname}" name="sname" required="required"/>
		请选择性别<select name="sex" required="required">
				<option >---请选择---</option>
				<option value="0"<c:if test="${stu.sex eq 0}">selected</c:if>>女</option>
				<option value="1" <c:if test="${stu.sex eq 1}">selected</c:if>>男</option>
		</select>
		请选择生日<input type="date" value="${stu.birth}"name="birth" required="required"/>
		<button type="submit">提交</button>
		<button onclick="javascript:history.go(-1);">取消</button>
	</form>
</body>
</html>