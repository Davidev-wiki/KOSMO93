<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="a.b.c.com.cgi.session.K_Session"%>


<% request.setCharacterEncoding("UTF-8");%>
<%
	K_Session kSession = null;
	kSession = new K_Session();

	String kID = kSession.getSession(request);	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 보기</title>
</head>
<body>
로그인정보
<hr>
아이디 : <%= kID %><p><br>

<a href="/springHbe/cgiSession/logout.jsp">로그아웃</a><br>
<a href="/springHbe/cgiSession/login.html">로그인 하러가기</a>
</body>
</html>