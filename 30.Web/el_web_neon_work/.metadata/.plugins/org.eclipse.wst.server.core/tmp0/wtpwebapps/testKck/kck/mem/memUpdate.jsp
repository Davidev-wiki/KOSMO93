<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원정보 수정</title>
</head>
<body>
<h3>회원정보 수정</h3>
<hr>
<%
	Object obj = request.getAttribute("bUpdate");
	if(obj == null) return;
	
	boolean bool = ((Boolean)obj).booleanValue();
	
	if(bool){
		System.out.println("수정 성공했어요! : " + bool);
%>
<Script>
		location.href="/testKck/mem?ISUD_TYPE=SALL";
</Script>
<%
	}else{
	
	}
%>
</body>
</html>