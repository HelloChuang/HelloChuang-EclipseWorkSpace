<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书信息管理系统</title>
<!-- 引入CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- 引入JS -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script type="text/javascript">
	// 分页查询
	function stuManage(){
		window.location.href = "${pageContext.request.contextPath}/index.jsp";
	}
	
</script>
</head>
<body>
	<div class="jumbotron">
	    <div class="container">
	        <h1>错误!!!</h1>
	        <p>${msg}</p>
	        <p>
	        	<button type="button" class="btn btn-primary btn-lg" onclick="stuManage();">
				  <span class="glyphicon glyphicon-user"></span> 返回首页
				</button>
	        </p>
	       
	    </div>
	</div>
</body>
</html>