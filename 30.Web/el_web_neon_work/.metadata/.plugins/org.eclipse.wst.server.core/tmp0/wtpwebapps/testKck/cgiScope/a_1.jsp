<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>a_1.jsp</title>
</head>
<body>
<h3>a_1.jsp</h3>
<%= new Date() %>
<hr>
<%
	// getParameter : ServletRequest.getParameter() �Լ��̴�.
	// ������ �Լ��� �̿��� ������ �´�.
	String mid = request.getParameter("mid");
	String mpw = request.getParameter("mpw");
	
	out.println("mid : " + mid);
	out.println("mpw : " + mpw);

	System.out.println("mid�� sysout�� : " + mid);
	System.out.println("mpw�� sysout�� : " + mpw);	
%>
<script>
	location.href="testKck/cgiScope/a_2.jsp?mid="<%= mid %>+"&mpw="+<%=mpw%>;
</script>
<form action="/testKck/cgiScope/a_2.jsp" method="GET">
	���̵� :<input type="text" name="mid" value="<%= mid%>"><br>
	��� : <input type="text" name="mpw" value="<%= mpw %>"><br>
			<input type="submit" value="����">
</form>
</body>
</html>