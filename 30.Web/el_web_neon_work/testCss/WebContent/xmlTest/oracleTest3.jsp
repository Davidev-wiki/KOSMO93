<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="a.b.c.com.common.CommonDBConn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>OracleTest</title>
</head>
<body>
<!-- 
	JNDI InitalContext
	JNDI : Java Naming and Directory Interface	
 -->
<h3>
	JNDI InitalContext <br>
	JNDI : Java Naming and Directory Interface   
</h3>
<hr>
<%	


	/*  
	
		oracleTest.jsp ����  3�ٷ� �� �ڵ�.
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) envCtx.lookup("jdbc/Oracle11g_orclKOSMO00");

		oracleTest2.jsp ����  2�ٷ� �� �ڵ�.
		Context context = new InitialContext();
		DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g_orclKOSMO00");
	
		������ �ҽ��� �ڹٿ��� �������� ������ 
		��������� �ڿ��� �и��� �� �� �ִ�.
		
	*/



	Connection conn = CommonDBConn.getConnection(); 
	PreparedStatement stmt = conn.prepareStatement("SELECT * FROM EMP");
	ResultSet rsRs = stmt.executeQuery();
	
	while (rsRs.next()){
		out.println(rsRs.getString(1) + " ");
		out.println(rsRs.getString(2) + " ");
		out.println(rsRs.getString(3) + " ");
		out.println(rsRs.getString(4) + " ");
		out.println(rsRs.getString(5) + " ");
		out.println(rsRs.getString(6) + " ");
		out.println(rsRs.getString(7) + " ");
		out.println(rsRs.getString(8) + " <br>");
	}
%>

</body>
</html>