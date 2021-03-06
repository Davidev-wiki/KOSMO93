<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Spring Hello</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		// alert("ready >>> : ");

		// GET 방식
		$(document).on("click", "#getbtn", function() {
			alert("getbtn >>> : 진입 ");

			$("#methodForm").attr({
				"action" : "helloWorld_get.kck",
				"method" : "GET",
				"enctype" : "application/x-www-form-urlencoded"
			}).submit();
		});

		// POST 방식
		$(document).on("click", "#postbtn", function() {
			alert("postbtn >>> : 진입 ");

			$("#methodForm").attr({
				"action" : "helloWorld_post.kck",
				"method" : "POST",
				"enctype" : "application/x-www-form-urlencoded"
			}).submit();
		});
	})
</script>
</head>
<body>
	<h3>Spring Hello</h3>
	<hr>
	<a href="helloWorld_Controller_find.kck">HelloWorld 실행</a>
	<br>
	<a href="helloWorld_get.kck">HelloWorld GET Method 실행</a>
	<br>
	<a href="helloWorld_post.kck">HelloWorld POST Method 실행</a>
	<br>
	<form name="methodForm" id="methodForm">
		<button type="button" id="getbtn">GET</button>
		<button type="button" id="postbtn">POST</button>
	</form>
	<hr>
	<a href="viewJsp_1_stringTest_find.kck">viewJsp_1_stringTest_find.kck
		실행</a>
	<br>
	<a href="viewJsp_2_modelandview_find.kck">viewJsp_2_modelandview_find.kck 실행</a><br>
	<a href="viewJsp_3_voidTest_find.kck">viewJsp_3_voidTest_find.kck 실행</a><br>
	<hr>
	<a href="formdata_find.kck">FORM DATA 실행</a>
	<hr>
	<a href="autowired_test.kck">오토와이어드 실행 (의존성주입 : DI)</a>
	<hr>
	<a href="autowired_test_field.kck">오토와이어드 실행_GET (의존성주입 : DI)</a>
</body>
</html>