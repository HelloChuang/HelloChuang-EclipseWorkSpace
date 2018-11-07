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
	
	
<title>更新人员</title>
</head>
<body>


<form action="UpdateUserAction" class="form-horizontal  col-xs-8" role="form" style="margin-left: auto;
    margin-right: auto; float: none">

	<div class="form-group has-success" >
	<div align="center">
	<h1>更新人员信息</h1>
	</div>
		<label class="col-sm-2 control-label" for="inputSuccess">
			请输入姓名:
		</label>
		<div class="col-sm-10">
		<input type="hidden" name="uuid" value="${user.uid}" />
			<input type="text" class="form-control" name="uuname" required="required" value="${user.uname}">
		</div>
	</div>
	<div class="form-group has-warning">
		<label class="col-sm-2 control-label" for="inputWarning">
			请输入入会时间:
		</label>
		<div class="col-sm-10">
			<input type="date" class="form-control" name="uudate" required="required" value="${user.udate}">
		</div>
	</div>
	<div class="form-group has-error">
		<label class="col-sm-2 control-label" for="inputError">
			请输入会费:
		</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" name="uumoney" required="required" value="${user.umoney}">
		</div>
		<br/><br/><br/>
		<div align="center">
		<button class="btn btn-success" type="submit">确定</button><button class="btn btn-default" type="reset">取消</button>
	</div>
	</div>
	
</form>
</body>
</html>

