<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试</title>
</head>
<body>
	<div>
		<h3>接收UserInfo</h3>
		<form action="method2" method="post">
			姓名<input type="text" name="uname"/>
			编号<input type="number" name="uid"/>
			日期<input type="date" name="udate"/>
			钱<input type="number" name="umoney"/>
			<button type="submit">提交</button>
		</form>
	</div>
	<div>
		<h3>接收UserInfo类型的集合</h3>
		<form action="method3" method="post">
			姓名<input type="text" name="list[0].uname"/>
			编号<input type="number" name="list[0].uid"/>
			日期<input type="date" name="list[0].udate"/>
			钱<input type="number" name="list[0].umoney"/><br/>
			姓名<input type="text" name="list[1].uname"/>
			编号<input type="number" name="list[1].uid"/>
			日期<input type="date" name="list[1].udate"/>
			钱<input type="number" name="list[1].umoney"/>
			<button type="submit">提交</button>
		</form>
	</div>
	<div>
		<h3>接收String,number</h3>
		<form action="method1" method="post">
			<input type="text" name="uname"/>
			<input type="number" name="uid"/>
			
			<button type="submit">提交</button>
		</form>
	</div>
	<div>
		<h3>接收Date</h3>
		<form action="method4" method="post">
			日期<input type="date" name="sdate"/>
			
			<button type="submit">提交</button>
		</form>
	</div>
	<div>
		<h3>@RequestParam 注解解决请求参数名与方法参数名不一致问题</h3>
		<form action="method5" method="post">
			日期<input type="date" name="sd"/>
			
			<button type="submit">提交</button>
		</form>
	</div>
	<div>
		<h3>重定向</h3>
		<form action="method6" method="post">
			日期<input type="date" name="sd"/>
			
			<button type="submit">提交</button>
		</form>
	</div>
	
</body>
</html>