<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

<script>
	function toUpdate(id){
		window.location.href="${pageContext.request.contextPath}/findUserByID?id="+id;
	}
	function toDelete(id){
		var con = confirm("are you sure to delete"+id);
		if(con){
		window.location.href="${pageContext.request.contextPath}/deleteUser?id="+id;
		}
	}
</script>
<title>展示页面</title>
</head>
<body>
		 <a class="btn btn-success btn-lg" role="button" href="index.jsp">返回首页</a>
		 <h1 align="center">人员信息列表</h1>
		<table class="table table-hover">
			<tr align="center" class="action">
				<td colspan="5">共查询到${totalCount}条数据,一共${totalPage}页,当前第${pageIndex}页,每页展示${pageSize}条</td>
			</tr>
			<tr class="info"><th>编号</th><th>姓名</th><th>入会时间</th><th>会费</th><th>操作</th></tr>
			<c:forEach items="${list}" var="user">
				<tr>
					<td>${user.uid}</td>
					<td>${user.uname}</td>
					<td>
						<fmt:formatDate value="${user.udate}" pattern="yyyy-MM-dd"></fmt:formatDate>
					</td>
					<td>
						<fmt:formatNumber type="currency">${user.umoney}</fmt:formatNumber>
					</td>
					<td>
					<button class="btn btn-warning" onclick="toUpdate(${user.uid});">更新</button>
					<button class="btn btn-danger" onclick="toDelete(${user.uid});">删除</button>
					</td>
				</tr>
			</c:forEach>
			
			<tr><td colspan="5" align="center">
			<a class="btn btn-default" role="button" href="findStudentsByPage?pageIndex=1">首页</a>
			<c:choose>
			<c:when test="${pageIndex>1}">
			<a class="btn btn-default" role="button" href="findStudentsByPage?pageIndex=${pageIndex-1}">上一页</a>
			</c:when>
			<c:otherwise>
			<a class="btn btn-default" role="button" disabled="disabled">上一页</a>
			</c:otherwise>
			</c:choose>
			<c:choose>
			<c:when test="${pageIndex<totalPage}">
			<a class="btn btn-default" role="button" href="findStudentsByPage?pageIndex=${pageIndex+1}">下一页</a>
			</c:when>
			<c:otherwise>
			<a class="btn btn-default" role="button" disabled="disabled">下一页</a>
			</c:otherwise>
			</c:choose>
			<a class="btn btn-default" role="button" href="findStudentsByPage?pageIndex=${totalPage}">尾页</a>
			
			</td></tr>
		</table>
</body>
</html>