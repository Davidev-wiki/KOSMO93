<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�� ����</title>
</head>
<body>
<h3>�� ����</h3>
<hr>
<%
	Object obj = request.getAttribute("bUpdate");
	if(obj == null) return;
	
	boolean bool = ((Boolean)obj).booleanValue();
	
	// ������ �����Ͱ� ������ �ֿܼ� ��� �� ��ü��ȸ �������� ������
	if(bool){
		System.out.println("���� ���� bool : " + bool);
	
%>
	<script>
		location.href="/testKck/mem?ISUD_TYPE=SALL";
	</script>
<%
	}else{
		
	}
%>
</body>
</html>