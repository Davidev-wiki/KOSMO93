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
	//	html에서 전달 받은 값
		String empno = request.getParameter("empno"); // String empno = "7369";
		String ename = request.getParameter("ename"); // String ename = "SMITH";
		
		// DB에서 가져온 값
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
			out.println("log in 성공!");
		} else{
			out.println("log in 실패!");
		}
	%>
<%-- 여기서 에러났을 때 어떤걸 복사해서 어디에 넣어야 하는지 다시 체크 --%>

</body>
</html>