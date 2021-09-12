<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
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
		// 컨트롤러에서 여기로 이어지는 로직 잘 살펴보기 
		Object obj = request.getAttribute("bDelete");
		if (obj == null)
			return;

		boolean bool = ((Boolean) obj).booleanValue();

		if (bool) {
			System.out.println("삭제 성공 bool : " + bool);
	%>
	<script>
		location.href = "/testKck/board?ISUD_TYPE=SALL";
	</script>
	<%
		} else {

		}
	%>
</body>
</html>