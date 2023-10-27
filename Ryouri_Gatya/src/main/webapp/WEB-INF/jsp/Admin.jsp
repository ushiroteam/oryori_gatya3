<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name = request.getParameter("name");
String pass = request.getParameter("pass");
%>
	<h2><% request.getAttribute("name"); %>さん管理者ページへようこそ</h2>
	<c:redirect src=""></c:redirect>
</body>
</html>