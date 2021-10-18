<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인 입력 화면</title>
<style type="text/css">
	div{
		font: 12px "굴림";
	}
</style>
</head>
<body>
<div align="center" class="body">
<h3>로그인 입력 화면</h3>
<form:form commandName="userVO" method="POST" action="loginData.h">
<table width="250" border="1">
	<tr>
		<th>아 이 디 </th>
		<td><form:input path="m_uid" /></td>
	</tr>
	<tr>
		<th>비밀번호 </th>
		<td><form:password path="m_pwd" /></td>
	</tr>
	<tr>						
		<td colspan="2" align="center">
		<input type="submit" value="로그인" />
	</td>
	</tr>
</table>
</form:form>
</div>
</body>
</html>