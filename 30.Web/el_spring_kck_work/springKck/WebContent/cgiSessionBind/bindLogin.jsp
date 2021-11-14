<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>
<%@ page import="javax.sql.DataSource" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="a.b.c.com.cgi.session.K_SessionManager"%>
<% request.setCharacterEncoding("UTF-8"); %>
<%
	String mid = request.getParameter("mid");
	String mpw = request.getParameter("mpw");
	System.out.println(mid);
	System.out.println(mpw);
	
	int nCnt = 0;
	boolean result = false;
	
	Context context = new InitialContext();
	DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g_orclKOSMO00");
	Connection conn = dataSource.getConnection();
	String sqls = "SELECT COUNT(A.MID) NCNT FROM SPRING_MEMBER A WHERE A.MID = ? AND A.MPW = ?";
	PreparedStatement pstmt = conn.prepareStatement(sqls);
	pstmt.setString(1, mid);
	pstmt.setString(2, mpw);
	ResultSet rsRs = pstmt.executeQuery();
	
	System.out.println("ResultSet rsRs는 연결에 필요한 데이터 정보와 결과 값이 저장된 메모리 주소가  나오는 듯 하다 >>> : ");
	
	while (rsRs.next()){
		nCnt = rsRs.getInt(1);
	}
	
	if (nCnt == 1) result = true;
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션정보 처리하기</title>
</head>
<body>
<%
	K_SessionManager kManager = K_SessionManager.getInstance();

	if (result) {
		out.println("result >>> : " + result);
		if (!kManager.isUsing(mid)){
			kManager.setSession(session, mid);	
%>
			<br>
			<hr>
			<a href="/springKck/cgiSessionBind/bindSession.jsp">로그인 정보 보러가기</a>
<%
		} else {
%>
			<script>
				alert("이미 로그인 중입니다!");
				location.href="/springKck/cgiSessionBind/bindSession.jsp";
			</script>
<%
		}
	} else {
		out.println("아이디 / 패스워드를 확인해주세요.");
	}
%>
</body>
</html>