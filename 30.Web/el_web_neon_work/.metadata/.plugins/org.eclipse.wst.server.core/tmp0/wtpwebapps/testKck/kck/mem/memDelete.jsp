<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원정보 삭제</title>
</head>
<body>
<h3>회원정보 삭제</h3>
<hr>
<%
	Object obj = request.getAttribute("bDelete");
	if(obj == null) return;
	
	boolean bool = ((Boolean)obj).booleanValue();
	
	if(bool){
		System.out.println("삭제 성공했어요! : " + bool);
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