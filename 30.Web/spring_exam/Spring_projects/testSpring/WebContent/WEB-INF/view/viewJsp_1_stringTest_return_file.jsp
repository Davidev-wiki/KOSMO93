<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>viewJsp_1_stringTest_return_file</title>
</head>
<body>
<h3>Controller���� mdata �޾ƿ��� </h3>
<hr>
view ���������� ������ ������ Model �������̽��� �̿��Ѵ�.
����(���)�� �������� return�� ���� view�������� 'mdata'�� ������ �̵��Ѵ�!
<h3>${mdata }</h3>

<%
	String data = String.valueOf(request.getAttribute("mdata"));
	out.println("������ data : " + data);
	System.out.println("������ data : " + data);
%>
</body>
</html>