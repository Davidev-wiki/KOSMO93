<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%
	String id = request.getParameter("id");
	System.out.println("jQuery Id Check ����  id : " + id);
	
	// t������ ������ �ʱ�ȭ : �׳� true �����ϰ� �; �� �ڵ� ����.
	int idNcnt = 0;
	boolean bool = false;
	
	if(idNcnt == 0){
		bool = true;
	} else {
		
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Ajax1 JSP</title>
</head>
<body>
	<?xml version='1.0' encoding='UTF-8'?>
	<login>
		<result><%= bool %></result>
	</login>
</body>
</html>