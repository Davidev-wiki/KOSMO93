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
				"id" : $('#id').val(),	// data �� ���� ��Ʈ�� 				
			},
			success : function (resData){
				alert("���� ������ >>> : " + resData);
				$('#ajaxResData').html("ȭ�鿡 ���� ������ ��� : "  + resData);
				console.log("�ֿܼ� ���� ������ ��� : " + resData);
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
		<label>���̵�</label><input name="id" id="id">
		<input id="button" type="button" value="��ư">
	</form>
	<div id="ajaxResData">���ϵǴ� �������Դϴ�!</div>
</body>
</html>