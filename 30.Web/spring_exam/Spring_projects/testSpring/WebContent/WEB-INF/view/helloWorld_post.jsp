<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Method : POST</title>
</head>
<body>
<h3>POST������� �޾ҽ��ϴ�!</h3>
<hr>
${post_msg}<br>
<hr>
<%
	String msg1 = String.valueOf(request.getAttribute("post_msg"));
	System.out.println("System.out.println���� ����� �� : " + msg1);
	out.println("out.println���� ����� �� : " + msg1);
%>
</body>
</html>