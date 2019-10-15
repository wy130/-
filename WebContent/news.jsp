<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>湖南卫视跨年晚会</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600" rel="stylesheet" type="text/css" />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->
</head>
<body>
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
					<li class="current_page_item"><a href="star.jsp">首页</a></li>
					<li><a href="#recommend">推荐</a></li>
					<li><a href="#special">资讯</a></li>
					<li><a href="#hot">热点</a></li>
					<li class="last"><a href="#">更多</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="box-wrap">
	  <s:iterator value="list" var="l">
       <p><h1>${l.news_Title}</h1></p>
       <br>
       <p><h3>${l.news_Date}</h3></p>
       <p>作者：${l.news_Author}</p>
       <div textalign="center">
       <img  alt="" src="${l.news_Image1}" width="400" height="400"><br>
       <img alt="" src="${l.news_Image2}" width="500" height="400">
       </div>
        <p><h2>${l.news_Content}</h2></p>         
        </s:iterator>
 	</div>
     <div id="footer">
		<p>© 2018 12 22 | Design by w&Q</p>
	</div>
</body>
</html>