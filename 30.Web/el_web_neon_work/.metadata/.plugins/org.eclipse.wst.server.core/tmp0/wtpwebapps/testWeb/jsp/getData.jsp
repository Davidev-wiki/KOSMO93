<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>getData</title>
</head>
<body>
<% request.setCharacterEncoding("EUC-KR"); %>

<% 
	String mname = request.getParameter("mname");
	String maddr = request.getParameter("maddr");
	
	
	out.println("mname out.println ???? >>> : " + mname);
	out.println("maddr out.println ???? >>> : " + maddr);
	
	System.out.println("mname >>> : " + mname);
	System.out.println("maddr >>> : " + maddr);
%>
</body>
</html>