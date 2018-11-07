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
	$(document).ready(function(){
		loadArea();
	});
	function loadArea(){
		$.post("${pageContext.request.contextPath}/findAllAreas",function(data){
			var op = "<option value=''>---请选择---</option>";
			for (var i = 0; i < data.length; i++) {
				op+="<option value='"+data[i].aid+"'>"+data[i].aname+"</option>";
			}
			$("#areaSelect").html(op);
		});
	}
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
	<form action="stuAdd" method="get" class="col-xs-12">
		<table class="table table-hover">
		<tr align="center" ><td><h1>添加学生信息</h1></td></tr>
				<tr class="sucess"><td>请输入姓名:<input class="form-control"type="text" name="sname" required placeholder="请输入姓名..."/></td></tr>
				
				<tr class="sucess"><td>请选择性别:
				<select name="sex" class="form-control">
				<option >---请选择---</option>
				<option value="1">男</option>
				<option value="0">女</option>
				</select>
				
				</td></tr>
				<tr class="sucess"><td>请输入生日:<input class="form-control"type="date" name="birthday" /></td></tr>
				<tr class="sucess"><td>请输入考号:<input class="form-control"type="number" name="examnum" required placeholder="请输入考号..."/></td></tr>
				
				
				<tr class="sucess">
				<td>选择学校
				<select id="areaSelect"class="form-control" required onchange="loadSchools();">
				</select>
				<select id="scSelect" name="scid"class="form-control" required>
				</select>
				</td>
				</tr>
				
				
				
				<tr class="sucess"><td>语文成绩<input class="form-control "type="number" name="scores['语文']" required placeholder="请输入语文..."/></td></tr>
				<tr class="sucess"><td>数学成绩<input class="form-control"type="number" name="scores['数学']" required placeholder="请输入数学..."/></td></tr>
				<tr class="sucess"><td>英语成绩<input class="form-control"type="number" name="scores['英语']" required placeholder="请输入英语..."/></td></tr>
				<tr class="sucess"><td>综合成绩<input class="form-control"type="number" name="scores['综合']" required placeholder="请输入综合..."/></td></tr>
				
				<tr align="center"><td>
				<button class="btn btn-success" type="submit">确定</button>
				<button class="btn btn-default" type="reset" onclick="javascript:history.go(-1);">取消</button>
				</td>
				</tr>
		</table>
	</form>
</body>
</html>