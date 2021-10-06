<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%
	String id = request.getParameter("id");
	System.out.println("jQuery Id Check : Id : " + id);
	
	int idNcnt = 0;
	boolean bool = false;
	
	if (idNcnt == 0) {
		out.println("{\"bools\":\"success\"}");
	} else {
		out.println("{\"bools\":\"fail\"}");
	}
	
%>
