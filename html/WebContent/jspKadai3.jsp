<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>
<%!
  private String dateDate() {
	Date date = new Date();
	SimpleDateFormat stringToday = new SimpleDateFormat("yyyy年MM月dd日");
    return stringToday.format(date);
  }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP KADAI</title>
</head>
<body>
	<%!int visits = 0;%>

	<h1>訪問回数：<%= visits++ %></h1>
	<p>今日の日付：<%= dateDate()%></p>
</body>
</html>