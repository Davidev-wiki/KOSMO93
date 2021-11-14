<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="a.b.c.com.cgi.session.*" %>

<!-- 1. request로 가져온 데이터의 인코딩 타입을 UTF-8로 설정 -->
<!-- 2. K_Session 클래스를 사용하기 위해 인스턴스 -->
<!--    그냥 위에 import해서 사용 가능한지 테스트해보기 -->
<!-- 3. 들어온 요청에 대한  -->

<%
	request.setCharacterEncoding("UTF-8");
	K_Session ks = K_Session.getInstance();
	String kID = ks.getSession(request);
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
<%
	System.out.println("String kID = ks.getSession(request); ===> " + kID);
	if (kID != null && kID.length() > 0) {
%>
	아이디 : <%= kID %><p><br>
	<a href="/springKck/sgiSession/logout.jsp">로그아웃 하기</a><br>
<%
	} else {
%>
	로그인 정보가 없습니다.<br>
	<a href="springKck/cgiSession/login.html"></a>
<%
	}
%>
</body>
</html>