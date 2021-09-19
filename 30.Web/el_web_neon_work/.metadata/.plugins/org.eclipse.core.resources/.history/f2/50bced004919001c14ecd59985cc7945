<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원 정보 등록</title>
</head>
<body>
<h3>회원 등록</h3>
<hr>
<%-- Logic 
	 : DB에 데이터 등록을 시도하고 받아온 bool 타입 결과
	   'bInsert'의 여부에 따라 분기.
	     등록 성공 -> 전체 조회 페이지로 이동
	     등록 실패 -> 
 --%>
<%

	Object obj = request.getAttribute("bInsert");
	
	if (obj == null) return;
	
	boolean bool = ((Boolean)obj).booleanValue();
	
	if (bool){
		
		System.out.println("회원 정보 등록이 완료되었습니다! : " + bool);	 
	
%>
<script>
		location.href="/testKck/mem?ISUD_TYPE=SALL";
</script>
<% 
	}else{
		
	}
%>
</body>
</html>