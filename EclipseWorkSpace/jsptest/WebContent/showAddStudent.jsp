<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
		<div  >
			<form action="addStudentServer.jsp">
				<fieldset id="">
					<legend>请完善学生信息</legend>
					<table class="table table-hover">
					<tr><td>请输入姓名:	<input  type="text" name="name" required="required"/></td></tr>
					<tr><td>请输入性别:	<input  type="text" name="sex" required="required"/></td></tr>
					<tr><td>请输入年龄:	<input  type="number" name="age" required="required"/></td></tr>
					<tr><td>请输入籍贯:	<input  type="text" name="from" required="required"/></td></tr>
					<p><button type="submit">确定</button><button type="reset">取消</button></p>
				</table>
				</fieldset>
			</form>
		</div>
	
	
</body>
</html>