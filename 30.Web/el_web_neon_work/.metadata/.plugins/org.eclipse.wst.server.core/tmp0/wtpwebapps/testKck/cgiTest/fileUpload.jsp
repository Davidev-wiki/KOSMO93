<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=EUC-KR">
<title>fileUpload.jsp</title>
</head>
<body>
<%
	Object obj = request.getAttribute("aList");
	if (obj == null) return;
	
	ArrayList<String> aList = (ArrayList<String>)obj;
	int i=0;
	if (aList !=null && aList.size() > 0){
		for (; i < aList.size(); i++){
			out.println(">>> : " + aList.get(i) + "<br>");
		}		
	}
%>
<!-- 
하기 경로는 컨테이너에서 참조하는 .metadata/.. 내부에 있는 컨텍스트이다.
컨테이너는 참조하는 default경로가 이곳이다.
 
웹 서버에서 참조하는 경로는 IDE 좌측에서 볼 수 있는 컨텍스트 이다.
둘의 차이점을 잘 인지하자.
 -->
 
<table border="1">
 <tr>	
	<td><img src="/testKck/fileupload/<%= aList.get(2) %>"></td>
	<td><img src="/testKck/fileupload/<%= aList.get(2) %>"></td>
	<td><img src="/testKck/fileupload/<%= aList.get(2) %>"></td>
	<td><img src="/testKck/fileupload/<%= aList.get(2) %>"></td>
  </tr>
  <tr>
	<td><img src="/testKck/fileupload/<%= aList.get(3) %>"></td>
	<td><img src="/testKck/fileupload/<%= aList.get(3) %>"></td>
	<td><img src="/testKck/fileupload/<%= aList.get(3) %>"></td>
	<td><img src="/testKck/fileupload/<%= aList.get(3) %>"></td>
  </tr>
  <tr>
	<td><img src="/testKck/fileupload/<%= aList.get(2) %>"></td>
	<td><img src="/testKck/fileupload/<%= aList.get(2) %>"></td>
	<td><img src="/testKck/fileupload/<%= aList.get(2) %>"></td>
	<td><img src="/testKck/fileupload/<%= aList.get(2) %>"></td>
  </tr>
   <tr>
	<td><img src="/testKck/fileupload/<%= aList.get(3) %>"></td>
	<td><img src="/testKck/fileupload/<%= aList.get(3) %>"></td>
	<td><img src="/testKck/fileupload/<%= aList.get(3) %>"></td>
	<td><img src="/testKck/fileupload/<%= aList.get(3) %>"></td>
  </tr>
</table>

</body>
</html>