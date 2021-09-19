<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!--  
	- page : page directive ����
	- contentType : ���� jsp ������ ���� ���¿� ���ڵ� ����.
	- text/html : ���� �� �������� ������ html�̴�.
	- MIME : Multipurpose Internet Mail Extensions : ���� ������ ���� ���ͳ� ǥ�� ����.
		         ������ ����, ���ڵ� ������ ǥ���
	- charset="EUC-KR" : ���� jsp �������� ���ڵ� ������ ��Ÿ����.
	           html, css, jsp �� ���� ���� ���ڵ��� ������ �Ѵ�.
-->


<!-- jsp ���Ͽ� java API(��ü) �ҷ����� -->
<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jsp Tags</title>
</head>
<body>
<h3> JSP tags(element) ����</h3>
<hr>
<%-- jsp �ּ� : �� ������(Ŭ���̾�Ʈ)�� �Ѿ�� �ʰ�, ���������� ���δ�. --%>
<!-- ��ũ��Ʋ�� ���(tag, element) -->
<%
	out.println("����� ��ũ��Ʋ�� �����̴�. <br>");
	out.println("���⿡ �ڹ� �ڵ带 �����Ѵ�. <br>");
	out.println("1. jsp ������ ������Ʈ : request, response <br>");
	out.println("2. Servlet �ڵ� <br>");
	out.println("3. java �ڵ� <br>");
	out.println("4. ���α׷� ���� ����� Ŭ���̾�Ʈ�� �����Ѵ�. <br>");
	
	out.println(new Date() + "<br>");
	
%>
<!-- ǥ���� ���(tag, element) -->
<%= "����� ǥ���� �����̴�." %><br>
<%= "�������� ����ϴ� �����̴�." %><br>
<%= "��ũ��Ʋ�� �������� ����ϴ� out.println()�� ���� �����̴�." %><br>
<%= new Date() %><br>

<!-- ��Ŭ��� ��Ƽ�� ���(tag, element) ���� �ҷ�����.(�������, ���� �������� footer �뵵�� ����Ѵ�.) -->
<%@ include file="testJsp.jsp" %>
</body>
</html>