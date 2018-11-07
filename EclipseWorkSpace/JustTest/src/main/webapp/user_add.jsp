<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>加入我们</title>
<!-- 引入CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- 引入JS -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

</head>
<body>
	<form action="userAdd" method="get" class="col-xs-12">
		<table class="table table-hover">
		<tr align="center" ><td><h1>添加用户</h1></td></tr>
				<tr class="sucess"><td>请输入姓名:<input class="form-control"type="text" name="uname" required placeholder="请输入姓名..."/></td></tr>
				
				
				
				<tr class="sucess"><td>请输入生日:<input class="form-control"type="date" name="udate" /></td></tr>
				<tr class="sucess"><td>请输入会费:<input class="form-control"type="number" name="umoney" required placeholder="请输入会费..."/></td></tr>
				
				
				
				
				
				
				
				<tr align="center"><td>
				<button class="btn btn-success" type="submit">确定</button>
				<button class="btn btn-default" type="reset" onclick="javascript:history.go(-1);">取消</button>
				</td>
				</tr>
		</table>
	</form>
</body>
</html>