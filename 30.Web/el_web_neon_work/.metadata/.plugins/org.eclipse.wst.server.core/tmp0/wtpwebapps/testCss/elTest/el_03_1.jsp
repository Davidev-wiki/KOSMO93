<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>el_03_1</title>
</head>
<body>
<h3>el_03_1</h3>
<hr>
<%
	String irum = request.getParameter("irum");
	out.println("[스크립틀릿]<br/>");
	out.println("회원님의 이름은 " + irum + "입니다. <br/>");
	out.println(irum + "님이 키우고 싶은 애완동물은");
	
	// checkbox "animal" : getParameterValues 사용!
	String[] animal = request.getParameterValues("animal");
	if(animal != null) {
		for(int i=0; i < animal.length; i++) {
			if(i != animal.length -1){
				out.println(animal[i] + ",");
			} else {
				out.println(animal[i] +"입니다.<br/><br/>");
			}
		}
	} else {
		out.println("선택한 옵션이 없네요.<br/><br/>");	
	}
%>
[EL 문법]<br/>
회원님의 이름은 ${param.irum }님 입니다.<br/>
<br/>
${param.irum }님께서 키우고 싶은 애완동물은
${paramValues.animal[0] }
${paramValues.animal[1] }
${paramValues.animal[2] }
${paramValues.animal[3] }
${paramValues.animal[4] }
${paramValues.animal[5] }입니다.
</body>
</html>