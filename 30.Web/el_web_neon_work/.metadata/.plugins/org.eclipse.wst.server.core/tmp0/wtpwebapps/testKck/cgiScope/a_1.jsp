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
	// getParameter : ServletRequest.getParameter() 함수이다.
	// 서블릿의 함수를 이용해 가지고 온다.
	String mid = request.getParameter("mid");
	String mpw = request.getParameter("mpw");
	
	out.println("mid : " + mid);
	out.println("mpw : " + mpw);

	System.out.println("mid의 sysout값 : " + mid);
	System.out.println("mpw의 sysout값 : " + mpw);	
%>
<script>
	location.href="testKck/cgiScope/a_2.jsp?mid="<%= mid %>+"&mpw="+<%=mpw%>;
</script>
<form action="/testKck/cgiScope/a_2.jsp" method="GET">
	아이디 :<input type="text" name="mid" value="<%= mid%>"><br>
	비번 : <input type="text" name="mpw" value="<%= mpw %>"><br>
			<input type="submit" value="제출">
</form>
</body>
</html>