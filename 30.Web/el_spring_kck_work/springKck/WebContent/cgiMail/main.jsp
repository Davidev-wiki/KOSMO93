<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main.jsp 입니다.</title>
<script type="text/javascript">
	function send_mail(){
		window.open("/springKck/cgiMail/test_mail.jsp", "", "width=370, height=360, resizable=no, scrollbars=no, status=no");
	}
</script>
</head>
<body>
	<div class="form-group" style="width:38%; margin: 10px auto;">
		<button type="button" class="btn btn-primary btn-lg btn-block" onclick="send_mail()">보내기</button>
		<!-- 보내기 버튼 클릭시 send_mail함수가 실행되며 팝업창으로 test_mail.jsp페이지를 띄워준다. -->
	</div>
</body>
</html>