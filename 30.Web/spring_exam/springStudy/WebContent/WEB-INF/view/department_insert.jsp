<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="a.b.c.com.vo.DeptVO" %>    
<html>
<head>
<meta charset="EUC-KR">
<title>학과 테이블</title>
<style type="text/css">
	.required{ color: red;}
</style>
</head>
<body>
<%
	Object obj = request.getAttribute("dvo");
	out.println("obj >>> : " + obj + "<br>");
	if (obj !=null){
		DeptVO dvo = (DeptVO)obj;
		out.println("dvo >>> : " + dvo + "<br>");
		out.println("dvo.getDeptid() >>> : " + dvo.getDeptid() + "<br>");
		out.println("dvo.getDeptname() >>> : " + dvo.getDeptname() + "<br>");
		out.println("dvo.getDepttel() >>> : " + dvo.getDepttel() + "<br>");
%>
		<%= dvo.getDeptid() %><br>
		<%= dvo.getDeptname() %><br>
		<%= dvo.getDepttel() %><br>
<% 		
	}
%>
<div>	
<table border="1">
<thead>
<tr>
<td colspan="2" align="center">
<h4>학과 테이블에 입력된 데이터입니다.</h4>
</td>
</tr>
</thead>
<tbody>
	<tr>
		<th width="100">
		<span class="required">*</span>학과코드
		</th>
		<td width="300">\${dvo.deptid} : ${dvo.deptid}</td>
	</tr>
	<tr>
		<th width="100">
		<span class="required">*</span>학과명
		</th>
		<td width="300">\${dvo.deptname} : ${dvo.deptname}</td>
	</tr>
	<tr>
		<th width="100">
		<span class="required">*</span>전화번호
		</th>
		<td width="300">\${dvo.depttel} : ${dvo.depttel}</td>
	</tr>			
</tbody>
</table>	
</div>
</body>
</html>