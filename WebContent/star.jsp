<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>守护我的超级明星</title>
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
					<li><a href="star.jsp">首页</a></li>
					<li><a href="#recommend">推荐</a></li>
					<li><a href="#special">资讯</a></li>
					<li><a href="#hot">热点</a></li>
					<li class="last"><a href="#">更多</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div id="three-columns">
		<div class="content">
		   <section id="recommend">
			<div id="column1">
				<h2>Recommend</h2>
				<p><a href="images/pic.jpg"><img src="images/pic.jpg" width="700" height="350" alt="" /></a></p>
				<p>《知否知否应是绿肥红瘦》是由东阳正午阳光影视有限公司出品，改编自关心则乱同名小说，通过北宋官宦家庭少女明兰的成长、爱情、婚姻故事，
				              展开了一幅由闺阁少女到侯门主母的生活画卷，讲述一个家宅的兴荣，古代礼教制度下的女性奋斗传奇。该剧于2018年12月25日在湖南卫视金鹰独播剧场首播，并在爱奇艺、腾讯视频、优酷、YouTube同步播出。</p>
				<p><a href="video.jsp" class="link-style">更多</a></p>
			</div>
		   </section>
		   <section id="special">
			<div id="column2">
				<h2>Special topic</h2>
				<ul class="list-style2">
					<li class="first"><a href="news.action?nid=1">萧敬腾坦言想退出社交平台：没有经营天分</a></li>
					<li><a href="news.action?nid=2">湖南卫视跨年演唱会：青春19潮我看</a></li>
					<li><a href="news.action?nid=3">暖心男生认证！孙燕姿晒林俊杰圣诞礼物赞其温暖</a></li>
					<li><a href="#">唐鹤德晒与张国荣合影旧照：昔日圣诞</a></li>
					<li><a href="#">胡歌又被曝已结婚 唐人回应：绝无此事</a></li>
					<li><a href="#">吴青峰为蔡依林蔡健雅林忆莲写歌 被网友调侃：年底冲业绩吗</a></li>
					<li><a href="#">宇宙少女明年1月回归 程潇孟美岐吴宣仪将缺席</a></li>
					<li><a href="#">人气太低？苏醒调侃与王栎鑫互动：我很倔强 不会退出娱乐圈</a></li>
					<li><a href="#">蔡健雅发长文回应抄袭质疑：对得起自己也对得起歌迷</a></li>
				</ul>
				<p><a href="#" class="link-style">更多</a></p>
			</div>
		   </section>
		</div>
	</div>
	<div id="three-column">
	   <section id="hot">
		<div id="tbox1">
			<h2>Hot topic</h2>
			<ul class="style1">
				<li class="first"><a href="#">杨幂刘恺威宣布离婚</a></li>
				<li><a href="hot1.jsp">个税转向附加扣除暂行办法</a></li>
				<li><a href="#">贾乃亮追责非法跟踪偷拍</a></li>
				<li><a href="#">为80元赔付款背上7万元网贷</a></li>
			</ul>
		</div>
	   </section>
		<div id="tbox2">
			<h2>My Super Star</h2>
			<p><img src="images/bb2.jpg" width="350" height="250" alt="" /></p>
		</div>
		<div id="tbox3">
			<h2>Social</h2>
			<ul class="style1">
				<li class="first"><a href="https://web2.qq.com/">QQ</a></li>
				<li><a href="https://wx.qq.com/">WeChat</a></li>
				<li><a href="https://weibo.com/?sudaref=www.baidu.com&display=0&retcode=6102">Sina</a></li>
			</ul>
		</div>
	</div>
	<div id="footer">
		<p>© 2018 12 22 | Design by w&Q</p>
	</div>
</div>
</body>
</html>
