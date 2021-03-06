<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>과목 테이블 팝업</title>
<style type="text/css">
	.required {color:red;}
	table {width:440px;}
	table th {width:120px; text-align:left;}
	input[type="text"] {width:300px;}
</style>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">

	$(document).ready(function(){
		
		var mode = "${mode}";
		if (mode == "insert"){
			$("#insertData").attr('disabled', false);
			$("#updateData").attr('disabled', true);
			$("#deleteData").attr('disabled', true);
		}else if (mode == "update"){
			$("#insertData").attr('disabled', true);
			$("#updateData").attr('disabled', false);
			$("#deleteData").attr('disabled', false);			
		}
		
		$("#insertData").click(function(){
			if(!validateForm()) return;
			if($("#no").val() == "") $("#no").val(0);
			if (confirm('등록을 진행할까요?')){
				$("#lessonForm").attr("action", "insertLesson.h");					
				$("#lessonForm").submit();
			}
		});
		
		$("#updateData").click(function(){
			if(!validateForm()) return;
			if (confirm('수정을 진행할까요?')){
				$("#lessonForm").attr("action", "updateLesson.h");			
				$("#lessonForm").submit();
			}
		});
		
		$("#deleteData").click(function(){
			if(!validateForm()) return;
			if (confirm('삭제를 진행할까요?')){
				$("#lessonForm").attr("action", "deleteLesson.h");	
				$("#lessonForm").submit();
			}
		});
		
		$("#closeWindow").click(function(){
			window.close();
		});
	});
	
	function validateForm() {
		 if($("#lnum").val().replace(/\s/g,"") == "") {
			 alert('과목코드를 입력해주세요.');
			 return false;
		 }
		 if($("#lname").val().replace(/\s/g,"") == "") {
			 alert('과목명을 입력해주세요.');
			 return false;
		 }
		 return true;
	}

</script>
</head>
<body>
<p></p>
<div>
<form id="lessonForm" name="lessonForm" method="GET">
<input type="hidden" id="no" name="no" value="${lessonVO.no}" />
<table board="1">
<thead>
	<tr>
		<td colspan="2" align="center">
			<h4>과목 테이블 팝업창 [Spring]</h4>
		</td>
	</tr>
</thead>
<tbody>	
	<tr>
		<th><span class="required">*</span>과목코드</th>
		<td>
			<input type="text" id="lnum" name="lnum" value="${lessonVO.lnum}">
		</td>
	</tr>
	<tr>
		<th><span class="required">*</span>과목명</th>
		<td>
			<input type="text" id="lname" name="lname" value="${lessonVO.lname}">
		</td>
	</tr>
</tbody>
</table>
</form>
</div>
<div>
<p></p>
<table boarder="0">
	<tr align="center">
		<td><input type="button" id="insertData" value="등록" /></td>
		<td><input type="button" id="updateData" value="수정" /></td>
		<td><input type="button" id="deleteData" value="삭제" /></td>
		<td><input type="button" id="closeWindow" value="닫기" /></td>						
	</tr>
</table>
</div>
</body>
</html>