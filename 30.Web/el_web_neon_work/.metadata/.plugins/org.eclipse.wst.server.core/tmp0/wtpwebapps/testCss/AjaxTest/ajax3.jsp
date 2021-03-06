<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Ajax 3</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		$("#btn").click(function(){
			
			alert("버튼이 클릭되었습니다!");
			let urlReq = "/testCss/AjaxTest/data3.jsp";
			let dataReq = "json";
			
			$.ajax({
				url : urlReq,
				dataType : dataReq,
				success : toSuccess,
				error : toError
			});
			
			function toSuccess(data){
				alert("데이터 요청-리턴에 성공했습니다.");
				alert("가져온 data : " + data);
				console.log("가져온 data : " + data);
				alert("가져오자마자 data의 타입은? >> " + typeof(data));
				
				// JSON.stringify() javascript 객체 -> 문자열로 변경
				var results = JSON.stringify(data);
				alert("stringify()함수를 이용해 문자열로 바꾼 결과 값 results : " + results);
				console.log("results : " + results);
				alert("문자열로 변경한 data의 타입은? >> " + typeof(results));

				// JSON.parse() 문자열 -> javascript객체로 바꿔 초기화 (메모리에 로드까지)
				var v = JSON.parse(results);
				alert("v : " + v);
				console.log("v : " + v);
				alert("문자열에서 다시 자바스크립트 객체로 변경한 data의 타입은? >> " + typeof(v));
				
				// v.bools는 data3.jsp에서 해당 키의 값인 success를 의미하는듯
				console.log("v : " + v.bools); 
				alert("v.bools의 타입은? : " + typeof(v.bools));
				
				if (v.bools == "success"){
					alert("true");
					$("#readJson").html("화면에 리턴받은 데이터출력 : v.bools : " + v.bools);
				} else {
					alert("false");
				}
			}
			
			function toError(data){
				alert("데이터 요청-리턴에 실패했습니다.");
				console.log("에러가 발생했어요! : " + data.responseText);
			}
			
		});
		
	});
</script>
</head>
<body>
	<input type="button" id="btn" value="Click">
	<div id="readJson"></div>
</body>
</html>