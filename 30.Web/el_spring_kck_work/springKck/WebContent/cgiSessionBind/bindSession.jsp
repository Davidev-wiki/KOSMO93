<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="a.b.c.com.cgi.session.*" %>

<% request.setCharacterEncoding("UTF-8"); %>
<%
	K_SessionManager kManager = K_SessionManager.getInstance();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 테스트</title>
</head>
<body>
	<h3>현재 접속자 수 : <%= kManager.getUserCount() %></h3>
	<hr>
<%
	if(kManager.isLogin(session.getId())) {
%>
		<%= kManager.getUserID(session.getId()) %> 님아 안녕?
		<br>
		<p>
		<a href="/springKck/cgiSessionBind/bindLogout.jsp">로그아웃</a>
<%
	} else {
%>
		<a href="/springKck/cgiSessionBind/bindLogin.html">로그인 하러가기</a>
<%
	}
%>
</body>
</html>