<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<script>
		function doDelete(id) {
			var con = window.confirm("确定要删除ID为"+id+"的会员吗");
			if(con==true){
				window.location.href="DeleteUserAction?id="+id;
			}
		}
		function doUpdate(id){
			window.location.href="FindUserByIDAction?id="+id;
		}
		</script>

<title>人员列表</title>
</head>
<body>
	<div>
		<table class="table table-hover">
			<tr class="active" align="center">
				<td colspan="5">共查詢到${totalCount}条记录,当前第${pageIndex}页,共${totalPage}页</td>
			</tr>

			<tr class="info">
				<th>编号</th>
				<th>姓名</th>
				<th>入会时间</th>
				<th>会费</th>
				<th>操作</th>
			</tr>


			<c:forEach var="user" items="${list}">
				<tr>
					<td>${user.uid}</td>
					<td>${user.uname}</td>
					<td><fmt:formatDate value="${user.udate}" pattern="yyyy-MM-dd" /></td>
					<td><fmt:formatNumber type="currency" value="${user.umoney}" /></td>
					<td>
						<button class="btn btn-info" onclick="doUpdate(${user.uid});">更新</button>
						<button class="btn btn-danger" onclick="doDelete(${user.uid});">删除</button>
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="5" align="center"><a class="btn btn-default"
					role="button" href="FindUserByPageAction?pageIndex=1">首页</a> <c:choose>
						<c:when test="${pageIndex == 1 }">
							<a class="btn btn-default" disabled="disabled" role="button"
								href="FindUserByPageAction?pageIndex=${pageIndex-1}">上一页</a>
						</c:when>
						<c:otherwise>
							<a class="btn btn-default" role="button"
								href="FindUserByPageAction?pageIndex=${pageIndex+1}">下一页</a>
						</c:otherwise>
					</c:choose> <c:choose>
						<c:when test="${pageIndex < totalPage}">
							<a class="btn btn-default" role="button"
								href="FindUserByPageAction?pageIndex=${pageIndex+1}">下一页</a>
						</c:when>
						<c:otherwise>
							<a class="btn btn-default" disabled="disabled" role="button"
								href="FindUserByPageAction?pageIndex=${pageIndex+1}">下一页</a>
						</c:otherwise>
					</c:choose> <a class="btn btn-default" role="button"
					href="FindUserByPageAction?pageIndex=${totalPage}">尾页</a></td>
			</tr>
		</table>

	</div>
</body>
</html>