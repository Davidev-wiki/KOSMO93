<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Ajax</title>

<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	
	$(document).ready(function(){
		
		alert('��Ż ���۽�~ �����轺!');
		
		
		var url = "/testCss/AjaxTest/data0.jsp";
		
		$.get(url, 
			  function(data){
			  alert("Ajax ��� ���� ��� >>> : " + data);
			  console.log("Ajax ��� ���� ��� >>> : " + data);
			  $('#testData').html("ȭ�鿡 ���� ������ ��� : "  + data);
			  $('#testData').text("ȭ�鿡 ���� ������ ��� : "  + data); // �� �ٿ� �ִ� �ڵ带 �����.
			  $('#testData2').html("ȭ�鿡 ���� ������ ��� : "  + data); 

		});
		
		
			/*	
			���� �ȿ��� request, response�� �̷������. ������ ���� �ڵ尡 ����.
			�̰� Ajax�̴�.
			
				$.get(  url, 
						function(returnData){
							alert();
							console.log();
							$('#idvalue').html(data);
						}
				);
			*/
	});
	
</script>
</head>
<body>
	<div id="testData"></div>
	<div id="testData2"></div>
	
</body>
</html>