<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Method : POST</title>
</head>
<body>
<h3>POST방식으로 받았습니다!</h3>
<hr>
${post_msg}<br>
<hr>
<%
	String msg1 = String.valueOf(request.getAttribute("post_msg"));
	System.out.println("System.out.println으로 출력한 것 : " + msg1);
	out.println("out.println으로 출력한 것 : " + msg1);
%>
</body>
</html>