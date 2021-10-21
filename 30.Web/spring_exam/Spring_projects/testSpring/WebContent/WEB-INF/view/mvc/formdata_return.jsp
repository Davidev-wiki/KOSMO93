<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Form data View</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	
	$(document).ready(function(){
		
		alert("jQuery start!");
		console.log("jQuery 진입");
		
		// 버튼 1(getbtn)눌렀을 때 ->  컨트롤러에 RequestMapping의 밸류로 
		// action을 통해 값 보내기 : formdata_get_servlet.jsp로 보내기
		$(document).on("click", "#getbtn", function(){
			alert("GET 버튼 눌림");
			console.log("GET 버튼 눌림");
			$("#formData").attr({
				"action" : "formdata_get_servlet.kck",
				"method" : "GET",
				"enctype" : "application/x-www-form-urlencoded"
			
			}).submit();
		});
		// 버튼 2(get_spring_btn)눌렀을 때 -> mvc/formdata_get_spring_servlet.jsp로 보내기
		
		$("#get_spring_btn").click(function(){
			alert("get_spring 버튼 눌림");
			console.log("get_spring 버튼 눌림");
			$("#formData").attr({
				"action" : "formdata_get_spring_servlet.kck",
				"method" : "GET",
				"enctype" : "application/x-www-form-urlencoded"
			
			}).submit();
			
		});
		
		// 버튼 3(post_spring_btn)눌렀을 때 -> mvc/formdata_post_spring_servlet.jsp로 보내기
		$("#post_spring_btn").click(function(){
			alert("post_spring_버튼 눌림");
			console.log("post_spring_버튼 눌림");
			$("#formData").attr({
				"action" : "formdata_post_spring.kck",
				"method" : "POST",
				"enctype" : "application/x-www-form-urlencoded"
			
			}).submit();
			
		});
		
		// 버튼 4(post_spring_btn_111)눌렀을 때- > mvc/formdata_post_spring111_servlet.jsp로 보내기
		$("#post_spring_btn_111").click(function(){
			alert("post_spring_btn_111버튼 눌림");
			console.log("post_spring_btn_111버튼 눌림");
			$("#formData").attr({
				"action" : "formdata_post_valueobject.kck",
				"method" : "POST",
				"enctype" : "application/x-www-form-urlencoded"
			
			}).submit();
		});
	});

</script>
</head>
<body>
<h3 align="center">FORM DATA</h3>
<hr>
<form name="formData" id="formData">

	<table border="1" align="center">
	
		<tr>
			<td>회원번호 : </td>
			<td><input type="text" name="datanum" id="datanum"></td>
		</tr>
		<tr>
			<td>아이디 : </td>
			<td><input type="text" name="dataid" id="dataid"></td>
		</tr>
		<tr>
			<td>비밀번호 : </td>
			<td><input type="text" name="datapw" id="datapw"></td>
		</tr>
		<tr>
			<td>이름 : </td>
			<td><input type="text" name="dataname" id="dataname"></td>
		</tr>
		<tr>
			<td colspan="2">
				<button type="button" id="getbtn">GET</button>
				<button type="button" id="get_spring_btn">GET SPRING</button>
				<button type="button" id="post_spring_btn">POST SPRING</button>
				<button type="button" id="post_spring_btn_111">POST SPRING 111</button>
			</td>
		</tr>	
	</table>
</form>
</body>
</html>