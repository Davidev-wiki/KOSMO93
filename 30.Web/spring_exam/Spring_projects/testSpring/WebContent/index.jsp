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

		// GET ���
		$(document).on("click", "#getbtn", function() {
			alert("getbtn >>> : ���� ");

			$("#methodForm").attr({
				"action" : "helloWorld_get.kck",
				"method" : "GET",
				"enctype" : "application/x-www-form-urlencoded"
			}).submit();
		});

		// POST ���
		$(document).on("click", "#postbtn", function() {
			alert("postbtn >>> : ���� ");

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
	<a href="helloWorld_Controller_find.kck">HelloWorld ����</a>
	<br>
	<a href="helloWorld_get.kck">HelloWorld GET Method ����</a>
	<br>
	<a href="helloWorld_post.kck">HelloWorld POST Method ����</a>
	<br>
	<form name="methodForm" id="methodForm">
		<button type="button" id="getbtn">GET</button>
		<button type="button" id="postbtn">POST</button>
	</form>
	<hr>
	<a href="viewJsp_1_stringTest_find.kck">viewJsp_1_stringTest_find.kck
		����</a>
	<br>
	<a href="viewJsp_2_modelandview_find.kck">viewJsp_2_modelandview_find.kck ����</a><br>
	<a href="viewJsp_3_voidTest_find.kck">viewJsp_3_voidTest_find.kck ����</a><br>
	<hr>
	<a href="formdata_find.kck">FORM DATA ����</a>
	<hr>
	<a href="autowired_test.kck">������̾�� ���� (���������� : DI)</a>
	<hr>
	<a href="autowired_test_field.kck">������̾�� ����_GET (���������� : DI)</a>
</body>
</html>