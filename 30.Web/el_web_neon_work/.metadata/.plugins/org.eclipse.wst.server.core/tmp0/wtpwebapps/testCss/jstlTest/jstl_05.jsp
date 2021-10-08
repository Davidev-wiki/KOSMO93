<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jstl_05 for �ݺ���</title>
</head>
<body>
<h3>jstl_05</h3>
<hr>
<%--

Java �ݺ��� : for, while, do-while
Jstl �ݺ��� : <c:forEach>���๮</c:forEach>

<c:forEach var="�ݺ�������" begin="�ʱⰪ" end="������" step="������"> ���๮ </c:forEach>

 --%>
JAVA �ݺ���(for)<br/>
<%
	for(int i=0; i<=7; i++){
		out.println("<font size=" + i +">�ȳ��ϼ���</font><br />");
		
	}
%>
<br/><br/>

JSTL �ݺ��� (c:forEach) step="1"�̶� ������<br />
<c:forEach var="i" begin="1" end="7"><!-- step�� ���� 1�̶��(=�������� 1) ���� ���� -->
	<font size="${i }">�ݰ����ϴ�</font><br/>
</c:forEach>
<br/><br/>
JSTL �ݺ��� (c:forEach) step="2"<br />
<c:forEach var="i" begin="1" end="7" step="2"> <!-- step�� ���� 1�̶�� ���������ϴ�. -->
	<font size="${i }" >�ݰ����ϴ�</font><br />
</c:forEach>
</body>
</html>