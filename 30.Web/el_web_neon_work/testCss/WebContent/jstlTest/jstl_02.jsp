<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jstl_02 데이터보내기</title>
</head>
<body>
<h3>jstl_02</h3>
<hr>
<c:set var="code" value="abc001" scope="page" />
<c:set var="name" value="computer" scope="request" />
<c:set var="price" value="500000" scope="session"/>
<c:set var="option" value="high" scope="application"/>
<jsp:forward page="jstl_02_1.jsp" />
</body>
</html>