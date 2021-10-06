<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Ajax Test</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	
	$('#button').click(function(){
		alert(">>>");
		
		$.ajax({					
			type : "POST",
			url : "/testCss/AjaxTest/data1.jsp",
			data : {					
				"id" : $('#id').val(),	// data 는 쿼리 스트링 				
			},
			success : function (resData){
				alert("리턴 데이터 >>> : " + resData);
				$('#ajaxResData').html("화면에 리턴 데이터 출력 : "  + resData);
				console.log("콘솔에 리턴 데이터 출력 : " + resData);
			},
			error : function (){
				alert("error");
			}	
		});
		
	});
});
</script>
</head>
<body>
	<form id="frm">
		<label>아이디</label><input name="id" id="id">
		<input id="button" type="button" value="버튼">
	</form>
	<div id="ajaxResData">리턴되는 데이터입니다!</div>
</body>
</html>