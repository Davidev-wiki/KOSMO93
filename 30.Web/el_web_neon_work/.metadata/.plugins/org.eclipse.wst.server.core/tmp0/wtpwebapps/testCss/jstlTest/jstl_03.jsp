<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jstl_03 if문 만들어보기</title>
</head>
<body>
<h3>jstl_03</h3>
<hr>
<!-- jstl_03.jsp?num1=100&num2=50 -->
첫 번째 수 : ${param.num1 }<br>
두 번째 수 : ${param.num2 }<br>

<%--<c:if test="조건식">실행문</c:if> --%>

최대값 : <c:if test="param.num1 - param.num2 > 0">${param.num1 }</c:if>
		<c:if test="param.num1 - param.num2 < 0">${param.num2 }</c:if>

최소값 : <c:if test="${param.num1 - param.num2 > 0}">${param.num2 }</c:if>
		<c:if test="${param.num1 - param.num2 < 0}">${param.num1 }</c:if>
</body>
</html>