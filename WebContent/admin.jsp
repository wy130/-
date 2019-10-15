<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员查看页面</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600" rel="stylesheet" type="text/css" />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->

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
    <table width="100%" align="center">
    <tr>
    <td><table width="100%">
    <tr>
    <td>所有用户信息：</td>
    </tr>
    <tr>
    <td><table border="1" align="center">
        <tr><th>id</th><th>姓名</th><th>喜欢的明星</th><th>联系电话</th></tr>
        <s:iterator value="users" var="u">
            <tr><td>${u.uid}</td>
               <td>${u.uname}</td>
               <td>${u.ustar}</td>
               <td>${u.uphone}</td>
            </tr>
        </s:iterator>
        </table>
    </td>
    </tr>
    </table></td>
    <td><table width="100%">
    <tr>
    <td> 相关明星信息：</td>
    </tr>
    <tr>
    <td><table border="1" align="center">
        <tr><th>明星编号</th><th>明星</th><th>明星事件</th><th>时间</th></tr>
        <s:iterator value="stars" var="s">
            <tr><td>${s.sid}</td>
               <td>${s.sname}</td>
               <td>${s.scontent }</td>
               <td>${s.stime }</td>
               <td><a href='updatestar.jsp'>更新列表</a></td>
            </tr>          
       </s:iterator>
       </table>
    </td>
    </tr>
    </table></td></tr></table>
		</div>
    </div>
   <div id="footer">
		<p>© 2018 12 22 | Design by w&Q</p>
	</div>
</div>
</body>
</html>