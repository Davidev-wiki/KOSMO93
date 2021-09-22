<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>글 수정</title>
</head>
<body>
<h3>글 수정</h3>
<hr>
<%
	Object obj = request.getAttribute("bUpdate");
	if(obj == null) return;
	
	boolean bool = ((Boolean)obj).booleanValue();
	
	// 가져온 데이터가 있으면 콘솔에 출력 후 전체조회 페이지로 보내기
	if(bool){
		System.out.println("수정 성공 bool : " + bool);
	
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