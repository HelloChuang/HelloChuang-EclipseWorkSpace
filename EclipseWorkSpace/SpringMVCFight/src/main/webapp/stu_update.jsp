<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息管理与分析系统</title>
<!-- 引入CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- 引入JS -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script type="text/javascript">
	
	function loadSchools(){ 
		var areaSelect = $("#areaSelect");
		$.post("${pageContext.request.contextPath}/findSchoolsByAid",{aid:areaSelect.val()},function(data){
			var op = "<option value=''>---请选择---</option>";
			for (var i = 0; i < data.length; i++) {
				op+="<option value='"+data[i].scid+"'>"+data[i].scname+"</option>";
			}
			$("#scSelect").html(op);
		});
	}
</script>
</head>
<body>
	<form action="stuUpdate" method="get" class="col-xs-12">
	<input type="hidden" name="sid" value="${s.sid}"/>
		<table class="table table-hover">
		<tr align="center" ><td><h1>更新学生信息</h1></td></tr>
				<tr class="sucess"><td>请输入姓名:<input class="form-control"type="text" value="${s.sname}"name="sname" required /></td></tr>
				
				<tr class="sucess"><td>请选择性别:
				<select name="sex" class="form-control">
				<option >---请选择---</option>
				<option value="1"	<c:if test="${s.sex==1}">selected</c:if>>男</option>
				<option value="0" 	<c:if test="${s.sex==0}">selected</c:if>>女</option>
				</select>
			
				</td></tr>
				<tr class="sucess"><td>请输入生日:<input class="form-control"type="date" value="${s.birthday}"name="birthday" /></td></tr>
				<tr class="sucess"><td>请输入考号:<input class="form-control"type="number" value="${s.examnum}"name="examnum" required /></td></tr>
				
				
				<tr class="sucess">
				<td>选择学校
				<select id="areaSelect"class="form-control" required onchange="loadSchools();">
				<option>---请选择---</option>
				<c:forEach var="a" items="${a}">
				<option value="${a.aid}"<c:if test="${a.aname==s.aname}">selected</c:if>>---${a.aname}---</option>
				</c:forEach>
				</select>
				
				
				
				
				<select id="scSelect" name="scid"class="form-control" required>
				<option>---请选择---</option>
				<c:forEach var="sc" items="${sc}">
				<option value="${sc.scid}"<c:if test="${sc.scid==s.scid}">selected</c:if>>---${sc.scname}---</option>
				</c:forEach>
				</select>
				</td>
				</tr>
				
				
				
				<tr class="sucess"><td>语文成绩<input class="form-control "type="number" value="${s.scores['语文']}"name="scores['语文']" required /></td></tr>
				<tr class="sucess"><td>数学成绩<input class="form-control"type="number" value="${s.scores['数学']}"name="scores['数学']" required /></td></tr>
				<tr class="sucess"><td>英语成绩<input class="form-control"type="number" value="${s.scores['英语']}"name="scores['英语']" required /></td></tr>
				<tr class="sucess"><td>综合成绩<input class="form-control"type="number" value="${s.scores['综合']}"name="scores['综合']" required /></td></tr>
				
				<tr align="center"><td>
				<button class="btn btn-success" type="submit">确定</button>
				<button class="btn btn-default" type="reset" onclick="javascript:history.go(-1);">取消</button>
				</td>
				</tr>
		</table>
	</form>
</body>
</html>