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
	<form action="addStu" method="post">
		请输入姓名<input type="text" name="sname" required="required"/>
		请选择性别<select name="sex" required="required">
				<option >---请选择---</option>
				<option value="0">女</option>
				<option value="1">男</option>
		</select>
		请选择生日<input type="date" name="birth" required="required"/>
		<button >提交</button>
		<button type="reset" onclick="javascript:history.go(-1);">取消</button>
	</form>
</body>
</html>