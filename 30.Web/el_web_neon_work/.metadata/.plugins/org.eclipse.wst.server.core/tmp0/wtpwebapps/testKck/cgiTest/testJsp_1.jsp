<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!--  
	- page : page directive 설명
	- contentType : 현재 jsp 문서의 문서 형태와 인코딩 설정.
	- text/html : 현재 이 페이지의 형식은 html이다.
	- MIME : Multipurpose Internet Mail Extensions : 전자 우편을 위한 인터넷 표준 포맷.
		         파일의 포맷, 인코딩 형식이 표기됨
	- charset="EUC-KR" : 현재 jsp 페이지의 인코딩 형식을 나타낸다.
	           html, css, jsp 등 각종 언어는 인코딩을 별개로 한다.
-->


<!-- jsp 파일에 java API(객체) 불러오기 -->
<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jsp Tags</title>
</head>
<body>
<h3> JSP tags(element) 사용법</h3>
<hr>
<%-- jsp 주석 : 웹 브라우저(클라이언트)로 넘어가지 않고, 서버에서만 보인다. --%>
<!-- 스크립틀릿 요소(tag, element) -->
<%
	out.println("여기는 스크립틀릿 영역이다. <br>");
	out.println("여기에 자바 코드를 구현한다. <br>");
	out.println("1. jsp 내장형 오브젝트 : request, response <br>");
	out.println("2. Servlet 코드 <br>");
	out.println("3. java 코드 <br>");
	out.println("4. 프로그램 실행 결과만 클라이언트로 리턴한다. <br>");
	
	out.println(new Date() + "<br>");
	
%>
<!-- 표현식 요소(tag, element) -->
<%= "여기는 표현식 영역이다." %><br>
<%= "브라우저에 출력하는 역할이다." %><br>
<%= "스크립틀릿 영역에서 사용하는 out.println()과 같은 역할이다." %><br>
<%= new Date() %><br>

<!-- 인클루드 디렉티브 요소(tag, element) 파일 불러오기.(정적기능, 메인 페이지의 footer 용도로 사용한다.) -->
<%@ include file="testJsp.jsp" %>
</body>
</html>