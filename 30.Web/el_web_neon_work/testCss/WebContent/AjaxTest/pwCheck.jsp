<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ID CHECK</title>
</head>
<body>
<h3>ID CHECK</h3>	
<hr>
<hr>
<%	
	// Servlet에서 request.getAttribute() 를 이용해 
	// 데이터 가지고 오기
	Object obj = request.getAttribute("pwCheckVal");
	if (obj == null) return;
			
	String pwCheckVal = (String) obj;
	System.out.println("pwCheckVal : " + pwCheckVal);

%>
<?xml version='1.0' encoding='UTF-8'?>
<login>
	<result><%= pwCheckVal %></result>
</login>

</body>
</html>