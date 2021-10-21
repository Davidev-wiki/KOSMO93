<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Method : GET</title>
</head>
<body>
<h3>GET방식으로 받았습니다!</h3>
<hr>
${get_msg}
<%
	String msg1 = String.valueOf(request.getAttribute("get_msg"));
	System.out.println("msg1 : " + msg1);
	out.println("msg1 : " + msg1);
%>
</body>
</html>