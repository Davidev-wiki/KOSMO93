<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="a.b.c.com.cgi.mail.GoogleMailSend"%>

<%
	String sendMailSubject = request.getParameter("sendMailSubject");
	String sendMail = request.getParameter("sendMail");
	String sendPw = request.getParameter("sendPw");
	String receiveMail = request.getParameter("receiveMail");
	String content = request.getParameter("content");
	
	System.out.println("request.getParameter로 받아온 메일 제목(sendMailSubject) >>> : " + sendMailSubject);
	System.out.println("request.getParameter로 받아온 보내는 메일(sendMail) >>> : " + sendMail);
	System.out.println("request.getParameter로 받아온 비밀번호(sendPw) >>> : " + sendPw);
	System.out.println("request.getParameter로 받아온 받는 메일(receiveMail) >>> : " + receiveMail);
	System.out.println("request.getParameter로 받아온 메일 내용(content) >>> : " + content);
	
	GoogleMailSend gms = new GoogleMailSend();
	gms.googleMailSend(sendMailSubject, sendMail, sendPw, receiveMail, content);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메일 보내기 버튼을 눌렀을 때 나오는 임시 페이지</title>
</head>
<body>
<h1>메일 잘 받았습니다~^^</h1>
<hr>
</body>
</html>