<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>글 삭제</title>
</head>
<body>
<h3>글 삭제</h3>
<hr>
<%
	Object obj = request.getAttribute("nCnt");
	
	if (obj == null) return;
	
	int nCnt = ((Integer)obj).intValue();
	
	if (nCnt > 0){
		System.out.println("공지사항 삭제가 완료되었습니다!");
%>
		<script>
			location.href="/testKck/notice?ISUD_TYPE=SALL";
		</script>
<%
	} else {
		
	}
%>

</body>
</html>