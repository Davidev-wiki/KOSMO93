<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������ ����</title>
</head>
<body>
<h3>ȸ������ ����</h3>
<hr>
<%
	Object obj = request.getAttribute("bDelete");
	if(obj == null) return;
	
	boolean bool = ((Boolean)obj).booleanValue();
	
	if(bool){
		System.out.println("���� �����߾��! : " + bool);
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