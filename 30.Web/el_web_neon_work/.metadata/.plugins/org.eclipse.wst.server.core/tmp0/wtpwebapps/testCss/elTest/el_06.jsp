<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="a.b.c.com.common.EL_MemberVO" %>
<%@ page import="java.util.ArrayList" %>
<%
	// 'study' ��� �̸��� �ڹٽ�ũ��Ʈ ����Ʈ ��ü�� ��û�� ����
	String[] study = {"java", "view", "SQL", "Servlet/JSP/SPRING", "Android", "IoT", "Project"};
	request.setAttribute("study", study);

	
	// 'list' ��� �̸��� �迭�� ��û�� ����
	ArrayList<String> list = new ArrayList<String>();
	
	list.add("Orange");
	list.add("MangGo");
	list.add("WaterMelon");
	list.add("StrawBerry");
	list.add("apple");
	request.setAttribute("list", list);
	
	
	// Value Object ��ü 'mvo'�� ��û�� ����
	EL_MemberVO mvo = new EL_MemberVO();
	mvo.setIrum("������");
	mvo.setId("David");
	mvo.setPw("1234");
	mvo.setAge(34);
	mvo.setAddr("��õ�� ������");
	mvo.setTel("010-1111-2222");
	request.setAttribute("mvo", mvo);
	
	
	// ��üŸ�� �迭 'mlist'�� ��û�� ����
	ArrayList<EL_MemberVO> mlist = new ArrayList<>();
	mlist.add(new EL_MemberVO("ȫ�浿", "hong", "1234", 11, "�����", "010-1111-1111"));
	mlist.add(new EL_MemberVO("ȫ�浿", "hong", "1234", 11, "�����", "010-1111-1111"));
	mlist.add(new EL_MemberVO("ȫ�浿", "hong", "1234", 11, "�����", "010-1111-1111"));
	mlist.add(new EL_MemberVO("ȫ�浿", "hong", "1234", 11, "�����", "010-1111-1111"));
	mlist.add(new EL_MemberVO("ȫ�浿", "hong", "1234", 11, "�����", "010-1111-1111"));
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