<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>dispatcherSelect.jsp</title>
</head>
<body>
<h3>dispatcherSelect.jsp</h3>
<hr>
<%
	Object obj = request.getAttribute("nCnt");
	if (obj==null) return;
	
	int nCnt = ((Integer)obj).intValue();
	
	if(1==nCnt){
		System.out.println("로그인 성공 !" + nCnt);
%>
	<script>
		alert("로그인 성공");
		location.href="\testKck\WebContent\cgiTest\testJsp_1.jsp";
	</script>		
<%		
	}
%>
</body>
</html>