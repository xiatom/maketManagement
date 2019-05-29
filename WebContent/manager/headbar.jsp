<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../mycss/mycss.css" rel="stylesheet">
<script src="../js/jquery.min.js"></script>
<script src="../js/bootstrap.min.js"></script>

</head>
<body>


	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">经理控制台</a>
		</div>

		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li><a
					href="${pageContext.request.contextPath}/manager/home.jsp"
					style="color: #fff">主页</a></li>
					
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> 用户名 <b class="caret"></b>
				</a>
					<ul class="dropdown-menu">
						<li><a href="#">个人信息</a></li>
						<li><a href="${pageContext.request.contextPath}/index.jsp">登出</a></li>
					</ul></li>
			</ul>



		</div>
	</nav>

<div id="footer">
2019年夏季课设
</div>
</body>
</html>