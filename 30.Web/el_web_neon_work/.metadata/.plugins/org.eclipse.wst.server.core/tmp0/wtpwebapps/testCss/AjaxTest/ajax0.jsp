<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Ajax</title>

<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	
	$(document).ready(function(){
		
		alert('멘탈 아작스~ 에이잭스!');
		
		
		var url = "/testCss/AjaxTest/data0.jsp";
		
		$.get(url, 
			  function(data){
			  alert("Ajax 통신 성공 결과 >>> : " + data);
			  console.log("Ajax 통신 성공 결과 >>> : " + data);
			  $('#testData').html("화면에 리턴 데이터 출력 : "  + data);
			  $('#testData').text("화면에 리턴 데이터 출력 : "  + data); // 윗 줄에 있는 코드를 덮어쓴다.
			  $('#testData2').html("화면에 리턴 데이터 출력 : "  + data); 

		});
		
		
			/*	
			여기 안에서 request, response가 이루어진다. 별도의 실행 코드가 없다.
			이게 Ajax이다.
			
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