<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kadai.FortuneBean" %>
<% FortuneBean f = (FortuneBean) request.getAttribute("fortuneBean");%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fortune Result</title>
</head>
<body>
<h1>↓ <%= f.getToday() %>↓ </h1>
<h1> <%= f.getFortune() %> </h1>
</body>
</html>
