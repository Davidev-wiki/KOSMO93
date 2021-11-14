<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="UTF-8">
<title>Login Form</title>
<style type="text/css">
	.div1 {
		background : thistle;
		border : 1px solid white;
		width : 300px;
		height : 300px;
		margin : 100px auto;
	}
	
</style>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	
	$(document).ready(function(){
		$("#mid").attr('placeholder', '아이디');
		$("#mpw").attr('placeholder', '비밀번호');
		
		$("#btn").click(function(){
			
			console.log("버튼이 클릭되었습니다!");
			
			$("#loginForm").attr({
				'action' : 'login.k',
				'method' : 'POST',
				'enctype' : 'application/x-www-form-urlencoded'
			}).submit();
			
		});
	});

</script>
</head>
<body>
<div class="div1">
<h1 align="center">Login Test</h1>
<hr>
<form name="loginForm" id="loginForm">
	<table border="1" align="center">
		<tr>
			<td><input type="text" name="mid" id="mid" style="width:200px;"></td>
		</tr>
		<tr>
			<td><input type="password" name="mpw" id="mpw" style="width:200px;"></td>
		</tr>
		<tr>
			<td><button type="button" id="btn" style="width:208px; background-color:lavender ;">로그인</button></td>
		</tr>
		<tr>
			<td align="center">
				<a href="idFindForm.k"><font size="2">아이디 찾기</font></a>
				&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;<a href="pwFindForm.k"><font size="2">비번 찾기</font></a>
			</td>
		</tr>		
	</table>
</form>
</div>
</body>
</html>