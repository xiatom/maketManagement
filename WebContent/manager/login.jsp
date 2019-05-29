<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="../css/bootstrap.min.css" rel="stylesheet"> 
<link href="../mycss/signin.css" rel="stylesheet"> 

<title>登陆界面</title>
</head>
<body>


<%@include file="../manager/headbar.jsp" %>
<div class="container">

      <form class="form-signin" action="${pageContext.request.contextPath}/manager/login" method="post">
        <h2 class="form-signin-heading" style="text-align: center">登陆</h2>
        
        <label for="inputName" class="sr-only">账号</label>
        <input type="text" name="manager_name" class="form-control" placeholder="用户名" required autofocus>
       
        <label for="inputPassword" class="sr-only">密码</label>
        <input type="password" name="manager_password" class="form-control" placeholder="密码" required>
    
        <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
      </form>

    </div> 

</body>
</html>