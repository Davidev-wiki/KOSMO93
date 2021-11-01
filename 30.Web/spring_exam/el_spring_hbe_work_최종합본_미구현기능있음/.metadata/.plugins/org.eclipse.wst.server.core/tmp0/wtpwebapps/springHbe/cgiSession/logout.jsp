<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="a.b.c.com.cgi.session.K_Session"%>

<% request.setCharacterEncoding("UTF-8");%>

<%
	K_Session kSession = null;
	kSession = new K_Session();

	String kID = kSession.getSession(request);
	out.println(kID);
	boolean cFlag = false;
	
	if (kID !=null){
		cFlag = kSession.killSession(request);
		out.println( " session out ");	
	}	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 보기</title>
</head>
<body>
<br>
<p>
로그인정보
<hr>

<a href="/springHbe/cgiSession/showInfo.jsp">로그인 정보 보러가기.</a>
</body>
</html>