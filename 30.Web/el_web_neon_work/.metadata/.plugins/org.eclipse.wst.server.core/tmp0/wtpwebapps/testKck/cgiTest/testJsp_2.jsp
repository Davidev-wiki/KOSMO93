<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%--
	ojdbc6.jar ����̹���  �����Ѵ�.
	testKosmo/WebContent/WEB-INF/lib/ojdbc6.jar
	testKosmo ���ؽ�Ʈ(������Ʈ, ������, �۾� ���丮)���� �� ����ϼ��� ~~  
	Java Resourcer/src/ ~~
	WebContent/ ~~
--%>
	<% 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclKOSMO00", "scott", "tiger");
		Statement stmt = conn.createStatement();
		ResultSet rsRs = stmt.executeQuery("SELECT * FROM EMP");
		while(rsRs.next()){
			out.println(rsRs.getString(1) + " : ");
			out.println(rsRs.getString(2) + " : ");
			out.println(rsRs.getString(3) + " : ");
			out.println(rsRs.getString(4) + " : ");
			out.println(rsRs.getString(5) + " : ");
			out.println(rsRs.getString(6) + " : ");
			out.println(rsRs.getString(7) + " : ");
			out.println(rsRs.getString(8) + " <br> ");
		}
	%>
</body>
</html>