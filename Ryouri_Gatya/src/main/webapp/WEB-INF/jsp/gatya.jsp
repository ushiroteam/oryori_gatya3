<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List" %>
<%@ page import="bean.GatyaUser"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/Style.css">
<link rel="stylesheet" href="css/Font_Style.css">
<link rel="stylesheet" href="css/Fade.css">
<title>今日のごはんは何にしよう</title>
</head>
<body>
<%
 List<GatyaUser> list = (List<GatyaUser>)request.getAttribute("list");
 for(int i = 0; i<list.size(); i++){
	 GatyaUser gatya = list.get(i);
%>
	<br>
	<br>
	<img class="img" alt="ガチャ" src="../写真/Obachan.gif" width="300px">
	<br>
	<div class="memoflame">

	<!-- ここに楽天レシピの写真を表示させる（DBのURLから呼び出し） -->
	<img src=" gatya.getRyouri_imgURL() "
		alt="recipeID" width="400" height="300">
	<br>
	<!-- ここに楽天レシピのリンクをのっける（URL)  -->
	<a href="<%= gatya.getRecipeURL() %>"><%= gatya.getDishes() %></a>
	</div>
	<br>
	<br>
	<br>
	<div class="balloon_1">またはこれはどう？？？？</div>
	
	<br>
	
	<div class="memoflame">
	
	<!-- ここにホットペッパーの写真をのっける -->
	<img
		src='<%= gatya.getRestaurant_imgURL()%>'
		alt="hotpepperID" width="400" height="300">
	<br>
	<br>
	<!-- ここにホットペッパーのリンクをのっける -->
	<br>
	<a href="<%= gatya.getRestaurantURL() %>">レストラン</a>
	<br>
	
	</div>
	<%} %>
	<!-- ここにボタン -->
	<br>
	<form action="Page/Page_4.html">
		<button class="button" type="submit" name="button" value="button">
			 <b>違うのがいい～</b>
			
		</button>
	</form>
	<br>
	

	<button class="button displayText" type="submit" name="button" value="button" onclick="alert('やったね')">
    <b>気に入った</b>
</button>
	<br>

	<form action="Page/Page_1.html">
		<button class="button" type="submit" name="button" value="button">
			 <b>TOPに戻る</b>
			
		</button>
	</form>
</body>
</html>