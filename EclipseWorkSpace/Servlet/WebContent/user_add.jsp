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
<title>加入我们</title>
</head>
<body>
	<div align="center">
		<h1>添加会员信息</h1>
		<br />
		<br />
		<br />
		<form action="AddUserAction">
			<table>
				<tr>
					<th>请输入姓名:</th>
					<td><input class="form-control" type="text" name="uname"
						required="required" placeholder="请输入姓名..." /></td>
				</tr>
				<tr>
					<th>请输入入会时间:</th>
					<td><input class="form-control" type="date" name="udate"
						required="required" placeholder="请输入入会时间..." /></td>
				</tr>
				<tr>
					<th>请输入入会费用:</th>
					<td><input class="form-control" type="number" name="umoney"
						required="required" placeholder="请输入会费..." /></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
				</tr>


				<tr>
					<td></td>
					<td align="right">
						<button class="btn btn-success" type="submit">确定</button>
						<button class="btn btn-warning" type="reset">取消</button>
					</td>
				</tr>
			</table>


		</form>

	</div>
</body>
</html>