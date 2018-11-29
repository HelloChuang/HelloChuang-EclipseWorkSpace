<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息管理与分析系统</title>
<!-- 引入CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- 引入JS -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script type="text/javascript">
	// 分页查询
	function BookManage(){
		window.location.href = "${pageContext.request.contextPath}/findBooksByPage?pageIndex=1";
	}
	function addMethod(){
		window.location.href = "${pageContext.request.contextPath}/book_add.jsp";
	}
	
</script>
</head>
<body>
	<div class="jumbotron">
	    <div class="container">
	        <h1>欢迎使用图书馆管理系统</h1>
	        <p>请选择一个您要操作的功能吧!</p>
	        <p>
	        	<button type="button" class="btn btn-primary btn-lg" onclick="BookManage();">
				  <span class="glyphicon glyphicon-book"></span> 图书信息管理
				</button>
	        </p>
	        <p>
	        	<button type="button" class="btn btn-success btn-lg" onclick="addMethod();">
				  <span class="glyphicon glyphicon-plus"></span> 添加图书信息
				</button>
	        </p>
	    </div>
	</div>
</body>
</html>