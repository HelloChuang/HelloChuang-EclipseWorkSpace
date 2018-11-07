
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script type="text/javascript"  href="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script>
<script type="text/javascript"  href="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<title>更新信息</title>
</head>
<body>
<form action="UpdateUserAction">
	<input type="hidden" name="uuid" value="${user.uid}"/>
	姓名:<input type="text" value="${user.uname}"name="uuname" required="required" /><br/>
	时间:<input type="date" value="${user.udate}"name="uudate" required="required" /><br/>
	会费:<input type="number" value="${user.umoney}"name="uumoney" required="required" /><br/>
	<button type="submit">确定</button><button type="reset">取消</button>
</form>


 <form class="form-horizontal">
        <div class="container">
            <div class="row" style="padding: 20px 0">
                <h3>常用垂直表单布局</h3>
            </div>
            <div class="row form-group">
                <label class="control-label col-lg-1" for="name">名称</label>
                <div class="col-lg-5 col-md-6">
                    <input class="form-control" name="name" id="name" type="text">
                </div>
            </div>
            <div class="row form-group">
                <label class="control-label col-lg-1">内容</label>
                <div class="col-lg-5 col-md-6">
                    <textarea class="form-control" rows="5"></textarea>
                </div>
            </div>
            <div class="row form-group">
                <label class="control-label col-lg-1">补充</label>
                <div class="col-lg-5 col-md-6">
                    <textarea class="form-control" rows="5"></textarea>
                </div>
            </div>
        </div>
    </form>

    

</body>
</html>