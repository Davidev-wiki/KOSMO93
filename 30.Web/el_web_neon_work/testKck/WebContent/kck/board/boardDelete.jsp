<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�� ����</title>
</head>
<body>
	<h3>�� ����</h3>
	<hr>
	<%
		// ��Ʈ�ѷ����� ����� �̾����� ���� �� ���캸�� 
		Object obj = request.getAttribute("bDelete");
		if (obj == null)
			return;

		boolean bool = ((Boolean) obj).booleanValue();

		if (bool) {
			System.out.println("���� ���� bool : " + bool);
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