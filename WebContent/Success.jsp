<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提示成功页面</title>
<script type="text/javascript">
alert("注册成功!")</script>
<style type="text/css">
body{
    font-family: 'Open Sans', sans-serif;
    background: url(image/1.jpg)no-repeat center 0px;
    background-attachment: fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
    background-size: cover;
}
h2 {
    font-size: 2.8em;
    text-align: center;
    color: #663333;
    font-weight: 100;
}
.page-bg{
   font-size:2em;
   color:#cc9933;
}
</style>
</head>
<body>
<h2 align="center">欢迎您来到偶像的世界</h2><br>
<div class="page-bg" style="text-align:center">

您好！<s:property value="consumer.username"/><br>
正在自动跳转登录页面...
<%response.setHeader("refresh","3;url=index.jsp"); %><br>
<s:a href="index.jsp">如跳转无效点击这里</s:a>
</div>
</body>
</html>