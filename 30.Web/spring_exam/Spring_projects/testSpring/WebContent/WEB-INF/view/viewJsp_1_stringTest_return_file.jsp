<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>viewJsp_1_stringTest_return_file</title>
</head>
<body>
<h3>Controller에서 mdata 받아오기 </h3>
<hr>
view 페이지에서 데이터 전달은 Model 인터페이스를 이용한다.
응답(출력)할 페이지는 return에 적힌 view페이지로 'mdata'를 가지고 이동한다!
<h3>${mdata }</h3>

<%
	String data = String.valueOf(request.getAttribute("mdata"));
	out.println("가져온 data : " + data);
	System.out.println("가져온 data : " + data);
%>
</body>
</html>