<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%
	int sum = 0;
	for(int i = 1; i<=100; i++){
		sum += i;
	}
	
	pageContext.setAttribute("sum", sum); // 이게 넘어감
	
	request.setAttribute("sum",sum);
	RequestDispatcher rd = request.getRequestDispatcher("el_02_1.jsp"); // 페이지 호출
	rd.forward(request, response);

%>
<jsp:forward page="el_02_1.jsp" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>el_02</title>
	</head>
	<body>
		<h3>el_02</h3>
		<hr>
		JSP 출력 : <%=sum %><br/>
		EL 출력 : ${ sum }<br/>
		EL 출력 : $ { sum }<br/>
		<!-- \는 문자열 바꾸는 것 -->
		EL 출력 : \${ sum }<br/>
	</body>
</html>