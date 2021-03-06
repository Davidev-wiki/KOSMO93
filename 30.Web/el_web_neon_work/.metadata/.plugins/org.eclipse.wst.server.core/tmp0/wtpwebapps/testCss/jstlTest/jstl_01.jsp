<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jstl_01 새로운 문법 테스트</title>
</head>
<body>
<h3>jstl_01</h3>
<hr>
1. 기본 프로그래밍 Tag(변수, 배열, if, for, switch-case 등) -> Core태그로 작성합니다~ <br/>
<%
	int num = 100;
%>

JAVA num : <%= num %><br/>


<%--JSTL 변수 선언하기 : <c:set ...> 을 사용한다 --%>

<c:set var="su1" value="200"/>
JSTL sul : ${su1}<br/>

<%--jAVA num 값을 JSTL su2에 할당 --%>
<c:set var="su2" value="<%=num %>"/>
JSTL su2 : ${su2}<br/>

<%--JSTL su1 값과 su2값을 더한 결과 값 : result --%>
<c:set var="result" value="${su1 + su2}" />
JSTL result : ${result}

</body>
</html>