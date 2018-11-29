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
		window.location.href="${pageContext.request.contextPath}/deleteStu?id="+id;
		}
	}
	function goIndex(){
		window.location.href="${pageContext.request.contextPath}/index.jsp";
	}
	function goAdd(){
		window.location.href="${pageContext.request.contextPath}/stu_add.jsp";
	}
	
	
</script>
<title>展示页面</title>
</head>
<body>
		 <button type="button" class="btn btn-primary" onclick="goIndex();">
		  		<span class="glyphicon glyphicon-arrow-left"></span> 返回上一页
			</button>
			<button type="button" class="btn btn-primary" onclick="goAdd();">
		  		<span class="glyphicon glyphicon-plus"></span> 添加学生信息
			</button>
		 <h1 align="center">学生信息列表</h1>
		<table class="table table-hover">
			<tr align="center" class="action">
				<td colspan="14">共查询到${totalCount}条数据,一共${totalPage}页,当前第${pageIndex}页,每页展示${pageSize}条</td>
			</tr>
			<tr class="info"><th>学生ID</th><th>学生姓名</th><th>性别</th><th>生日</th><th>考号</th><th>学校ID</th><th>学校</th><th>区域ID</th><th>区域</th><th>语文</th><th>数学</th><th>英语</th><th>综合</th><th>操作</th></tr>
			<c:forEach items="${list}" var="s">
				<tr>
					<td>${s.sid}</td>
					<td>${s.sname}</td>
					
					<c:choose>
					<c:when test="${s.sex==0}">
					<td>女</td>
					</c:when>
					<c:otherwise>
					<td>男</td>
					</c:otherwise>
					</c:choose>
					<td>
						<fmt:formatDate value="${s.birthday}" pattern="yyyy-MM-dd"/>
					</td>
					<td>
						${s.examnum}
					</td>
					<td>
						${s.scid}
					</td>
					<td>
						${s.scname}
					</td>
					<td>
						${s.aid}
					</td>
					<td>
						${s.aname}
					</td>
					<td>
						${s.scores['语文']}
					</td>
					<td>
						${s.scores['数学']}
					</td>
					<td>
						${s.scores['英语']}
					</td>
					<td>
						${s.scores['综合']}
					</td>
					<td>
					<button class="btn btn-warning" onclick="toUpdate(${s.sid});">更新</button>
					<button class="btn btn-danger" onclick="toDelete(${s.sid});">删除</button>
					</td>
				</tr>
			</c:forEach>
			
			<tr><td colspan="14" align="center">
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