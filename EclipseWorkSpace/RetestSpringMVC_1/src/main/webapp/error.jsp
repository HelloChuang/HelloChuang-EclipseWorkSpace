<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script type="text/javascript" href="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script>
<script type="text/javascript" href="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<title>首页</title>
</head>
<body>
		<div class="jumbotron">
	    <div class="container">
	        <h1>Error!!</h1>
	        <p>${msg}</p>
	       <p><a class="btn btn-success btn-lg" role="button" href="index.jsp">返回首页</a></p>
	    </div>
	</div>
</body>
</html>