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
	<form action="bookAdd" method="post" class="col-xs-12">
		<table class="table table-hover">
		<tr align="center" ><td><h1>添加图书</h1></td></tr>
				<tr class="sucess"><td>请输入书名:<input class="form-control"type="text" name="ba" required placeholder="请输入书名..."/></td></tr>
				<tr class="sucess"><td>请输入作者:<input class="form-control"type="text" name="bname" required placeholder="请输入作者..."/></td></tr>
				
				
				
				<tr class="sucess"><td>请输入出版日期:<input class="form-control"type="date" name="bdate" /></td></tr>
				<tr class="sucess"><td>请输入图书价格:<input class="form-control"type="number" name="bprice" required placeholder="请输入图书价格..."/></td></tr>
				
				
				
				
				
				
				
				<tr align="center"><td>
				<button class="btn btn-success" type="submit">确定</button>
				<button class="btn btn-default" type="reset" onclick="javascript:history.go(-1);">取消</button>
				</td>
				</tr>
		</table>
	</form>
</body>
</html>