<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="a.b.c.com.common.EL_MemberVO" %>
<%@ page import="java.util.ArrayList" %>
<%
	// 'study' 라는 이름의 자바스크립트 리스트 객체를 요청에 전달
	String[] study = {"java", "view", "SQL", "Servlet/JSP/SPRING", "Android", "IoT", "Project"};
	request.setAttribute("study", study);

	
	// 'list' 라는 이름의 배열을 요청에 전달
	ArrayList<String> list = new ArrayList<String>();
	
	list.add("Orange");
	list.add("MangGo");
	list.add("WaterMelon");
	list.add("StrawBerry");
	list.add("apple");
	request.setAttribute("list", list);
	
	
	// Value Object 객체 'mvo'를 요청에 전달
	EL_MemberVO mvo = new EL_MemberVO();
	mvo.setIrum("김찬기");
	mvo.setId("David");
	mvo.setPw("1234");
	mvo.setAge(34);
	mvo.setAddr("양천구 신정동");
	mvo.setTel("010-1111-2222");
	request.setAttribute("mvo", mvo);
	
	
	// 객체타입 배열 'mlist'를 요청에 전달
	ArrayList<EL_MemberVO> mlist = new ArrayList<>();
	mlist.add(new EL_MemberVO("홍길동", "hong", "1234", 11, "서울시", "010-1111-1111"));
	mlist.add(new EL_MemberVO("홍길동", "hong", "1234", 11, "서울시", "010-1111-1111"));
	mlist.add(new EL_MemberVO("홍길동", "hong", "1234", 11, "서울시", "010-1111-1111"));
	mlist.add(new EL_MemberVO("홍길동", "hong", "1234", 11, "서울시", "010-1111-1111"));
	mlist.add(new EL_MemberVO("홍길동", "hong", "1234", 11, "서울시", "010-1111-1111"));
	request.setAttribute("mlist", mlist);
	
%>
<jsp:forward page="el_06_1.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>el_06</title>
</head>
<body>
<h3>el_06</h3>
<hr>
</body>
</html>