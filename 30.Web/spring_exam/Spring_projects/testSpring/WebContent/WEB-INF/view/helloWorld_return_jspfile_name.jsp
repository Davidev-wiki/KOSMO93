<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>helloWorld_return_jspfile_name</title>
</head>
<body>
<h3>Returned JSP</h3>
<hr>
<h3>${msg}</h3>
<%
	String message = String.valueOf(request.getAttribute("msg"));
	System.out.println("message : " + message);
	out.println("message : " + message);

%>
</body>
</html>