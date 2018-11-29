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

<script type="text/javascript">
	function toUpdate(id){
		window.location.href="${pageContext.request.contextPath}/findBookByID?id="+id;
	}
	function toDelete(id){
		var con = confirm("are you sure to delete"+id);
		if(con){
		window.location.href="${pageContext.request.contextPath}/deleteBook?id="+id;
		}
	}
	function goIndex(){
		window.location.href="${pageContext.request.contextPath}/index.jsp";
	}
	function goAdd(){
		window.location.href="${pageContext.request.contextPath}/book_add.jsp";
	}
	function goDeleteAll(){
		
		 obj = document.getElementsByName("isSelect");
		    check_val = [];
		    for(k in obj){
		        if(obj[k].checked)
		            check_val.push(obj[k].value);
		    }
		    alert("您确定删这些ID吗?"+check_val);

        window.location.href="${pageContext.request.contextPath}/delEduList?str="+check_val;       
         
	}
	
	
</script>
<title>展示页面</title>
</head>
<body>
		 <button type="button" class="btn btn-primary" onclick="goIndex();">
		  		<span class="glyphicon glyphicon-arrow-left"></span> 返回上一页
			</button>
			
		 <h1 align="center">图书信息列表</h1>
		<table class="table table-hover">
			<tr align="center" class="action">
				<td colspan="7">共查询到${totalCount}条数据,一共${totalPage}页,当前第${pageIndex}页,每页展示${pageSize}条</td>
			</tr>
			<tr class="info">
			
        <td>
			<button type="button" class="btn btn-primary" onclick="goDeleteAll();">
		  		<span class="glyphicon glyphicon-trash" id="remove"></span> 
			</button>
			
			</td><th>编号</th><th>书名</th><th>作者</th><th>出版时间</th><th>图书标价</th><th>操作</th></tr>
			<c:forEach items="${list}" var="book">
				<tr>
					<td><input type="checkbox" name="isSelect" value="${book.bid}"/></td>
					<td>${book.bid}</td>
					<td>${book.ba}</td>
					<td>${book.bname}</td>
					
					
					<td>
						<fmt:formatDate value="${book.bdate}" pattern="yyyy-MM-dd"/>
					</td>
					<td>
						<fmt:formatNumber type="currency">${book.bprice}</fmt:formatNumber>
					</td>
					
					<td>
					<button class="btn btn-warning" onclick="toUpdate(${book.bid});"><span class="glyphicon glyphicon-refresh"></span>更新</button>
					<button class="btn btn-danger" onclick="toDelete(${book.bid});"><span class="glyphicon glyphicon-trash"></span>删除</button>
					</td>
				</tr>
			</c:forEach>
			
			<tr><td colspan="7" align="center">
			<a class="btn btn-default" role="button" href="findBooksByPage?pageIndex=1">首页</a>
			<c:choose>
			<c:when test="${pageIndex>1}">
			<a class="btn btn-default" role="button" href="findBooksByPage?pageIndex=${pageIndex-1}">上一页</a>
			</c:when>
			<c:otherwise>
			<a class="btn btn-default" role="button" disabled="disabled">上一页</a>
			</c:otherwise>
			</c:choose>
			<c:choose>
			<c:when test="${pageIndex<totalPage}">
			<a class="btn btn-default" role="button" href="findBooksByPage?pageIndex=${pageIndex+1}">下一页</a>
			</c:when>
			<c:otherwise>
			<a class="btn btn-default" role="button" disabled="disabled">下一页</a>
			</c:otherwise>
			</c:choose>
			<a class="btn btn-default" role="button" href="findBooksByPage?pageIndex=${totalPage}">尾页</a>
			
			</td></tr>
		</table>
</body>
</html>