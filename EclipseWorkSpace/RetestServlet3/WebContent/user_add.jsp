<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script type="text/javascript" href="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script>
<script type="text/javascript" href="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<title>添加会员</title>
</head>
<body>
<form class="form-horizontal" role="form" action="AddUserAction" method="post">
	<div class="form-group has-success">
    <label class="col-sm-2 control-label" for="inputSuccess">请输入姓名:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="uname" required="required" placeholder="请输入姓名...">
    </div>
  </div>
  <div class="form-group has-warning">
    <label class="col-sm-2 control-label" for="inputWarning">请输入入会时间:</label>
    <div class="col-sm-10">
      <input type="date" class="form-control" name="udate" required="required" placeholder="请输入入会时间...">
    </div>
  </div>
  <div class="form-group has-error">
    <label class="col-sm-2 control-label" for="inputError">请输入会费:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="umoney" required="required" placeholder="请输入会费...">
    </div>
  </div>
  <div align="center">
  <button class="btn btn-success"type="submit">确定</button>
  <button class="btn btn-success"type="reset">取消</button>
  </div>
  </form>
  
</body>
</html>