<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="a.b.c.com.cgi.mail.MailSend" %>

<%
	MailSend ms = new MailSend();
	ms.mailSend();
	out.println("COMPLETE");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test_mail.jsp</title>
</head>
<body>
<h1>main.jsp에서 보내기 버튼을 클릭하면 이동하는 페이지 입니다.</h1>
</body>
</html>