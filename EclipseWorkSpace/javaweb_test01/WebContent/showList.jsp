<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆成功,数据展示</title>
</head>
<body>
	<h1>登陆成功,数据展示</h1>
	<div>
		<table>
			<tr>
				<th>编号</th><th>姓名</th><th>性别</th><th>年龄</th><th>籍贯</th>
				<c:forEach var="p" items="${persons} ">
				<tr>
					<td>${p.id}</td>
					<td>${p.name}</td>
					<td>${p.sex}</td>
					<td>${p.age}</td>
					<td>${p.from}</td>
				
				</tr>
				</c:forEach>
			</tr>
		</table>
	</div>
</body>
</html>