<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 <%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>明星列表修改</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600" rel="stylesheet" type="text/css" />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->
<style type="text/css">
.gg {background: url(images/ggg1.gif);background-size:100% 100%;
    }
</style>
</head>

<body>
<div id="wrapper">
	<div id="header">
		<div id="logo">
			<h1><a href="index.jsp">My Super Star</a></h1>
			<p>——守护我的超级明星</p>
		</div>
	</div>
	<!-- end #header -->
	<div id="menu-wrapper">
		<div class="ribbon ribbon-content">
			<div id="menu">
				<ul>
					<li class="current_page_item">您好<s:property value="user.uid"/></li>
					 &nbsp;&nbsp;&nbsp;
					<li class="last">My Super Star 管理员页面</li>
				</ul>
			</div>
		</div>
<div class="gg">
<s:form action="up1.action" method="post" onsubmit="return checkLogin()" namespace="/">
<tr align="center">
<td colspan="2" align="center" >
<p>明星编号</p></td>
<s:textfield name="star.sid" cssStyle="width:360px;height:30px"></s:textfield>
<td colspan="2" align="center" >
<p>明星</p></td>
<s:textfield name="star.sname" cssStyle="width:360px;height:30px"></s:textfield>
<td colspan="2" align="center" >
<p>明星事件</p></td>
<s:textfield name="star.scontent" cssStyle="width:360px;height:30px"></s:textfield>
<td colspan="2" align="center" >
<p>时间</p></td>
<s:textfield name="star.stime" cssStyle="width:360px;height:30px"></s:textfield>
<td>
<br>
<br><br>
<s:submit style="width:360px;background-color:#ebebeb;font-size:20px" value="新增"></s:submit>
<s:submit style="width:360px;background-color:#ebebeb;font-size:20px" value="修改"></s:submit>
<s:submit style="width:360px;background-color:#ebebeb;font-size:20px" value="删除"></s:submit>
<br>
<br><br>
</s:form>
</div>

<div id="footer">
		<p>© 2018 12 22 | Design by w&Q</p>
	</div>
</div>
</body>
</html>