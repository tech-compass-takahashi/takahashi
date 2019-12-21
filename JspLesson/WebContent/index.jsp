<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%! int num = 2;
	int add(int a, int b){
		 return a + b;
	}
%>
<meta charset="UTF-8">
<title>初めてのJSP</title>
</head>
<body>
	<h1>こんにちわ</h1>
	<!-- コメント -->
	<p><%= num %></p>
	<p>1 + 1 = <%= add(1,1) %></p>
	<% out.print("出力確認"); %>
	<%-- コメント
	      htnlのコメントはwebページのソースに残ってしまうが、
	      jspのコメントはコンパイルの段階で除去されるので残らない
	      htmlのコメントはwebページで右クリック→"ソースを表示"で丸見え
	  --%>
</body>
</html>