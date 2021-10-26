<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RBOARD : 댓글</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	alert("현재 기능 미구현 상태입니다.");
</script>
</head>
<body>
RBOARD : 댓글
<hr>
<!-- scriptlet -->
<% request.setCharacterEncoding("UTF-8"); %>
<%
	String sbnum = request.getParameter("sbnum");
	System.out.println("rboardForm.sbnum >>> : " + sbnum);
%>

<div id="rbwriterdiv">
<form name="rboardForm" id="rboardForm">
<table>
<tr>
	<td>작성자</td>
	<td>
		<input type="text" name="rsbname" id="rsbname"/>
		<input type="hidden" name="sbnum" id="sbnum" value="<%=sbnum %>">
		<input type="hidden" name="rsbnum" id="rsbnum">
		<input type="button" value="저장하기" id="I">
	</td>
</tr>
<tr>
	<td>덧글 내용</td>
	<td>
		<textarea name="rsbcontent" id="rsbcontent" rows="5" cols="50" style="resize: none"></textarea>
		<div><span class="bytes">0</span>bytes</div>
	</td>
</tr>
</table>
<hr>

<ul name="rboardlist" id="rboaradlist">
	 <!-- 여기(<ul>태그 내부)에 동적 생성 요소가 만들어집니다!! -->
</ul>

</form>
</div>
</body>
</html>