<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=gb2312" %>

<html>
  <head>
	<title>登录</title>
	<script language="JavaScript"  src="../jquery/jquery-3.1.1.js"></script>
	<link rel="stylesheet" type="text/css" href="../css/login.css">
  </head>
  
  <body>
  	错误信息:${error };
  	<form action="${pageContext.request.contextPath}/user/loginUser" method="post">
  		账号:<input type="text" value ="Text1" name="account">
  		<br>
  		密码:<input type="password" value="123456" name="password">
  		<br>
  		<input type="submit" value="登录">
  	</form>
  </body>
</html>	