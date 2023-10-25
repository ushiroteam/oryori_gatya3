<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/Style.css">
<link rel="stylesheet" href="css/Font_Style.css">
<link rel="stylesheet" href="css/Fade.css">
<title>PK Game</title>
</head>
<body>
	<%
	// プレイヤーの選択を取得
	String playerChoice= request.getParameter("playerChoice");
	

	// キーパーの動き（ランダム）
	String[] KeeperChoice = { "ひだり", "まんなか", "みぎ" };
	int r = new java.util.Random().nextInt(3);
	String Keeper = KeeperChoice[r];
	
	// プレイヤーがNULLの場合
    if (playerChoice == null) {%>
    <p>どこにシュートするか選択してください</p>
    <% }	%>

	
	<p>	あなた:	<%=playerChoice%></p>
	<p>	キーパー:<%=Keeper%></p>

	<% 	String result = playerChoice + Keeper;
		
		 switch (result) {
			case "ひだりひだり":%>
	<img src="pic/01LL_MISS.gif" alt="LL画像" width="350">
	<%
		break;
		case "ひだりまんなか":%>
	<img src="pic/02LC_GOAL.gif" alt="LC画像" width="350">
	<%
		break;
		case "ひだりみぎ":%>
	<img src="pic/03LR_GOAL.gif" alt="LR画像" width="350">
	<%
		break;
		case "まんなかひだり":%>
	<img src="pic/04CL_GOAL.gif" alt="CL画像" width="350">
	<%
		break;
		case "まんなかまんなか":%>
	<img src="pic/05CC_MISS.gif" alt="CC画像" width="350">
	<%
		break;
		case "まんなかみぎ":%>
	<img src="pic/06CR_GOAL.gif" alt="CR画像" width="350">
	<%
		break;
		case "みぎひだり":%>
	<img src="pic/07RL_GOAL.gif" alt="RL画像" width="350">
	<%
		break;
		case "みぎまんなか":%>
	<img src="pic/08RC_GOAL.gif" alt="RC画像" width="350">
	<%
		break;
		case "みぎみぎ":%>
	<img src="pic/09RR_MISS.gif" alt="RRの画像" width="350">
	<%
		break;
	}%>
	
	 <a href="Page/player.html">もう一回</a>

</body>
</html>