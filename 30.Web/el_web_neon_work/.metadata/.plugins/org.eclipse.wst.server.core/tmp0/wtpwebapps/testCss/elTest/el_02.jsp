<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%
	int sum = 0;
	for(int i = 1; i<=100; i++){
		sum += i;
	}
	
	pageContext.setAttribute("sum", sum); // �̰� �Ѿ
	
	request.setAttribute("sum",sum);
	RequestDispatcher rd = request.getRequestDispatcher("el_02_1.jsp"); // ������ ȣ��
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
		JSP ��� : <%=sum %><br/>
		EL ��� : ${ sum }<br/>
		EL ��� : $ { sum }<br/>
		<!-- \�� ���ڿ� �ٲٴ� �� -->
		EL ��� : \${ sum }<br/>
	</body>
</html>