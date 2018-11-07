<!-- 知识点:
	引用样式的语法
	href中给servlet传参的语法
 -->
>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<title>首页</title>
</head>
<body>

	<div class="container">
		<div class="jumbotron">
			<h1>欢迎使用会员管理系统！</h1>
			<p>您可以查询会员信息或加入我们</p>
			<p>
				<a class="btn btn-primary btn-lg" role="button"
					href="FindUserByPageAction?pageIndex=1"> 查询会员</a> <a
					class="btn btn-primary btn-lg" role="button" href="user_add.jsp">
					加入我们</a>
			</p>
		</div>
	</div>
</body>
</html>