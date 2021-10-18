<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<html>
<head>
<meta charset="EUC-KR">
<title>로그인 확인 화면</title>
<style type="text/css">
	div{
		font: 12px "굴림";
	}
</style>
</head>
<body>
<div align="center" class="body">
<h3>로그인  입력 데이터</h3>
<form:form commnadName="userVO" method="POST">
<table width="250" border="1">
	<tr>
		<th>아 이 디 </th>
		<td align="center">${userVO.m_uid}</td>
	</tr>
	<tr>
		<th>비밀번호 </th>
		<td align="center">${userVO.m_pwd}</td>
	</tr>					
</table>
</form:form>
</div>
</body>
</html>