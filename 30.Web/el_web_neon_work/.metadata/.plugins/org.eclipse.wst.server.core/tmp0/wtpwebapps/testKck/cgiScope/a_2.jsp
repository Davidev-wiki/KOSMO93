<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>a_2.jsp</title>
</head>
<body>
<h3>a_2.jsp</h3>
<hr>
<%--
		.jsp 파일 내 <% %> 블럭 안쪽에는 Servlet 문법을 구사할 수 있는 것 같다.
 --%>

<% 
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		
		out.println("mid : " + mid + "<br>");
		out.println("mpw : " + mpw + "<br>");
		
		System.out.println("mid 의 값 : " + mid);
		System.out.println("mpw 의 값 : " + mpw);
			
		if (true){
%>
<script>
		location.href="testKck/cgiScope/a_3.jsp?mid="<%= mid %>+"&mpw="+<%=mpw%>;
</script>
<%		}
		
%>
<hr>
</body>
</html>