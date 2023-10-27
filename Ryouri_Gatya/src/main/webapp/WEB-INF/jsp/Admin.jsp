<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/Style.css">
<link rel="stylesheet" href="css/Font_Style.css">
<link rel="stylesheet" href="css/Fade.css">
<title>Insert title here</title>
</head>
<body>
<%
String name = (String)session.getAttribute("name");
String pass = (String)session.getAttribute("pass");
%>
	<h2><%= name %>さん管理者ページへようこそ</h2>
	<br>
	<form action="InsertTable" method="post">
		<button class="button">管理者ページへ</button>
	 </form>
</body>
</html>