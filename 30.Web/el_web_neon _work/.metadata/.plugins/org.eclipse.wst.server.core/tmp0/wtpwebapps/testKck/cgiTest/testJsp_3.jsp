<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	//	html���� ���� ���� ��
		String empno = request.getParameter("empno"); // String empno = "7369";
		String ename = request.getParameter("ename"); // String ename = "SMITH";
		
		// DB���� ������ ��
		String _empno = "";
		String _ename = "";
	%>
	<%
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclKOSMO00", "scott","tiger");
		Statement stmt = conn.createStatement();
		ResultSet rsRs = stmt.executeQuery("SELECT * FROM EMP WHERE EMPNO = 00 AND ENAME = 'oo' ");
		while(rsRs.next()){
			_empno = rsRs.getString(1);
			_ename = rsRs.getString(2);
		}
		
		if(empno.equals(_empno) && ename.equals(_ename)){
			out.println("log in ����!");
		} else{
			out.println("log in ����!");
		}
	%>
<%-- ���⼭ �������� �� ��� �����ؼ� ��� �־�� �ϴ��� �ٽ� üũ --%>

</body>
</html>