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
<title>更新会员</title>
</head>
<body>
	<div align="center">
		<h1>更新会员信息</h1>
		<br />
		<br />
		<br />
		<form action="UpdateUserAction">
			<table>
				<input type="hidden" name="uuid" value="${uid}" />
				<tr>
					<th>请输入姓名:</th>
					<td><input class="form-control" value="${uname}" type="text"
						name="uuname" required="required" /></td>
				</tr>
				<tr>
					<th>请输入入会时间:</th>
					<td><input class="form-control" value="${udate}" type="date"
						name="uudate" required="required" /></td>
				</tr>
				<tr>
					<th>请输入入会费用:</th>
					<td><input class="form-control" value="${umoney}"
						type="number" name="uumoney" required="required" /></td>
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